import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Turma {
	private byte qtd;
public Turma() throws IOException {
	qtd=validar((byte)5,(byte) 60, "Digite a quantidade de alunos");
	alunos((byte)qtd);
}

private byte validar(byte min, byte max, String msg)throws IOException{
	BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
byte x;
	
	do {
		System.out.println(msg);
		x=Byte.parseByte(bf.readLine());
		if(x<min || x>max) {
			System.out.println("Invalido tem de ser de "+min+" a "+max);
		}
		
	}while(x<min || x>max);
	
	return x;
}

private void alunos(byte qtd) throws IOException {
	byte a=0,m=0,b=0;
	float alto=0;
	String n = null,s=null;
	for(byte i=1; i<=qtd;i++) {
		System.out.println(i+"o aluno");
		Aluno al=new Aluno();
		
		if(al.getAltura()>1.75) {
			a++;
		}else if(al.getAltura()<1.55){
			b++;
		}else {
			m++;
		}
		
		if(al.getAltura()>alto) {
			alto=al.getAltura();
			n=al.getNome();
			s=al.getSexo();
		}
	}
	System.out.println("A turma tem"+a+" altos, "+m+" medios, "+b+" baixos");
	System.out.println("Aluno mais alto[ Nome: "+n+" | Sexo: "+s+" | Altura: "+alto);
}
}

