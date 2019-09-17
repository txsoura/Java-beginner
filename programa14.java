//calcular o valor a pagar de renda, recebendo o tipo (P-particular ou E-empresa), a quantidade de meses. se for empresa paga 17% a mais.
import java.io.*;
public class programa14{
	public static void  main (String[]args)throws IOException{
		char tipo;
		byte mes;
		double val, total;
		final float DES=0.17f;
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite o tipo(E/P)");
		tipo=x.readLine().charAt(0);

		System.out.println("Digite o valor");
		val=Double.parseDouble(x.readLine());

		System.out.println("Digite o numero de meses");
		mes=Byte.parseByte(x.readLine());

		total=val*mes;

		if(tipo=='e' || tipo=='E'){
			total=total+(total*DES);
		}

		System.out.println("O valor a pagar sao: "+total+" MT");
	}
}