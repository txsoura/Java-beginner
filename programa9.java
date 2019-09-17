//faca um programa, para uma cantina.
//deve receber o valor a pagar e o troco (tendo em conta que paga-se com nota de 1000mt)
//deve retirar 5% de gorgeta
import java.io.*;
public class programa9{
	public static void main (String[]args) throws IOException{
		float valor,troco,gorjeta;
		final float GORJETA=0.05f;

		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("*************************************Bem vindo a cantina Sara*******************************************");
		System.out.println("Digite o valor a pagar");
		valor=Float.parseFloat(x.readLine());

		gorjeta=valor*GORJETA;
		troco=1000-valor-gorjeta;

		System.out.println("O valor a pagar e: "+valor+" MT");
		System.out.println("O valor da gorjeta e: "+gorjeta+" MT");
		System.out.println("O seu troco e: "+troco+" MT");
	}
}