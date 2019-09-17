//Victor Tesoura Junior: 20180408 | Turma B
//Faca um programa que armazena num array o tipo de sessão ( M-manha, T- Tarde, N - Noite) de primeiros 30 clientes em uma bilheteira.
//O programa igualmente deve permitir as seguintes tarefas:
//-Visualizar dados armazenados no array.
//-Determinar a valor total ganho pela bilheteira e por cada sessao sendo ( M-manha - 250mt, T- Tarde - 340mt, N - Noite 420mt)
//-Determinar a quantidade de bilhetes vendidos total e por cada sessao
//-Determinar para qual sessao vendeu-se mais bilhetes.
//Obs: aplique divisao em metodos, sem esquecer validar todos dados de entrada.

import java.io.*;
import java.text.DecimalFormat;

public class programa37{

    public static void main (String[]args)throws IOException{
        menu();
    }

 //metodo Menu
	public static void menu()throws IOException{
		byte opc;
		DecimalFormat df=new DecimalFormat("###,##0.00 MT");
         char [] sessoes=null;
         boolean privar=false;


		do{
			//chamar metodo opcao
			opc=opcao();

			switch(opc){
				//opcao 1
				case 1:
				     sessoes= criar();
                       privar=true;
				break;

				//opcao 2
				case 2:
				if(privar==false){
						privar();
					}else{
					ver(sessoes);
					}
				break;

				//opcao 3
				case 3:
				if(privar==false){
						privar();
					}else{
					arrecadado(sessoes);
					}
				break;

				//opcao 4
				case 4:
				if(privar==false){
						privar();
					}else{
				     bilhetes(sessoes);
				     }
				break;
				//opcao 5
				case 5:
				if(privar==false){
						privar();
					}else{
				     aderencia(sessoes);
				     }
				break;
				//opcao 6
				case 6:
				     programador();
				break;
				//opcao 7
				case 7:
				break;

				default: System.out.println("Numero invalido");break;
			}
		}while(opc!=7);
	}

	//metodo para validar o menu
	public static byte opcao()throws IOException{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		byte opc;
		do{
			System.out.println("***************MENU***************");
			System.out.println("1.Vender bilhete\n2.Ver bilhetes vendidos\n3.Ver o total arrecadado\n4.Ver o numero de bilhetes vendidos\n5.Ver sessao com maior aderencia\n6. Informacoes do programar\n7. Sair");
			System.out.println("*********** Bilheteira ***********");
			opc=Byte.parseByte(bf.readLine());
			if(opc<1 || opc>7){
				System.out.println("Opcao invalida");
			}
		}while(opc<1 || opc>7);

		return opc;
	}

	//metodo para validar as entradas
	public static char validar()throws IOException{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		char n;
		do{
			n=bf.readLine().charAt(0);
			if(n!='m' && n!='M' && n!='t' && n!='T' && n!='n' && n!='N'){
				System.out.println("Invalido");
				}
		}while(n!='m' && n!='M' && n!='t' && n!='T' && n!='n' && n!='N');

		return n;
	}

	//metodo para criar Array
	public static char [] criar() throws IOException{
	DecimalFormat df=new DecimalFormat("###,##0.00 MT");
	    short PMANHA=250, PTARDE=340, PNOITE=420;
        char [] sessoes=new char [30];

        for(int i=0; i<30; i++){
           System.out.println("Escolha a sessao: M :Manha("+df.format(PMANHA)+"), T :Tarde("+df.format(PTARDE)+"), N :Noite("+df.format(PNOITE)+")");
		   char sessao=validar();

		   sessoes[i]=sessao;
        }
        return sessoes;
	}

	//metodo para ver os bilhetes vendidos
	public static void ver(char []sessoes) throws IOException{
	 for(int i=0; i<30; i++){
	  System.out.println(sessoes[i]);
	 }
	}

	//metodo para ver o valor arrecadado
	public static void arrecadado(char []sessoes) throws IOException{
	DecimalFormat df=new DecimalFormat("###,##0.00 MT");
	short PMANHA=250, PTARDE=340, PNOITE=420;
	byte m=0, t=0, n=0;
	 for(int i=0; i<30; i++){
	  if(sessoes[i]=='m' || sessoes[i]=='M'){
	     m++;
	  } else
	  if (sessoes[i]=='t' || sessoes[i]=='T'){
	     t++;
	  }else{
	   n++;
	  }
	 }

	 System.out.println("Na sessao da manha foi arrecadado:"+df.format(m*PMANHA));
	 System.out.println("Na sessao da tarde foi arrecadado:"+df.format(t*PTARDE));
	 System.out.println("Na sessao da noite foi arrecadado:"+df.format(n*PNOITE));
	 System.out.println("======================================================");
	 System.out.println("No total foi arrecadado:"+df.format((m*PMANHA)+(t*PTARDE)+(n*PNOITE)));
	}

	//metodo para ver o numero de bilhetes vendidos
	public static void bilhetes(char []sessoes) throws IOException{
	byte m=0, t=0, n=0;
	 for(int i=0; i<30; i++){
	  if(sessoes[i]=='m' || sessoes[i]=='M'){
	     m++;
	  } else
	  if (sessoes[i]=='t' || sessoes[i]=='T'){
	     t++;
	  }else{
	   n++;
	  }
	 }

	 System.out.println("Na sessao da manha foram vendidos:"+m+" bilhetes");
	 System.out.println("Na sessao da tarde foram vendidos:"+t+" bilhetes");
	 System.out.println("Na sessao da noite foram vendidos:"+n+" bilhetes");
	 System.out.println("======================================================");
	 System.out.println("No total foram vendidos:"+(m+t+n)+" bilhetes");
	}

	//metodo para ver sessao com maior aderencia
	public static void aderencia(char []sessoes) throws IOException{
	byte m=0, t=0, n=0;
	 for(int i=0; i<30; i++){
	  if(sessoes[i]=='m' || sessoes[i]=='M'){
	     m++;
	  } else
	  if (sessoes[i]=='t' || sessoes[i]=='T'){
	     t++;
	  }else{
	   n++;
	  }
	 }

	 if(m>t && m>n){
	    	 System.out.println("A sessao da manha teve maior aderecencia");
	 }else
	 if (t>m && t>n){
	     System.out.println("A sessao da tarde teve maior aderecencia");
	 }else
     if(n>m && n>t){
	     System.out.println("A sessao da noite teve maior aderecencia");
	 }else
     if(n==m && n>t){
	     System.out.println("A sessao da noite e manha tiveram maior aderecencia");
	 }else
     if(t==m && t>n){
	     System.out.println("A sessao da tarde e manha tiveram maior aderecencia");
	 }else
     if(n==t && n>t){
	     System.out.println("A sessao da noite e tarde tiveram maior aderecencia");
	 }else{
	     System.out.println("Nenhuma sessao teve maior aderencia");
	 }
	}

	//metodo para visualizar os dados do programador
	public static void programador(){
		System.out.println("Victor Tesoura Junior | 20180408 | Turma B | 1o Ano ");
	}

	//metodo para visualizar mensagem privar
	public static void privar(){
		System.out.println("Opcao indisponivel, primeiro tem de entrar na opcao 1");
	}
}