//Recebendo o tipo de cliente (E- Empresa, P- Particular) e o valor do parqueamento so e se o cliente for Empresa.
import java.io.*;
public class programa5{
	public static void main (String []args)throws IOException{
		char tipo;
		float valor;
		final float IVA=0.17f;

		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Introduza o tipo (E- Empresa ou P- Particular)");
		tipo=x.readLine().charAt(0);

		System.out.println("Introduza o valor");
		valor=Float.parseFloat(x.readLine());

		if(tipo=='E'){
			valor=valor+(valor*IVA);
		}
		System.out.println("O valor e: "+valor+" MT");
	}
}