//Autor: Victor Tesoura Junior - Turma B
//entregar ate terca as 00h
//Ao chegar a cantina ha 4 opcoes [hamburger (52 mt), cheeseburger(54.5 mt), batata frita(25 mt), sumo (8.5 mt)].
//o utilizador deve dizer a quantidade de cada producto, no final surgir no ecra a mensagem :
//hamburger   cheeseburger batata frita sumo valor pagar
//    1             0        2            2      540.5 MT
//__________________________________________________________________________________________________________________
import java.io.*;
public class programa8{
	public static void main (String[]args) throws IOException{
		final float HAMBURGER=52;
		final float CHEESE=54.5f;
		final float BATATA=25;
		final float SUMO=8.5f;
		int h,c,b,s;
		double total;

		BufferedReader x=new BufferedReader (new InputStreamReader(System.in));

		System.out.println("          MENU\n***********************\nHamburger (52 MT)\nCheeseburger (54.5 MT)\nBatata Frita (25 MT)\nSumo (8.5 MT)\n***********************");
		System.out.println("Quantos Hamburgers quer?");
		h=Integer.parseInt(x.readLine());
		System.out.println("Quantos Cheeseburgers quer?");
		c=Integer.parseInt(x.readLine());
		System.out.println("Quantas Batatas quer?");
		b=Integer.parseInt(x.readLine());
		System.out.println("Quantos Sumos quer?");
		s=Integer.parseInt(x.readLine());

		total=(h*HAMBURGER)+(c*CHEESE)+(b*BATATA)+(s*SUMO);
		System.out.println("__________________________\nHamburger | Cheeseburger | Batata Frita | Sumo | Valor a Pagar");
		System.out.println("    "+h+"     |      "+c+"       |      "+b+"       |  "+s+"   |   "+total+" MT");
	}
}