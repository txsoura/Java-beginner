//Escrever um programa completo com separacao por metodos compassagem de parametros que armazene de N linhas e colunas do tipo N (numeros aleatorios de 0 a 100)
//vizualizar o array na forma de linha coluna
//visualizar a linha que o utilizador escolher
//validar todas entradas e saidas
import java.io.*;
import java.util.Random;

public class Programa42{
   public static void main (String[]args) throws IOException{
    menu();
   }

   public static void menu ()throws IOException{
      System.out.println("Digite a quantidade de linhas");
		byte lin=(byte) validar();

		System.out.println("Digite a quantidade de colunas");
		byte col=(byte) validar(),opc;
         byte [][] num=new byte [lin][col];
          num=criar ((byte )lin,(byte)col);

		do{
			//chamar metodo opcao
			opc=(byte)opcao();

			switch(opc){
				//opcao 1
				case 1:
                        visualizar(num);
				break;

				//opcao 2
				case 2:
                 visualizarlin(num);
				break;

				//opcao 3
				case 3:
				break;

				default: System.out.println("Numero invalido");break;
			}
		}while(opc!=3);
   }

   //metodo para validar o menu
	public static int opcao()throws IOException{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		int opc;
		do{
			System.out.println("***************MENU***************");
			System.out.println("1.Visualizar array\n2.Visualizar linha selecionada\n3.Sair");
			System.out.println("***********  Numeros  ***********");
			opc=Integer.parseInt(bf.readLine());
			if(opc<1 || opc>3){
				System.out.println("Opcao invalida");
			}
		}while(opc<1 || opc>3);

		return opc;
	}

	//metodo para validar valores
	public static byte validar()throws IOException{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	byte v;
     do{
      v=Byte.parseByte(bf.readLine());
      if(v<1 || v>127){
       System.out.println("Valor invalido");
      }
     }while(v<1 || v>127);
     return v;
	}
     //metodo para criar array
	public static byte [][] criar(byte lin, byte col) throws IOException{
        byte [][] a=new byte [lin][col];
        Random r= new Random();

        for(byte l=0;l<lin;l++){
            for(byte c=0; c<col; c++){
		        byte valor=(byte)r.nextInt(100);

		        a[l][c]=valor;
            }
        }
        return a;
	}

	//metodo para visualizar array
	public static void visualizar(byte [][]b)throws IOException{
        for(byte l=0; l<b.length;l++){
            for(byte c=0; c<b[0].length;c++){
               System.out.print(b[l][c]+"  ");
            }
            System.out.println();
        }
	}

	//metodo para visualizar a linha selecionada
	public static void visualizarlin(byte [][]b)throws IOException{
	 System.out.println("Digite a linhas");
		byte lin=(byte) validar();

		for(byte c=0; c<b[0].length;c++){
               System.out.println(b[lin-1][c]+"  ");
            }
	}
}