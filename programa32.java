//Victor Tesoura Junior | 20180408 | Turma B | 1o Ano | txsoura@gmail.com
import java.io.*;
import java.text.DecimalFormat;
public class programa32{
	public static void main (String[]args)throws IOException{
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		DecimalFormat df=new DecimalFormat("###,##0.00 Mt");
		byte opc,lev=0,dev=0,diferenca=0,per=0;
		int cod=0;
		float preco=0,penalizacao=0,total=0;
		boolean privar1=false,privar2=false,privar3=false;

		do{

			//menu com validacao
			do{
				System.out.println("======================MENU======================");
				System.out.println("1. Introduzir dados da cassete\n2. Calcular os dias em que a cassete foi usada\n3. Visualizar relatorio em forma de tabela\n4. Valor total das penalizacoes\n5. Infomacao do programador\n6. Sair do programa");
				System.out.println("================================================");
				opc=Byte.parseByte(bf.readLine());
				if(opc<1 || opc>6){
					System.out.println("Opcao invalida");
				}
			}while(opc<1 || opc>6);

			switch(opc){
				//opcao 1
				case 1:
					privar1=true;
					//receber o codigo com validacao
					do{
						System.out.println("Digite o codigo da cassete");
						cod=Integer.parseInt(bf.readLine());
						if(cod<111 || cod>999){
							System.out.println("Codigo invalido, tem de ser de 111 a 999");
						}
					}while(cod<111 || cod>999);

					//receber o preco com validacao
					do{
						System.out.println("***\nDigite o preco da cassete");
						preco=Float.parseFloat(bf.readLine());
						if(preco<100.00 || preco>999.00){
							System.out.println("Preco invalido, tem de ser de 100,0 a 999,0");
						}
					}while(preco<100.00 || preco>999.00);

					//receber a data de levantamento com validacao
					do{
						System.out.println("***\nDigite a data de levantamento da cassete");
						lev=Byte.parseByte(bf.readLine());
						if(lev<1 || lev>30){
							System.out.println("Data invalida, tem de ser de 1 a 30");
						}
					}while(lev<1 || lev>30);

					//receber a data de devolucao com validacao
					do{
						System.out.println("***\nDigite a data de devolucao da cassete");
						dev=Byte.parseByte(bf.readLine());
						if(dev<1 || dev>30){
							System.out.println("Data invalida, tem de ser de 1 a 30");
						}
						if(dev<lev ){
							System.out.println("Data invalida, nao pode ser menor que a data de levantamento");
						}
					}while(dev<1 || dev>30 || dev<lev);
				break;

				//opcao 2
				case 2:
					if(privar1==false){
						System.out.println("Primeiro tem de introduzir os dados da cassete");
					}else{
						privar2=true;
						diferenca=(byte)(dev-lev);
						System.out.println("A cassete foi usada "+diferenca+" dias");
					}
				break;

				//opcao 3
				case 3:
					if(privar2==false){
						System.out.println("Primeiro tem de calcular os dias em que cassete foi usada");
					}else{
						privar3=true;
						if(diferenca>10){
							per=3;
							penalizacao=preco*0.03f;
						}else if(diferenca>6){
							per=2;
							penalizacao=preco*0.02f;
						}else if(diferenca>3){
							per=1;
							penalizacao=preco*0.01f;
						}

						//tabela
						System.out.println("================================================================================================");
						System.out.println("| Codigo |   Preco   | Levantamento | Devolucao | Diferenca | Penalizacao(%) | Penalizacao(Mt) |");
						System.out.println("================================================================================================");
						System.out.printf("%2s%6d%3s%9s%3s%12s%3s%9s%3s%9s%3s%14d%3s%15s%2s","| ",cod," | ",df.format(preco)," | ","Dia "+lev," | ","Dia "+dev," | ",dev+" dias"," | ",per," | ",df.format(penalizacao)," |\n");
						System.out.println("================================================================================================");
					}
				break;

				//opcao 4
				case 4:
					if(privar3==false){
						System.out.println("Primeiro tem de visualizar o relatorio em forma de tabela");
					}else{
						total+=penalizacao;
						System.out.println("O valor total de penalizacao e de: "+df.format(total));
					}
				break;

				//opcao 5
				case 5: System.out.println("Victor Tesoura Junior | 20180408 | Turma B | 1o Ano | txsoura@gmail.com");break;

				//opcao 6
				case 6: System.exit(0);break;

				default: System.out.println("Opcao invalida");break;
			}

		}while(opc!=6);
	}
}