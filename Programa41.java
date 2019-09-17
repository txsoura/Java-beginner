//fazer metodo recursivo com formula de febonacci
import java.io.*;
public class Programa41{
 public static void main (String[]args)throws IOException{
 int v=validar();
 int f=fibonacci(v);
   System.out.println("O numero e "+f);
 }

 public static int fibonacci (int n){
   if(n == 0)
        return 0;
    else if(n == 1)
      return 1;
   else
      return fibonacci(n - 1) + fibonacci(n - 2);
 }

 //metodo para validar valores
	public static int validar()throws IOException{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	int v;
     do{
     System.out.println("Digite o valor");
      v=Integer.parseInt(bf.readLine());
      if(v<0){
       System.out.println("Valor invalido");
      }
     }while(v<0);
     return v;
	}
}