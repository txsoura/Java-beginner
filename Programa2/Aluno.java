/**Ler do ficehiro nome e 2 notas dos testes
 * calcular a media de cada aluno e dizer se esta aprovado, despensado ou excluido
 * gravar num outro ficheiro os nomes e a respectiva informacao
 * informra quantos foram registados
 * **/
import java.util.StringTokenizer;
import java.io.*;
public class Aluno {

	public static void main (String[]args) {
		lerNotas("Alunos.txt", "NAlunos.txt");
	}
	
	public static void lerNotas(String f1, String f2) {
		String linha="",nome,classif;
		StringTokenizer str;
		float t1,t2;
		int contLinhas=0;
		
		try {
		FileReader fr=new FileReader(f1);
		BufferedReader br= new BufferedReader(fr);
		
		FileWriter fw=new FileWriter(f2);
		BufferedWriter bw= new BufferedWriter (fw);
		
		linha= br.readLine();
		
		while(linha!=null) {
			str=new StringTokenizer(linha, ";");
			
			nome=str.nextToken();
			t1=Float.parseFloat(str.nextToken());
			t2=Float.parseFloat(str.nextToken());
			
			classif=classificar(t1,t2);
			visualizar(nome,t1,t2,classif);
			
			bw.write(nome+";"+classif);
			bw.newLine();
			
			contLinhas++;
			linha=br.readLine();
		}
		br.close();
		bw.close();
		
		}catch(FileNotFoundException q) {
			System.out.println(q.getMessage());
		}catch(NumberFormatException n) {
			System.out.println(n.getMessage());
		}catch(IOException p) {
			System.out.println(p.getMessage());
		}
		linhas(contLinhas);
	}
	
	public static String classificar (float n1, float n2) {
		float media=(n1+n2)/2;
		if(media>=15) {
			return "Despensado";
		}else if(media<10) {
			return "Excluido";
		}else {
			return "Aprovado";
		}
	}
	
	public static void visualizar(String nome, float n1, float n2, String estado) {
		System.out.println(nome+" | Nota 1: "+n1+" | Nota 2: "+n2+" | Situacao: "+estado);
		System.out.println("============================================================");
	}
	
	public static void linhas(int linhas) {
		System.out.println("Foram encontrados "+linhas+" dados de alunos.");
	}
}
