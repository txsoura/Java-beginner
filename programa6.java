//receber idade em anos e visualizar em meses, semanas e dias
import java.io.*;
public class programa6{
	public static void main(String []args) throws IOException{
		int idade,mes,semana,dia;

		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite a sua idade");
		idade=Byte.parseByte(x.readLine());

		mes=idade*12;
		semana=mes*4;
		//dia=semana*7; sera 336 dias
		dia=idade*365;

		System.out.println("Ja viveu "+mes+" meses");
		System.out.println("Ja viveu "+semana+" semanas");
		System.out.println("Ja viveu "+dia+" dias");
	}
}