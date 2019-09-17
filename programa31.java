/**
*Faca um programa com menu para bilheteria de cinema. Deve receber a sessao (M - 250, T - 300 ou N - 350) e a quantidade de bilhetes.
*Pretende-se apresentar a quantidade total para cada sessao, valor total de cada sessao e o valor total recebido pela bilheteira.
*Faca o programa para N clientes, validando todos os dados de entrada, com o segunte menu:
*Sem menu e com metodos
* **/
import java.io.*;
import java.text.DecimalFormat;
public class programa31{
static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[]args) throws IOException{
		char opc;
		byte n;
		do{
			System.out.println("Deseja continuar? (S/N)");
			opc=bf.readLine().charAt(0);
			n=clientes();
		}while(opc!='N' && opc!='n');
	}

	public static byte clientes()throws IOException{
		//Numero de clientes
		//Validacao
		byte n;
		do{
			System.out.println("Digite o numero de clientes");
			n=Byte.parseByte(bf.readLine());
			if(n<=0){
				System.out.println("O numero de clientes nao pode ser menor ou igual a 0");
			}
		}while(n<=0);
		return n;
	}
}