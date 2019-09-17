//fazer programa para validar
//idade- 1 a 100, salario- >0, processador-(1,2,3,4) e genero- M/F
import java.io.*;
public class programa24{
	public static void main(String[]args)throws IOException{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		float salario;
		byte idade, processador;
		char genero;

		do{
		   System.out.println("Digite o seu salario");
		   salario=Float.parseFloat(x.readLine());
           if(salario<=0){
            System.out.println("O salario nao pode ser menor ou igual a 0");
            }
		}while(salario<=0);

		do{
		   System.out.println("Digite a sua idade");
		   idade=Byte.parseByte(x.readLine());
           if(idade<1 || idade >100){
            System.out.println("A idade nao pode ser menor que 1 ou maior que 100");
            }
		}while(idade<1 || idade >100);

		do{
		   System.out.println("Digite o processador");
		   processador=Byte.parseByte(x.readLine());
           if(processador!=1 && processador!=2 && processador!=3 && processador!=4){
            System.out.println("O processador e de 1 a 4");
            }
		}while(processador!=1 && processador!=2 && processador!=3 && processador!=4);

		do{
		System.out.println("Digite o seu genero");
		   genero=x.readLine().charAt(0);
           if(genero!='M' && genero!='m' && genero!='F' && genero!='f'){
            System.out.println("O sexo so pode ser M ou F");
            }
		}while(genero!='M' && genero!='m' && genero!='F' && genero!='f');

		System.out.println("O seu salario e: "+salario);
		System.out.println("A sua idade e: "+idade);
		System.out.println("O seu processador e: "+processador);
		System.out.println("O seu genero e: "+genero);
	}
}