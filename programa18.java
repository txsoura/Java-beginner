//calcular media de N inteiros fornecidos pelo utilizador
import java.io.*;
public class programa18{
	public static void main (String []args) throws IOException{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

		float media;
		int qtd,num, contador=1,soma=0;

		System.out.println("quantos numeros sao?");
		qtd=Integer.parseInt(x.readLine());

		while(contador<=qtd){
			System.out.println("Digite "+contador+"o numero");
			num=Integer.parseInt(x.readLine());
			soma+=num;
			contador ++;
		}

		media=soma/qtd;
		System.out.println("A media e "+media);
	}
}