//Determine o menor numero de notas e moedas de troco para uma compra de 200 MT. Considere o valor da compra como um numero inteiro.
import java.io.*;
public class programa11{
	public static void main(String []args) throws IOException{
		int valor,troco,n100,n50,n20,m10,m5,m2,m1,t;

		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite o valor da compra");
		valor=Integer.parseInt(x.readLine());

		troco=200-valor;

		n100=troco/100;
		t=troco%100;
		n50=t/50;
		t=t%50;
		n20=t/20;
		t=t%20;
		m10=t/10;
		t=t%10;
		m5=t/5;
		t=t%5;
		m2=t/2;
		t=t%2;
		m1=t/1;

		System.out.println("O seu troco e: "+troco);
		System.out.println(n100+" notas de 100, "+n50+" notas de 50, "+n20+" notas de 20, "+m10+" moedas de 10, "+m5+" moedas de 5, "+m2+" moedas de 2, "+m1+" moedas de 1");
	}
}