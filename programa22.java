//fazer programa que calcula a media de N alunos de uma turma. Deve pedir a nota dos 2 testes, calcular a media do estudante.
//O N e a nota devem ser validados.
import java.io.*;
public class programa22{
 public static void main (String[]args) throws IOException{
  BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
  int n,c=1;
  float n1,n2,media,turma=0;

  //receber o N
  do{
   System.out.println("Digite o numero de alunos da turma\n____________________________________________");
   n=Integer.parseInt(x.readLine());
   if(n<=0){
     System.out.println("O numero de alunos da turma nao pode ser menor e igual a zero");
   }
  }while(n<=0);

  //ciclo de repeticao
  while(c<=n){
	//receber a 1a nota
   do{
   System.out.println("*********************************************\nDigite a 1a nota do "+c+"o aluno da turma");
   n1=Float.parseFloat(x.readLine());
   if(n1<0||n1>20){
     System.out.println("A nota nao pode ser menor que zero e maior que 20");
   }
  }while(n1<0||n1>20);

  //receber a 2a nota
   do{
   System.out.println("Digite a 2a nota do "+c+"o aluno da turma");
   n2=Float.parseFloat(x.readLine());
   if(n2<0||n2>20){
     System.out.println("A nota nao pode ser menor que zero e maior que 20");
   }
  }while(n2<0||n2>20);

  //media do aluno
  media=(n1+n2)/2;
  System.out.println("A media do "+c+"o aluno da turma e: "+media+"\n____________________________________________");
  turma=(turma+media);

  //incremento do contador
   c++;
  }
  turma=turma/n;
  System.out.println("A media da turma e: "+turma);
 }
}