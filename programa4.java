//fazer programa que recebe tres notas, calcula a media e visualizar a mesma.(visualizar cada nota)
//diminuir 10% na media por falta nas aulas de programacao
import java.io.*;
public class programa4{
	public static void main(String[]args) throws IOException{
	final double DIMINUIR=0.10;
	double n1,n2,n3,media,fmedia;

	BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Digite a nota 1");
	n1=Double.parseDouble(x.readLine());

	System.out.println("Digite a nota 1");
	n2=Double.parseDouble(x.readLine());

	System.out.println("Digite a nota 1");
	n3=Double.parseDouble(x.readLine());

	media=(n1+n2+n3)/3;
	fmedia=media-(media*DIMINUIR);

	System.out.println("Nota 1: "+n1);
	System.out.println("Nota 2: "+n2);
	System.out.println("Nota 3: "+n3);
	System.out.println("Media: "+media);
	System.out.println("Media com desconto: "+fmedia);
	}
}