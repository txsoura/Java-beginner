/**
*Faca um programa com menu para bilheteria de cinema. Deve receber a sessao (M - 250, T - 300 ou N - 350) e a quantidade de bilhetes.
*Pretende-se apresentar a quantidade total para cada sessao, valor total de cada sessao e o valor total recebido pela bilheteira.
*Faca o programa para N clientes, validando todos os dados de entrada, com o segunte menu:
*1. Receber o N
*2. Receber a sessao e contar
*3. Apresentar quantidades de cada sessao
*4. Valor total de cada sessao
*5. Valor total do cinema
*6. Dados do programador
*7. Sair do programa
* **/
import java.io.*;
import java.text.DecimalFormat;
public class programa27{
	public static void main(String[]args) throws IOException{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		final short M=250, T=250, N=350;
		byte opc,n=0,qtd,manha=0,tarde=0,noite=0;
		char sessao;
		boolean passou=false;
		DecimalFormat df=new DecimalFormat("###,##0.00 Mt");

		do{
			//Menu
			do{
				System.out.println("Bem vindo ao Cinema Tesoura\n___________________________________________________________");
				System.out.println("1. Receber a quantidade de clientes\n2. Receber a sessao\n3. Apresentar quantidades de cada sessao\n4. Valor total de cada sessao\n5. Valor total do cinema\n6. Dados do programador\n7. Sair do programa");
				opc=Byte.parseByte(x.readLine());
				if(opc<1 ||opc>7){
					System.out.println("Opcao invalida");
				}
			}while(opc<1 ||opc>7);

			switch(opc){
				//Opcao 1
				case 1:
					//Numero de clientes
					//Validacao
					do{
						System.out.println("Digite o numero de clientes");
						n=Byte.parseByte(x.readLine());
						passou=true;
						if(n<=0){
							System.out.println("O numero de clientes nao pode ser menor ou igaul a 0");
						}
					}while(n<=0);
				break;

				//Opcao 2
				case 2:
				if(passou==false){
					System.out.println("Primeiro tem de passar da opcao 1.");
				}else{
					//Repetir N vezes
						for(int i=1; i<=n;i++){
							//Escolher sessao
							//Validacao
							do{
								System.out.println("Qual e a sessao (M - 250, T - 300 ou N - 350)?");
								sessao=x.readLine().charAt(0);
								if(sessao!='M' &&sessao!='T' &&sessao!='N' &&sessao!='m' &&sessao!='t' &&sessao!='n'){
									System.out.println("A sessao so pode ser (M, T ou N)?");
								}
							}while(sessao!='M' &&sessao!='T' &&sessao!='N' &&sessao!='m' &&sessao!='t' &&sessao!='n');

							//Escolher numero de bilhetes
							//Validacao
							do{
								System.out.println("Qual e o numero de bilhetes?");
								qtd=Byte.parseByte(x.readLine());
								if(qtd<=0){
									System.out.println("O numero de bilhetes nao pode ser menor ou igaul a 0");
								}
							}while(qtd<=0);

							switch(sessao){
								case 'M' | 'm':manha+=qtd;break;
								case 'T' | 't':tarde+=qtd;break;
								case 'N' | 'n':noite+=qtd;break;
								default:System.out.println("Opcao invalida");break;
							}


						}
				}
				break;

				//Opcao 3
				case 3:
					if(passou==false){
						System.out.println("Primeiro tem de passar da opcao 1.");
					}else{
						System.out.println("A sessao M vendeu "+manha+" bilhetes.");
						System.out.println("A sessao T vendeu "+tarde+" bilhetes.");
						System.out.println("A sessao N vendeu "+noite+" bilhetes.");
					}
				break;

				//Opcao 4
				case 4:
					if(passou==false){
						System.out.println("Primeiro tem de passar da opcao 1.");
					}else{
						System.out.println("A sessao M vendeu "+df.format(manha*M));
						System.out.println("A sessao T vendeu "+df.format(tarde*T));
						System.out.println("A sessao N vendeu "+df.format(noite*N));
					}
				break;

				//Opcao 5
				case 5:
				if(passou==false){
						System.out.println("Primeiro tem de passar da opcao 1.");
					}else{
						System.out.println("O cinema vendeu "+df.format(manha+tarde+noite));
					}
				break;

				//Opcao 6
				case 6:
					System.out.println("Victor Tesoura Junior | 20180408 | Turma B | 1o Ano");
				break;

				//Opccao 7
				case 7:
					System.exit(0);
				break;

				//Validar switch-case
				default:
					System.out.println("Opcao invalida");
				break;
			}

		}while(opc!=7);
	}
}