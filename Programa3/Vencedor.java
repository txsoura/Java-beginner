import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Vencedor {
private int contLinhas;

public void ler(String ficheiro) {
	String linha="",nome,vencedor;
	StringTokenizer str;
	byte res, maior=0;
	
	try {
	FileReader fr=new FileReader(ficheiro);
	BufferedReader br= new BufferedReader(fr);
	
	linha= br.readLine();
	
	while(linha!=null) {
		str=new StringTokenizer(linha, ";");
		
		nome=str.nextToken();
		res=Byte.parseByte(str.nextToken());
		
		Atleta a=new Atleta(nome, res);
		System.out.println(a);
		
		if(a.getResultado()>maior) {
			maior=a.getResultado();
			nome=a.getNome();
		}
		
		
		visualizar(maior,nome);
		
		
		
		contLinhas++;
		linha=br.readLine();
	}
	br.close();
	
	}catch(FileNotFoundException q) {
		System.out.println(q.getMessage());
	}catch(NumberFormatException n) {
		System.out.println(n.getMessage());
	}catch(IOException p) {
		System.out.println(p.getMessage());
	}
	linhas(contLinhas);
}

public static void visualizar( byte maior, String nome) {
	System.out.println("O "+nome+" e o vencedor, porque teve "+maior+" medalhas.");
	System.out.println("============================================================");
}

public static void linhas(int linhas) {
	System.out.println("Foram encontrados "+linhas+" dados de alunos.");
}
}
