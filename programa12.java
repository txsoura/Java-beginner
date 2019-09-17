//Sepera os digitos de um algarismo lido do teclado, por exemplo 1234, devera visualizar 1, 2, 3, 4 separadamente (+ dificil)
import java.io.*;
public class programa12{
	public static void main (String[]args)throws IOException{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

		int num;
		System.out.println("Digite o numero");
		num=Integer.parseInt(x.readLine());

		//pegar milhar
		int milhar = num / 1000;
		
		//pegar centena
		num = num % 1000;
		int centena = num / 100;
		
		//pegar dezena
		num = num % 100;
		int dezena = num / 10;
		
		//pegar unidade
		num = num % 10;
		int unidade = num;

		System.out.println(milhar+", "+centena+", "+dezena+", "+unidade);
	}
}