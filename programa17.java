//receber o digito (1-12) e visualizar o respectivo mes
import java.io.*;
public class programa17{
	public static void main (String[]args)throws IOException{
		int i;

		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite o numero do mes");
		i=Byte.parseByte(x.readLine());

		switch(i){
			case 1: System.out.println("O mes de "+i+" e Janeiro");break;
			case 2: System.out.println("O mes de "+i+" e Fevereiro");break;
			case 3: System.out.println("O mes de "+i+" e Marco");break;
			case 4: System.out.println("O mes de "+i+" e Abril");break;
			case 5: System.out.println("O mes de "+i+" e Maio");break;
			case 6: System.out.println("O mes de "+i+" e Junho");break;
			case 7: System.out.println("O mes de "+i+" e Julho");break;
			case 8: System.out.println("O mes de "+i+" e Agosto");break;
			case 9: System.out.println("O mes de "+i+" e Setembro");break;
			case 10: System.out.println("O mes de "+i+" e Outubro");break;
			case 11: System.out.println("O mes de "+i+" e Novembro");break;
			case 12: System.out.println("O mes de "+i+" e Dezembro");break;
			default: System.out.println("O numero e invalido");break;
		}
	}
}