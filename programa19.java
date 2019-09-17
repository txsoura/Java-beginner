//calcular media de N inteiros fornecidos pelo utilizador
import java.io.*;
public class programa19{
	public static void main (String []args) throws IOException{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

		float media;
		int qtd,num, contador=1,soma=0;

		System.out.println("quantos numeros sao?");
		qtd=Integer.parseInt(x.readLine());

		do{
			System.out.println("Digite "+contador+"o numero");
			num=Integer.parseInt(x.readLine());
			soma+=num;
			contador ++;
		} while(contador<=qtd);

		media=soma/qtd;
		System.out.println("A media e "+media);
	}
}