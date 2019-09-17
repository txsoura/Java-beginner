//Armazenar num array de 4 linhas e 5 colunas de numeros recebidos pelo teclado
//Visualizar o conteudo do array criado na forma de linhas e colunas
//Determinar a soma dos valores que se encontra numa coluna escolhida pelo utilizador
//Determinar o maior  valor do array
import java.io.*;

public class Programa43{
   public static void main (String[]args) throws IOException{

         byte [][] num=new byte [2][5];

          num=criar ((byte )2,(byte)5);

                 visualizar(num);

                 visualizarcol(num);
                 maior(num);

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

        for(byte l=0;l<lin;l++){
            for(byte c=0; c<col; c++){
            System.out.println("Digite o numero da "+(l+1)+"a linha e "+(c+1)+"a coluna");
		        byte valor=(byte)validar();

		        a[l][c]=valor;
            }
        }
        return a;
	}

	//metodo para visualizar array
	public static void visualizar(byte [][]b){
        for(byte l=0; l<b.length;l++){
            for(byte c=0; c<b[0].length;c++){
               System.out.print(b[l][c]+"  ");
            }
            System.out.println();
        }
	}

	//metodo para visualizar a coluna selecionada
	public static void visualizarcol(byte [][]b)throws IOException{
	 System.out.println("Escolha a coluna");
		byte col=(byte) validar();
		byte soma=0;

		for(byte l=0; l<b.length;l++){
               System.out.println(b[l][col-1]+"  ");
               soma+=b[l][col-1];
            }

        System.out.println("A soma da "+col+"a coluna e: "+soma);
	}
	//metodo para visualizar maior abastecimento
	public static void maior(byte [][] num){
         byte aux=0;


        for(byte l=0; l<num.length;l++){
            for(byte c=0; c<num[0].length;c++){
            if(num[l][c] > aux){
            //procurar o maior

               aux = num[l][c];
                }
            }
        }
        System.out.println("O maior numero introduzido e: "+aux);
	}

}