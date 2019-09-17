import java.io.*;
public class programa2{
	public static void main(String[]args) throws IOException{
	BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

	int hora,salario, nsalario;

	System.out.println("Digite o numero de horas trabalhadas");
	hora=Integer.parseInt(x.readLine());

	System.out.println("Digite o salario por hora trabalhada");
	salario=Integer.parseInt(x.readLine());

	nsalario=hora*salario;
	System.out.println(nsalario+",00 MT);
	}
}