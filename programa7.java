//receber o valor do teclado e apresentrar o seu quadrado e cubo
import java.io.*;
import java.lang.Math.*;

public class programa7{
	public static void main (String[]args) throws IOException{
		int n;
		double quadrado, cubo;

		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite o numero");
		n=Integer.parseInt(x.readLine());

		quadrado=Math.pow(n, 2);
		cubo=Math.pow(n, 3);

		System.out.println("O numero e: "+n);
		System.out.println("O quadrado e: "+quadrado);
		System.out.println("O cubo e: "+cubo);
		System.out.println("O valor de PI e: "+Math.PI);
	}
}