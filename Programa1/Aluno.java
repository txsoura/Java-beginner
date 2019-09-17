import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aluno {
private float altura;
private String nome, sexo;
private BufferedReader bf;

public Aluno() throws IOException{
	bf= new BufferedReader(new InputStreamReader(System.in));
	nome=validarString((byte)3, (byte)50, "Digite o nome do aluno");
	sexo=validarString((byte)8, (byte)9, "Digite o sexo do aluno");
	altura=validarFloat((byte)0, (byte)2, "Digite a altura do aluno");
}

private String validarString(byte min, byte max, String msg) throws IOException {
	String a;
	
	do {
		System.out.println(msg);
		a=bf.readLine();
		if(a.length()<min && a.length()>max) {
			System.out.println("Invalido tem de ter de "+min+" a "+max+" caracteres");
		}
		
	}while(a.length()<min && a.length()>max);
	
	return a;
}

private float validarFloat(byte min, byte max, String msg)throws IOException{
float x;
	
	do {
		System.out.println(msg);
		x=Float.parseFloat(bf.readLine());
		if(x<min && x>max) {
			System.out.println("Invalido tem de ser de "+min+" a "+max);
		}
		
	}while(x<min && x>max);
	
	return x;
}

public String getNome() {
	return nome;
}

public String getSexo() {
	return sexo;
}

public float getAltura() {
	return altura;
}

@Override
public String toString() {
	return "Aluno [altura=" + altura + ", nome=" + nome + ", sexo=" + sexo  + "]";
}

}
