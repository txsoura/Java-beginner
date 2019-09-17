//Victor Tesoura Junior: 20180408 | Turma B
import java.io.*;
import java.text.DecimalFormat;

public class programa36 {
//variaveis globais
static BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
static DecimalFormat df=new DecimalFormat("###,##0.00 MT");

//metodo main
public static void main (String [] args) throws IOException{
 menu();
}

//metodo Menu
	public static void menu()throws IOException{
		byte opc,c=0,e=0,tipo=0,hora=0;
		double val;


		do{
			//chamar metodo opcao
			opc=opcao();

			switch(opc){
				//opcao 1
				case 1:
				     System.out.println("Digite o tipo de cliente: 1.Comum, 2.Estudante");
				     tipo=validar((byte)1, (byte)2);

                     if(tipo==1){
                        c++;
                     }else{
                        e++;
                     }

				     System.out.println("Digite o numero de horas: 1 a 8");
				     hora=validar((byte)1, (byte)8);
				break;

				//opcao 2
				case 2:
					val=valor(tipo,hora);
					visualizar(val);
				break;

				//opcao 3
				case 3:
					programador();
				break;

				//opcao 4
				case 4:
				     System.out.println("Hoje vieram "+(c+e)+" clientes.");
				     System.out.println(c+" clientes comuns");
				     System.out.println(e+" estudantes");
                     System.exit(0);
				break;

				default: System.out.println("Numero invalido");break;
			}
		}while(opc!=4);
	}

    //metodo para validar o menu
	public static byte opcao()throws IOException{
		byte opc;
		do{
			System.out.println("***************MENU***************");
			System.out.println("1.Introduzir os dados\n2. Calcular o valor a pagar\n3. Informacoes do programar\n4. Sair");
			System.out.println("**********Internet  Cafe**********");
			opc=Byte.parseByte(bf.readLine());
			if(opc<1 || opc>4){
				System.out.println("Numero invalido");
			}
		}while(opc<1 || opc>4);

		return opc;
	}

    //metodo para validar as entradas
	public static byte validar(byte min, byte max)throws IOException{
		byte n;
		do{
			n=Byte.parseByte(bf.readLine());
			if(n<min || n>max ){
				System.out.println("Invalido");
				}
		}while(n<min || n>max);

		return n;
	}

    //metedo para calcular o valor a pagar
    public static double valor (byte tipo, byte hora){
    final float TAXA=30;
    double val;
        if(tipo ==1) {
            val=TAXA*hora;
        }else{
            val=TAXA*hora-TAXA*hora*10;
        }

    return val;
    }

    //metodo para visualizar o valor a pagar
    public static void visualizar (double val){
         System.out.println("O valor a pagar e de: "+df.format(val));
    }

    //metodo para visualizar os dados do programador
	public static void programador(){
		System.out.println("Victor Tesoura Junior | 20180408 | Turma B | 1o Ano ");
	}

}