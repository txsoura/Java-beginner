
import java.io.IOException;

public class Aluno {

    private float altura;
    private String nome, sexo;

    public Aluno(String nome, String sexo, float altura) throws IOException {

        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
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
        return "Aluno [altura=" + altura + ", nome=" + nome + ", sexo=" + sexo + "]";
    }

}
