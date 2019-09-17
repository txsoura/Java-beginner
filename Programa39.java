//Victor Tesoura : 20180408 | Turma B
//Mulltiplicar dois arrays de comprimento igual de 5 posicoes
//Criar atraves do resultado o 3o array
//O 1o array e de numeros naturais
//O 2o array e de numeros aleatorios de 0 a 50
//visualizar os arrays

import java.io.*;
import java.util.Random;

public class Programa39{
 public static void main (String []args)throws IOException{
  menu();
 }


     //metodo Menu
	public static void menu()throws IOException{
		int opc,qtd=0;
         int [] pri=null,  seg=null, ter=null;
         boolean privar=false,privar2=false;


		do{
			//chamar metodo opcao
			opc=opcao();

			switch(opc){
				//opcao 1
				case 1:
				System.out.println("Digite a quantidade de valores");
				     qtd= validar();
                       privar2=true;
				break;

				//opcao 2
				case 2:
				if(privar2==false){
						privar();
					}else{
					pri=primeiro((int)qtd);
					seg=segundo((int)qtd);

					}
				break;

				//opcao 3
				case 3:
				if(privar2==false){
						privar();
					}else{
					ter=terceiro((int)qtd,pri,seg);
                      privar=true;
					}
				break;

				//opcao 4
				case 4:
				if(privar==false){
						privar();
					}else{
				visualizar(ter, pri, seg);
				}
				break;

				//opcao 5
				case 5:
				break;

				default: System.out.println("Numero invalido");break;
			}
		}while(opc!=5);
	}

	//metodo para validar o menu
	public static int opcao()throws IOException{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int opc;
		do{
			System.out.println("***************MENU***************");
			System.out.println("1.Introduzir a quantidade\n2.Introduzir os valores\n3.Calcular os valores\n4.Visualizar os valores\n5.Sair");
			System.out.println("*********** Valores ***********");
			opc=Integer.parseInt(bf.readLine());
			if(opc<1 || opc>5){
				System.out.println("Opcao invalida");
			}
		}while(opc<1 || opc>5);

		return opc;
	}

	//metodo para validar valores
	public static int validar()throws IOException{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
     int v;
     do{
      v=Integer.parseInt(bf.readLine());
      if(v<1){
       System.out.println("Valor invalido");
      }
     }while(v<1);
     return v;
	}

     //metodo para criar Array e receber valores
	public static int [] primeiro(int qtd) throws IOException{
        int [] primeiro=new int [qtd];

        for(int i=0; i<qtd; i++){
           System.out.println("Digite o "+(i+1)+"o valor");
		   int valor=validar();

		   primeiro[i]=valor;
        }
        return primeiro;
	}

	//metodo para criar Array e numeros aleatorios
	public static int [] segundo(int qtd) throws IOException{
        int [] segundo=new int [qtd];
        Random r= new Random();

        for(int i=0; i<qtd; i++){
		   int valor=r.nextInt(50);

		   segundo[i]=valor;
        }
        return segundo;
	}

	//metodo para criar Array e calcular
	public static int [] terceiro(int qtd,int []primeiro,int []segundo) throws IOException{
        int [] terceiro=new int [qtd];

        for(int i=0; i<qtd; i++){
		   int valor=primeiro[i]*segundo[i];

		   terceiro[i]=valor;
        }
        return terceiro;
	}
	//metodo para visualizar array
	public static void visualizar(int []terceiro,int []primeiro,int []segundo)throws IOException{
        for(int i=0; i<primeiro.length;i++){
         System.out.println(primeiro[i]+" * "+segundo[i]+" = "+terceiro[i]);
        }
	}

 	//metodo para visualizar mensagem privar
	public static void privar(){
		System.out.println("Opcao indisponivel, primeiro tem de entrar na opcao 1 e 2");
	}
}