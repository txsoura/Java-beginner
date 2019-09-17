
import java.io.*;
public class programa29{
	public static void main (String[]args) throws IOException{

		System.out.println("_____________________________");
		System.out.println("| Valor | Quadrado | Cubo   |");
		System.out.println("_____________________________");

		for(byte i=10;i<=100;i+=10){
			System.out.printf("%c%7d%c%10d%c%8d%s",'|',i,'|',(i*i),'|',(i*i*i),"|\n");
		}
        System.out.println("=============================");
	}
}