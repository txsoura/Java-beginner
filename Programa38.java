//Armazenar N valores num array
//Visualizar o conteudo do array em duas colunas (numero de ordem e valor)
//Substituir todos os numeros impares por 200
//Visualizar o array modificado, bem como a quantidade de sustituicoes feitas
//Usar menu e validar entradas

import java.io.*;

public class Programa38{
    public static void main (String[]args)throws IOException{
       menu();
    }

   //metodo Menu
	public static void menu()throws IOException{
		short opc,qtd=0,sub;
         short [] valores=null;
         boolean privar=false,privar2=false;


		do{
			//chamar metodo opcao
			opc=opcao();

			switch(opc){
				//opcao 1
				case 1:
				System.out.println("Digite a quantidade de valores");
				     qtd= validar();
                       privar2=true;
				break;

				//opcao 2
				case 2:
				if(privar2==false){
						privar();
					}else{
					valores=criar((short)qtd);
					privar=true;
					}
				break;

				//opcao 3
				case 3:
				if(privar==false){
						privar();
					}else{
					visualizar(valores);
					}
				break;

				//opcao 4
				case 4:
				if(privar==false){
						privar();
					}else{
				     valores=substituir(valores);
				     }
				break;
				//opcao 5
				case 5:
				if(privar==false){
						privar();
					}else{
				     sub=substituidos(valores);
				     visub(sub);
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
	public static short opcao()throws IOException{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		short opc;
		do{
			System.out.println("***************MENU***************");
			System.out.println("1.Introduzir a quantidade\n2.Introduzir os valores\n3.Visualizar os valores\n4.Substituir os valores\n5.Visualizar o numero de substituicoes\n6.Sair");
			System.out.println("*********** Valores ***********");
			opc=Short.parseShort(bf.readLine());
			if(opc<1 || opc>6){
				System.out.println("Opcao invalida");
			}
		}while(opc<1 || opc>6);

		return opc;
	}

	//metodo para validar valores
	public static short validar()throws IOException{
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
     short v;
     do{
      v=Short.parseShort(bf.readLine());
      if(v<1){
       System.out.println("Valor invalido");
      }
     }while(v<1);
     return v;
	}

 //metodo para criar Array e receber valores
	public static short [] criar(short qtd) throws IOException{
        short [] valores=new short [qtd];

        for(int i=0; i<qtd; i++){
           System.out.println("Digite o "+(i+1)+"o valor");
		   short valor=validar();

		   valores[i]=valor;
        }
        return valores;
	}
	//metodo para visualizar array
	public static void visualizar(short []valores)throws IOException{
        for(int i=0; i<valores.length;i++){
         System.out.println(i+1+"o : "+valores[i]);
        }
	}

	//metodo para substituir os valores
	public static short [] substituir(short[]valores)throws IOException{
	 for(int i=0; i<valores.length;i++){
        if(valores[i]%2!=0){
        valores[i]=200;
	 }
      }
	 return valores;
	}
	//metodo para contar substituicoes dos valores
	public static short substituidos(short[]valores)throws IOException{
	short sub=0;
	 for(int i=0; i<valores.length;i++){
        if(valores[i]==200){
        sub++;
        }
        }
	 return sub;
	}
	//metodo para visualizar o numero de substituicoes
	public static void visub(short sub){
	    System.out.println("O numero de substituicoes e de: "+sub);
	}
	//metodo para visualizar mensagem privar
	public static void privar(){
		System.out.println("Opcao indisponivel, primeiro tem de entrar na opcao 1 e 2");
	}
}