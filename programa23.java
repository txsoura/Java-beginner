//fazer programa para contar os utilizadores de cada operadora, sabendo que sao 10 utilizadores.(M-Mcel, V-vodacom e T-telkom)
//pedir a operadora e contar quantos sao para cada.validar operadora e apresentar quantidade de cada.
import java.io.*;
public class programa23{
	public static void main (String[]args)throws IOException{
		BufferedReader x=new BufferedReader(new InputStreamReader(System.in));
		char opr;
		int m=0,v=0,t=0,n=1;

		while(n<=10){
			System.out.println(n+"o utilizador, bem vindo.");
			do{
			System.out.println("Escolha a operadora que usa:\nM - Mcel\nV - Vodacom\nT - Telkom\n******************************************************");
			opr=x.readLine().charAt(0);
			if(opr!='M' && opr!='m' && opr!='t' && opr!='T' && opr!='v' && opr!='V'){
			    System.out.println("Operadora invalida");
			}
			}
            while(opr!='M' && opr!='m' && opr!='t' && opr!='T' && opr!='v' && opr!='V');

			switch(opr){
				case 'M' | 'm':m++;break;
				case 'V' | 'v':v++;break;
				case 'T' | 't':t++;break;
				default:System.out.println("Caractere invalido");break;
			}
			n++;
		}
		System.out.println("Mcel: "+m+" utilizadores\n Vodacom: "+v+" utilizadores\n Telkom: "+t+" utilizadores\n_______________________________________________________________________");
	}
}