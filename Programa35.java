/**
*Faca um programa completo com menu para o Debonairs Pizza. Devera receber o sabor da pizza (M- margarita (350), P- portuguesa (400) ou H- hawaiana (500))
* e a quantidade, calcular as quantidades totais de cada, os valores totais recebidos por cada sabor.
*O valor total deve ser comparado com as despesas, sabendo que a renda sao 20000, mais 10000 em salarios.
*Formatar os valores monetarios com MT e USD (O valor do cambio e 65).
*O Menu:
*1. receber o sabor da pizza e quantidade
*2. visualizar a quantidade total de cada
*3. visualizar valor total de cada
*4. visualizar valor total recebido em meticais
*5. visualizar valor total recebido em dolares
*6. resumo da caixa
*7. dados do programador
*8. sair do programa
* Utilizar metodos e passagem de parametros, com validacao de total entradas
* **/
import java.io.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
public class Programa35{
	static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	static DecimalFormat df=new DecimalFormat("###,##0.00 MT");
	public static void main (String[]args)throws IOException{
		menu();
	}

	//metodo Menu
	public static void menu()throws IOException{
		byte opc,qtd,p=0,h=0,m=0;
		char sabor;
		int vp=0,vh=0,vm=0,pagar=0,total;
		final int PORTUGUESA=400, HAWAIANA=500, MARGARITA=350;

        
		do{
			total=totalg(vm,vp,vh);
			//chamar metodo opcao
			opc=opcao();

			switch(opc){
				//opcao 1
				case 1:
					sabor=osabor();
					qtd=quantidade();

					switch(sabor){
								case 'M' | 'm':
									m+=qtd;
									pagar=apagar(qtd,MARGARITA);
									vm+=pagar;
								break;
								case 'H' | 'h':
									h+=qtd;
									pagar=apagar(qtd,HAWAIANA);
									vh+=pagar;
								break;
								case 'P' | 'p':
									p+=qtd;
									pagar=apagar(qtd,PORTUGUESA);
									vp+=pagar;
								break;
								default:System.out.println("Opcao invalida");break;
							}
						tabela(sabor,qtd,pagar);

				break;

				//opcao 2
				case 2:
					quantidade(m,p,h);
				break;

				//opcao 3
				case 3:
					total(vm,vp,vh);
				break;

				//opcao 4
				case 4:
					metical(total);
				break;

				//opcao 5
				case 5:
					dolar(total);
				break;

				//opcao 6
				case 6:
					situacao(total);
				break;

				//opcao 7
				case 7:
					programador();
				break;

				//opcao 8
				case 8:
					System.exit(0);
				break;

				default: System.out.println("Numero invalido");break;
			}
		}while(opc!=8);
	}

	//metodo para validar o menu
	public static byte opcao()throws IOException{
		byte opc;
		do{
			System.out.println("***************MENU***************");
			System.out.println("1. Receber o sabor e a quantidade\n2. Visualizar a quantidade total de cada pizza\n3. Visualizar o valor total de cada pizza\n4. Visualizar o valor total recebido em MT\n5. Visualizar o valor total recebido em USD\n6. Resumo do caixa\n7. Dados programador\n8. Sair");
			System.out.println("**********Debonairs Pizza**********");
			opc=Byte.parseByte(bf.readLine());
			if(opc<1 || opc>8){
				System.out.println("Numero invalido");
			}
		}while(opc<1 || opc>8);

		return opc;
	}

	//metodo para validar o sabor
	public static char osabor() throws IOException{
		char sabor;
		do{
			System.out.println("Introduza o sabor da Pizza [M- margarita (350,00 MT), P- portuguesa (400,00 MT) ou H- hawaiana (500,00 MT)]");
			sabor=bf.readLine().charAt(0);
			if(sabor!='m' && sabor!='M' && sabor!='p' && sabor!='P' && sabor!='h' && sabor!='H'){
				System.out.println("Opcao invalido");
			}
		}while(sabor!='m' && sabor!='M' && sabor!='p' && sabor!='P' && sabor!='h' && sabor!='H');

		return sabor;
	}

	//metodo para validar a quantidade
	public static byte quantidade()throws IOException{
		byte qtd;
		do{
			System.out.println("Introduza a quantidade de Pizza");
			qtd=Byte.parseByte(bf.readLine());
			if(qtd<1 ){
				System.out.println("Quantidade invalido");
				}
		}while(qtd<1);

		return qtd;
	}

	//metodo para calcular o valor a pagar
	public static int apagar(byte qtd, int tipo){
		int pagar=qtd*tipo;

		return pagar;
	}

	//metodo para visualizar a tabela
	public static void tabela(char sabor, byte qtd, int pagar){
		System.out.println("======================================");
		System.out.println("| Pizza | Quantidade | Valor a Pagar |");
		System.out.println("======================================");
		System.out.printf("%2s%5c%3s%10d%3s%13s%2s","| ",sabor," | ",qtd," | ",df.format(pagar)," |\n");
		System.out.println("======================================");
	}

	//metodo para visualizar a quantidade de cada
	public static void quantidade(byte m, byte p, byte h){
		System.out.println("Foram vendidas:");
		System.out.println(m+" Margaritas, "+p+" Portuguesas e "+h+" Hawaianas.");
	}

	//metodo para visualizar o valor total de cada
	public static void total(int vm, int vp, int vh){
		System.out.println("O valor vendido de cada e de: ");
		System.out.println(df.format(vm)+" Margarita, "+df.format(vp)+" Portuguesa e "+df.format(vh)+" Hawaiana.");
	}

	//metodo para visualizar o valor total em meticais
	public static void metical(int total){
		System.out.println("O valor total vendido e de: ");
		System.out.println(df.format(total));
	}

	//metodo para visualizar o valor total em dolares
	public static void dolar(int total){
		NumberFormat nf= NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("O valor total vendido e de: ");
		System.out.println(nf.format((double)(total)/65));
	}

	//metodo para visualizar a situacao das despesas
	public static void situacao(int total){
		final int despesas=30000;
		if((total)>=despesas){
			System.out.println("Cumpriu-se com a meta, e obteve-se um lucro de "+df.format(total-despesas));
		}else{
			System.out.println("Nao cumpriu-se com a meta, e obteve-se uma perda de "+df.format(total-despesas));
		}
	}

	//metodo para visualizar os dados do programador
	public static void programador(){
		System.out.println("Victor Tesoura Junior | 20180408 | Turma B | 1o Ano | txsoura@gmail.com");
	}

	//metodo para calcular o total
	public static int totalg(int vm,int vp,int vh){
		int total=vp+vm+vh;

		return total;
	}
}