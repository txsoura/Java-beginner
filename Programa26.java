/** Victor Tesoura Junior | Turma B | 1o Ano
*Entregar ate 21/05 as 23:59
*Enviar para ip.isctem@gmail.com
*Para uma equipa de N jogadores, receber as posicoes (D - Defesa, M - Medio e A - Avancado) e o numero de golos marcados.
*Pretende-se saber numero de golos para cada posicao e a media da equipa.
*Todos os jogadores que nao marcarem, serao despedidos.
*Pretende-se saber quantos jogadores nao marcaram, se for superior a metade do numero total, deve visualizar (Diretor despedido).
*Validar todos os dados de entrada.
 * **/
 import java.io.*;
 public class Programa26{
  public static void main(String[]args) throws IOException{
	BufferedReader x=new BufferedReader(new InputStreamReader(System.in));

	char posicao;
	byte n,golo,medio=0,defesa=0,avancado=0,golos=0,nao=0;
    do{
	System.out.println("Digite o numero de jogadores\n______________________________________________________________________________________");
	n=Byte.parseByte(x.readLine());
	if(n<=1){
	   System.out.println("O numero de jogadores nao pode ser menor ou igual a 0");
	}
	}while(n<=1);

	for(byte i=1;i<=n;i++){
		do{
			System.out.println("Digite a posicao do "+i+"o jogador (D - Defesa, M - Medio e A - Avancado)");
			posicao=x.readLine().charAt(0);
			if(posicao!='d' && posicao!='D' && posicao!='n' && posicao!='N' && posicao!='a' && posicao!='A'){
				System.out.println("A posicao so pode ser (D - Defesa, M - Medio e A - Avancado)");
			}
		}
        while(posicao!='d' && posicao!='D' && posicao!='m' && posicao!='M' && posicao!='a' && posicao!='A');

        do{
			System.out.println("Digite o numero de golos do "+i+"o jogador");
			golo=Byte.parseByte(x.readLine());
			golos+=golo;
			if(golo<0){
				System.out.println("O numero de golos nao pode ser menor que 0");
			}else if(golo==0){
			    nao++;
                System.out.println("Seras despedido, por nao ter marcado nenhum golo.\n___________________________________________________________");
            } else{
				nao++;
			}
		}
        while(golo<0);
        switch(posicao){
         case 'd' | 'D': defesa+=golo;break;
         case 'm' | 'M': medio+=golo;break;
         case 'a' | 'A': avancado+=golo;break;
         default: System.out.println("Posicao invalida");break;
        }

	}
    System.out.println("_____________________________________________________________________");
	System.out.println("Os jogadores medios marcaram "+medio+" golos.");
	System.out.println("Os jogadores avancados marcaram "+avancado+" golos.");
	System.out.println("Os jogadores defesa marcaram "+defesa+" golos.");
	System.out.println("A media da equipe e de: "+(golos/n)+" golos.");
	System.out.println(nao+" jogadores nao marcaram golos.");
	if(nao>(n/2)){
		System.out.println("Director despedido");
	}
  }
 }