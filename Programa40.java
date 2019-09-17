//Victor Tesoura : 20180408 | Turma B
/*Faca um programa em java, para estacão de abastecimento “PETROMOC”;
O programa atraves de um menu amigavel deverá permitir:
• Receber o nuit do Cliente e o Numero de Litros a abastecer e armazenar em 2 arrays (sendo que O primeiro array contem o Numero de Nuit do Cliente e o Segundo contem o Numero de Litros abastecidos por cada Cliente );
• Visualizar os dados armazenados na forma de 2 Colunas (“nuit do Cliente – Numero de litros”)
• Visualizar o valor total ganho pela PETROMOC, sabendo que o preco por litro do Combustivel -> 68mt;
• Procurar e visualizar o nuit do cliente que abasteceu maior numero de litros;
• Permitir visualizar na ordem decrescente de abastecimento “do Maior número de litros —-> Menor número de litros” os dados armazenados (“nuit do Cliente – no litros”)
NB: Todos os dados de entrada deverão ser validados*/
import java.io.*;
import java.text.DecimalFormat;

public class Programa40{
 public static void main (String []args)throws IOException{
  menu();
 }


     //metodo Menu
	public static void menu()throws IOException{
		System.out.println("Digite a quantidade de clientes");
		int qtd=(int) validar(),opc;
         int [] nuit=new int [qtd];
         float []  litro=new float [qtd];
         boolean privar=false;
         float PRECO=68f;


		do{
			//chamar metodo opcao
			opc=opcao();

			switch(opc){
				//opcao 1
				case 1:
                        for(int i=0; i<qtd; i++){
                         nuit[i]=(int)criarnuit((int)i);
                         litro[i]=criarlitro((int)i);
                        }
                       privar=true;
				break;

				//opcao 2
				case 2:
				if(privar==false){
						privar();
					}else{
				venda(nuit,litro,PRECO);

					}
				break;

				//opcao 3
				case 3:
				if(privar==false){
						privar();
					}else{
					ganho(litro,PRECO);
					}
				break;

				//opcao 4
				case 4:
				if(privar==false){
						privar();
					}else{
					maior(nuit,litro,PRECO);
				}
				break;

				//opcao 5
				case 5:
				if(privar==false){
						privar();
					}else{
					ordem(nuit,litro,PRECO);
				}
				break;
				//opcao 6
				case 6:
				break;

				default: System.out.println("Numero invalido");break;
			}
		}while(opc!=6);
	}

	//metodo para validar o menu
	public static int opcao()throws IOException{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int opc;
		do{
			System.out.println("***************MENU***************");
			System.out.println("1.Efectuar Venda\n2.Visualizar Vendas\n3.Visualizar Ganho\n4.Visualizar o Maior Abastecimento\n5.Visualizar Venda em Ordem\n6.Sair");
			System.out.println("***********  Petromoc  ***********");
			opc=Integer.parseInt(bf.readLine());
			if(opc<1 || opc>6){
				System.out.println("Opcao invalida");
			}
		}while(opc<1 || opc>6);

		return opc;
	}

	//metodo para validar valores
	public static float validar()throws IOException{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	float v;
     do{
      v=Float.parseFloat(bf.readLine());
      if(v<1){
       System.out.println("Valor invalido");
      }
     }while(v<1);
     return v;
	}

     //metodo para criar nuit
	public static int  criarnuit(int i) throws IOException{
           System.out.println("Digite o nuit do "+(i+1)+"o cliente");
		   int nuit=(int)validar();

        return nuit;
	}

	//metodo para criar litros
	public static float criarlitro(int i) throws IOException{
           System.out.println("Digite a quantidade de litros do "+(i+1)+"o cliente");
		   float litros=validar();

        return litros;
	}

	//metodo para visualizar venda
	public static void venda(int [] nuit,float [] litro,float PRECO)throws IOException{
		DecimalFormat mt=new DecimalFormat("###,##0.00 Mt");
		DecimalFormat lt=new DecimalFormat("###,##0.0 Lt");
		System.out.println("=======================================================");
		System.out.println("|   Nuit   |     Quantidade     |        Preco        |");
		System.out.println("=======================================================");

		for(int i=0; i<nuit.length;i++){
		    System.out.printf("%2s%8d%3s%18s%3s%19s%2s","| ",nuit[i]," | ",lt.format(litro[i])," | ",mt.format((litro[i]*PRECO))," |\n");
		}

		System.out.println("=======================================================");
	}

	//metodo para visualizar ganho
	public static void ganho(float []litro,float PRECO)throws IOException{
         float total=0;
		DecimalFormat mt=new DecimalFormat("###,##0.00 Mt");
        for(int i=0; i<litro.length;i++){
         total+=litro[i];
        }
        System.out.println("O total ganho foi de: "+mt.format(total*PRECO));
	}

		//metodo para visualizar maior abastecimento
	public static void maior(int [] nuit,float []litro,float PRECO)throws IOException{
	DecimalFormat mt=new DecimalFormat("###,##0.00 Mt");
		DecimalFormat lt=new DecimalFormat("###,##0.0 Lt") ;
         float aux=0;
         int bux=0;

        for(int i=0; i<litro.length; i++){
        for(int j = 0; j<litro.length-1; j++){
            if(litro[j] < litro[j + 1]){
            //ordenar array de litros
                aux = litro[j];
                litro[j] = litro[j+1];
                litro[j+1] = aux;

             //ordenar array de nuit
                bux = nuit[j];
                nuit[j] = nuit[j+1];
                nuit[j+1] = bux;
                }
            }
        }
        System.out.println("Os dados do cliente que fez o maior abastecimento sao:");
        System.out.println("Nuit: "+nuit[0]+" | Quantidade: "+lt.format(litro[0])+" | Preco: "+mt.format(litro[0]*PRECO));
	}

	//metodo para visualizar ordem decrescente
	public static void ordem(int [] nuit,float []litro,float PRECO)throws IOException{
         float aux;
         int bux;

        for(int i=0; i<litro.length; i++){
        for(int j = 0; j<litro.length-1; j++){
            if(litro[j] < litro[j + 1]){
            //ordenar array de litros
                aux = litro[j];
                litro[j] = litro[j+1];
                litro[j+1] = aux;

             //ordenar array de nuit
                bux = nuit[j];
                nuit[j] = nuit[j+1];
                nuit[j+1] = bux;
                }
            }
        }

        venda(nuit,litro,PRECO);
	}

 	//metodo para visualizar mensagem privar
	public static void privar(){
		System.out.println("Opcao indisponivel, primeiro tem de entrar na opcao 1");
	}
}