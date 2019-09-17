//Defesa
//Victor Tesoura Junior | 20180408 | Turma B | 1o Ano | txsoura@gmail.com
import java.io.*;
import java.text.DecimalFormat;
public class VictorTesoura_Defesa{
	public static void main (String[]args)throws IOException{
		menu();
	}
	public static void menu()throws IOException{
		byte diferenca=0,per=0;
		int cod=0,opc,lev=0,dev=0;
		///Defesa 3**************************************************************************************************************
		float preco=0,penalizacao=0,total=0,lucro=0,despesa;
		boolean privar1=false,privar2=false,privar3=false,privar4=false;

		do{

			//menu com validacao
			opc=opcao();

			switch(opc){
				//opcao 1
				case 1:
					privar1=true;
					System.out.println("Digite o codigo da cassete");
					cod=validar(111,999);
					System.out.println("***\nDigite o preco da cassete");
					preco=validarpreco((float)100.00,(float)999.00);
					System.out.println("***\nDigite a data de levantamento da cassete");
					lev=validar((int)1,(int)30);
					System.out.println("***\nDigite a data de devolucao da cassete");
					dev=validar((int)lev,(int)30);
				break;

				//opcao 2
				case 2:
					if(privar1==false){
						privar((byte)1);
					}else{
						privar2=true;
						///Defesa 2**************************************************************************************************************
						diferenca=(byte)(dev-lev);
						calcdiferenca(diferenca);
					}
				break;

				//opcao 3
				case 3:
					if(privar2==false){
						privar((byte)2);
					}else{
						privar3=true;
						if(diferenca>10){
							per=3;
							penalizacao=calcpenalizacao(0.03f,preco);
						}else if(diferenca>6){
							per=2;
							penalizacao=calcpenalizacao(0.02f,preco);
						}else if(diferenca>3){
							per=1;
							penalizacao=calcpenalizacao(0.01f,preco);
						}
						tabela(cod,preco,lev,dev,diferenca,per,penalizacao);
						///Defesa 1**************************************************************************************************************
						lucro+=preco+penalizacao;
					}
				break;

				//opcao 4
				case 4:
					if(privar3==false){
						privar((byte)3);
					}else{
						///Defesa 1**************************************************************************************************************
						total+=penalizacao;
						valtotal(total);
						privar3=true;
					}
				break;

				//opcao 5
				case 5:
					programador();
				break;

				///Defesa 3**************************************************************************************************************
				//opcao 6
				case 6:
				if(privar4==false){
					privar((byte)4);
				}else{
					despesa=validardespesa();
					calclucro(despesa,lucro);
				}
				break;
				
				//opcao 7
				case 7: System.exit(0);break;

				default: System.out.println("Opcao invalida");break;
			}

		}while(opc!=7);
	}

	//metodo para validar menu
	public static byte opcao()throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		byte opc;
		///Defesa 3**************************************************************************************************************
		do{
			System.out.println("======================MENU======================");
			System.out.println("1. Introduzir dados da cassete\n2. Calcular os dias em que a cassete foi usada\n3. Visualizar relatorio em forma de tabela\n4. Valor total das penalizacoes\n5. Infomacao do programador\n6. Calcular Lucro da empresa\n7. Sair do programa");
			System.out.println("================================================");
			opc=Byte.parseByte(bf.readLine());
			if(opc<1 || opc>7){
				System.out.println("Opcao invalida");
			}
		}while(opc<1 || opc>7);

		return opc;
	}

	//metodo para validar int
	public static int validar(int min,int max)throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int val;
		do{
			val=Integer.parseInt(bf.readLine());
			if(val<min || val>max){
				System.out.println("Valor invalido, tem de ser de "+min+" a "+max);
			}
		}while(val<min || val>max);

		return val;
	}
	
	///Defesa 3**************************************************************************************************************
	//metodo para validar despesa
	public static float validardespesa()throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		float despesa;
		do{
			System.out.println("Digite a despesa da empresa");
			despesa=Float.parseFloat(bf.readLine());
			if(despesa<=0){
				System.out.println("Valor invalido, tem de ser maior que 0");
			}
		}while(despesa<=0);
		
		return despesa;
	}
	///Defesa 3**************************************************************************************************************
	//metodo para calcular o lucro
	public static void calclucro(float despesa, float lucro){
		DecimalFormat df=new DecimalFormat("###,##0.00 Mt");
		float calc=lucro-despesa;
		if(lucro>=despesa){
			System.out.println("A empresa teve um lucro de "+df.format(calc));
		}else{
			System.out.println("A empresa teve uma perda de "+df.format(calc));
		}
	}

	//metodo para validar float
	public static float validarpreco(float min,float max)throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		float val;
		do{
			val=Float.parseFloat(bf.readLine());
			if(val<min || val>max){
				System.out.println("Valor invalido, tem de ser de "+min+" a "+max);
			}
		}while(val<min || val>max);

		return val;
	}

	//metodo para visualizar mensagem privar
	public static void privar(byte opc){
		System.out.println("Opcao indisponivel, primeiro tem de entrar na opcao "+opc);
	}

	///Defesa 2**************************************************************************************************************
	//metodo para calcular a diferenca de dias
	public static void calcdiferenca (byte diferenca){
		System.out.println("A cassete foi usada "+diferenca+" dias");
	}

	//metodo para calcular a penalizacao
	public static float calcpenalizacao(float taxa,float preco){
		float penalizacao=preco*taxa;

		return penalizacao;
	}

	//metodo para visualizar tabela
	public static void tabela(int cod,float preco,int dev, int lev,byte diferenca, int per, float penalizacao){
		DecimalFormat df=new DecimalFormat("###,##0.00 Mt");
		System.out.println("================================================================================================");
		System.out.println("| Codigo |   Preco   | Levantamento | Devolucao | Diferenca | Penalizacao(%) | Penalizacao(Mt) |");
		System.out.println("================================================================================================");
		System.out.printf("%2s%6d%3s%9s%3s%12s%3s%9s%3s%9s%3s%14d%3s%15s%2s","| ",cod," | ",df.format(preco)," | ","Dia "+lev," | ","Dia "+dev," | ",dev+" dias"," | ",per," | ",df.format(penalizacao)," |\n");
		System.out.println("================================================================================================");
	}

	///Defesa 1**************************************************************************************************************
	//metodo para visualizar o valor total de penalizacao
	public static void valtotal (float total){
		DecimalFormat df=new DecimalFormat("###,##0.00 Mt");
		System.out.println("O valor total de penalizacao e de: "+df.format(total));
	}

	//metodo para visualizar os dados do programador
	public static void programador(){
		System.out.println("Victor Tesoura Junior | 20180408 | Turma B | 1o Ano | txsoura@gmail.com");
	}
}