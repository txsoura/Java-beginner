//validacao de dados
import java.io.*;
public class programa20{
	public static void main (String[]args)throws IOException{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

		byte h;
		do{
			System.out.println("Digite o numero de horas trabalhadas");
			h=Byte.parseByte(x.readLine());
			if(h<0 || h>12){
				System.out.println("Numero de horas invalida, tem de ser de (0 - 12)");
			}
		}while(h<0 || h>12);
		System.out.println("Trabalhou: "+h+" horas.");
	}
}