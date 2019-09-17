//Victor Tesoura Junior | 20180408 | Turma B | 1o Ano | txsoura@gmail.com
import java.io.*;
import java.text.DecimalFormat;
public class programa33{
	public static void main (String[]args)throws IOException{
		menu();
	}
	public static void menu()throws IOException{
		byte diferenca=0,per=0;
		int cod=0,opc,lev=0,dev=0;
		float preco=0,penalizacao=0,total=0;
		boolean privar1=false,privar2=false,privar3=false;

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
						diferenca=calcdiferenca(dev,lev);
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
					}
				break;

				//opcao 4
				case 4:
					if(privar3==false){
						privar((byte)3);
					}else{
						total=valtotal(total,penalizacao);
					}
				break;

				//opcao 5
				case 5:
					programador();
				break;

				//opcao 6
				case 6: System.exit(0);break;

				default: System.out.println("Opcao invalida");break;
			}

		}while(opc!=6);
	}

	//metodo para validar menu
	public static byte opcao()throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		byte opc;
		do{
			System.out.println("======================MENU======================");
			System.out.println("1. Introduzir dados da cassete\n2. Calcular os dias em que a cassete foi usada\n3. Visualizar relatorio em forma de tabela\n4. Valor total das penalizacoes\n5. Infomacao do programador\n6. Sair do programa");
			System.out.println("================================================");
			opc=Byte.parseByte(bf.readLine());
			if(opc<1 || opc>6){
				System.out.println("Opcao invalida");
			}
		}while(opc<1 || opc>6);

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

	//metodo para calcular a diferenca de dias
	public static byte calcdiferenca (int dev,int lev){
		byte diferenca=(byte)(dev-lev);
		System.out.println("A cassete foi usada "+diferenca+" dias");

		return diferenca;
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

	//metodo para visualizar o valor total de penalizacao
	public static float valtotal (float total, float penalizacao){
		DecimalFormat df=new DecimalFormat("###,##0.00 Mt");
		total+=penalizacao;
		System.out.println("O valor total de penalizacao e de: "+df.format(total));
		return total;
	}

	//metodo para visualizar os dados do programador
	public static void programador(){
		System.out.println("Victor Tesoura Junior | 20180408 | Turma B | 1o Ano | txsoura@gmail.com");
	}
}