import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Turma {
	private byte qtd;
	private Aluno al[];
	
public Turma() throws IOException {
	qtd=0;
	al=new Aluno[80];
}

public void ler(String ficheiro) {
	String linha="", nome, sexo;
	float altura; 
	StringTokenizer str;
	
	try {
	FileReader fr=new FileReader(ficheiro);
	BufferedReader br= new BufferedReader(fr);
	
	linha= br.readLine();
	
	while(linha!=null) {
		str=new StringTokenizer(linha, "|");
		
		nome=str.nextToken();
		sexo=str.nextToken();
		altura=Float.parseFloat(str.nextToken());
		
		al[qtd]=new Aluno(nome, sexo, altura);
		qtd++;
		
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
}

public void maior(){
	float am=0, af=0;
	String nomem="", nomef="";
	for(int i=0;i<qtd;i++) {
		if(al[i].getSexo().equalsIgnoreCase("masculino")) {
			if(al[i].getAltura()>am) {
				am=al[i].getAltura();
				nomem=al[i].getNome();
			}
		}else {
			if(al[i].getAltura()>af) {
				af=al[i].getAltura();
				nomef=al[i].getNome();
			}
		}
	}
	visualizar(af,nomef,am,nomem);
}

public void visualizar(float af,String nomef, float am, String nomem) {
	System.out.println("O homem mais alto e: "+nomem+" com "+am+" metros.");
	System.out.println("A mulher mais alta e: "+nomef+" com "+af+" metros.");
}

}

