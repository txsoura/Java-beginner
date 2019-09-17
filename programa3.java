//fazer programa em java, que recebendo o numero de computadores e o valor pelos computadores.
//deve calcular o valor a pagar, o valor do iva e o valor total, sabendo que iva e 17%.
import java.io.*;
public class programa3{
    public static void main(String[]args) throws IOException{
		final Double IVA=0.17;
		double valor,total, viva, pagar;
		int computador;

		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Digite o numero de computadores");
		computador=Integer.parseInt(x.readLine());

		System.out.println("Digite o valor dos computadores");
		valor=Double.parseDouble(x.readLine());

		total=computador*valor;
		viva=total*IVA;
		pagar=total+viva;

		System.out.println("O valor total e "+total+" MT");
		System.out.println("O valor do IVA e "+viva+" MT");
		System.out.println("O valor a pagar e "+pagar+" MT");
    }
}