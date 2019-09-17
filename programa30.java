/**
*Faca um programa para calcular media e visualizar a situacao de 5 alunos. deve pedir nota de 2 testes.
*Usar metodos e passagem de parametros.
* **/
import java.io.*;
public class programa30{
static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[]args)throws IOException{
	float n1,n2,media;
		for(int i=1; i<=5; i++){
			System.out.println("Dados do "+i+"o aluno");
			n1=nota(1);
		    n2=nota(2);
			media=calcular(n1,n2);
            situacao(media);
			System.out.println("__________________________________________\n");
		}
	}


	public static float nota(int v)throws IOException{
	float n;
    	do{
			System.out.println("Digite a nota "+v);
			n=Float.parseFloat(bf.readLine());
			if(n<0 || n>20){
				System.out.println("Nota invalida!. Tem de ser de 0 a 20");
			}
		}while(n<0 || n>20);
		return n;
	}

	public static float calcular(float n1,float n2)throws IOException{
		float media=(n1+n2)/2;
		System.out.println("A media e: "+media);
		return media;
	}
	public static void situacao(float media){
	 if(media>=14){
			System.out.println("Situacao: Despensado");
		}else{
			if(media>=9.5){
				System.out.println("Situacao: Aprovado");
			}else{
				System.out.println("Situacao: Excluido");
			}
		}
	}
}