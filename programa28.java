/**
*Faca um programa para receber N linhas e M colunas, preenchendo com valores aleatorios de 0 a 100. No final devera apresentar a soma dos
*elementos em que a linha e igual a coluna, e apresentar o valor medio de todos os elementos.
* **/
import java.io.*;
public class programa28{
	public static void main (String[]args) throws IOException{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

		byte n,m;
        int valor,soma=0;
		double media=0;

		do{
			System.out.println("Digite o numero de linhas");
			n=Byte.parseByte(x.readLine());
			if(n<=0){
				System.out.println("O numero de linhas nao pode ser menor ou igual a 0");
			}
		}while(n<=0);

		do{
			System.out.println("Digite o numero de colunas");
			m=Byte.parseByte(x.readLine());
			if(m<=0){
				System.out.println("O numero de colunas nao pode ser menor ou igual a 0");
			}
		}while(m<=0);

		for(byte l=0;l<n;l++){

			for(byte c=0;c<m;c++){
			valor=(int)(Math.random()*100);
			System.out.printf("%4s",valor);
			media+=valor;

				if(l==c){
					soma+=valor;
				}
			}
			System.out.println();
		}
		media=media/(m*n);
		System.out.println("A media dos numeros e: "+media);
		System.out.println("A soma do numeros onde a linha e a coluna sao iguais e: "+soma);
	}
}