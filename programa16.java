//receber a altura do estudante e visualizar se e alto(>1.75), medio(>=1.5,<1.75) e baixo(<1.5)
import java.io.*;
public class programa16{
	public static void  main (String[]args)throws IOException{
		float altura;
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite a altura");
		altura=Float.parseFloat(x.readLine());

		if(altura>=1.75){
			System.out.println("E alto");
		}else if(altura>=1.5){
			System.out.println("E medio");
		}else{
			System.out.println("E baixo");
		}
	}
}