//fazer programa que soma os primeiros 100 numeros naturais
public class programa21{
 public static void main (String[]args){
  int c=1, soma=0;

  while(c<=100){
   soma+=c;
   c++;
  }
  System.out.println("A soma de 100 numeros naturais e: "+soma);
 }
}