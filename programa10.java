//calcular o valor total a pagar (IVA incluso) na compra de N computadores de preco P, com desconto de 5%.
//(Os valores de N e P devem ser recebidos via teclado e considere o IVA 17%)
import java.io.*;
public class programa10{
	public static void main (String[]args) throws IOException{
		final float IVA=0.17f;
		final float DESCONTO=0.05f;
		byte comp;
		float preco,total,iva,valor,desconto;

		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite o numero de computadores");
		comp=Byte.parseByte(x.readLine());

		System.out.println("Digite o preco de cada computador");
		preco=Float.parseFloat(x.readLine());

        valor=comp*preco;
		desconto=valor*DESCONTO;
		iva=desconto*IVA;
		total=valor-desconto+iva;
		System.out.println("O valor e: "+valor);
		System.out.println("O valor do desconto e: "+desconto);
		System.out.println("O valor do IVA e: "+iva);
		System.out.println("O valor total e: "+total);
	}
}