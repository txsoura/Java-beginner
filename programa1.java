import java.io.*;
public class programa1{
	public static void main(String[]args)throws IOException{
		int a,b,soma;
		BufferedReader x= new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Digite o 1o valor");
		a=Integer.parseInt(x.readLine());
		System.out.println(a);
		System.out.println("Digite o 2o valor");
		b=Integer.parseInt(x.readLine());
		System.out.println(b);

		soma=a+b;
		System.out.println("A soma e: "+soma);
	}
}