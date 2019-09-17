//Para N alunos, contar quantos sao altos, medios ou baixos
//Validar o N e a altura, usar metodos com paramentos
import java.io.*;
public class programa34{
	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	static byte alto=0, medio=0, baixo=0;

	public static void main (String[]args)throws IOException{
		byte n;
		float alt;
		n=num();
		for (byte i=1; i<=n;i++){
			alt=altura(i);
			situacao(alt);
		}
		visualizar();
	}

	//metodo validar numero de alunos
	public static byte num()throws IOException{
	    byte n;
		do{
			System.out.println("Digite o numero de alunos");
			n=Byte.parseByte(bf.readLine());
			if(n<=0){
				System.out.println("O numero de alunos tem de ser maior que 0");
			}
		}while(n<=0);

		return n;
	}

	//metodo validar altura
	public static float altura(byte i)throws IOException{
	    float alt;
		do{
			System.out.println("*************************\nDigite a altura do "+i+"o aluno");
			alt=Float.parseFloat(bf.readLine());
			if(alt<=0){
				System.out.println("A altura do aluno tem de ser maior que 0");
			}
		}while(alt<=0);

		return alt;
	}

	//metodo visualizar a situacao
	public static void situacao(float alt){
		if(alt>=1.75){
		    alto++;
			System.out.println("E alto");
		}else if(alt>=1.5){
		    medio++;
			System.out.println("E medio");
		}else{
		    baixo++;
			System.out.println("E baixo");
		}
	}

	//visualizar o numero total
	public static void visualizar(){
	    System.out.println("++++++++++++++++++++++++++++\n"+alto+" alunos altos");
		System.out.println(medio+" alunos medios");
		System.out.println(baixo+" alunos baixos");
	}
}