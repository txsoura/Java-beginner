
public class Atleta {
private String nome;
private byte resultado;

public Atleta(String nome, byte resultado) {
	nome=nome;
	resultado=resultado;
}

public String getNome() {
	return nome;
}


public byte getResultado() {
	return resultado;
}

@Override
public String toString() {
	return "Atleta [nome=" + nome + ", resultado=" + resultado + "]";
}

	

}
