import java.io.*;
public class programa13{
	public static void main (String[]args)thrwos IOException{
		int i;
		double h,b,area;

		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("     MENU     \n**************\n1. Area do Triangulo\n2. Area do Rectangulo\n3. Area do Paralelogramo\n4. Area do Circulo\n5. Area do Losango\n6. Area do Quadrado");
		i=Integer.parseInt(x.readLine());
		
		switc(i){
			case 1: break;
		}
	}
}