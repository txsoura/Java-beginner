//receber o tipo de bilhete (N-normal ou V-vip) e o numero de bilhetes. calcular o valor a pagar (n=500 e v=1000)
import java.io.*;
public class programa15{
	public static void  main (String[]args)throws IOException{
		char tipo;
		byte qtd;
		float total;
		final short N=500, V=1000;
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite o tipo(N/V)");
		tipo=x.readLine().charAt(0);

		System.out.println("Digite o numero de meses");
		qtd=Byte.parseByte(x.readLine());

		if(tipo=='n' || tipo=='N'){
			total=qtd*N;
		}else{
			total=qtd*V;
		}

		System.out.println("O valor a pagar sao: "+total+" MT");
	}
}