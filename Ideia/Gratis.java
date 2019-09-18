package Victor_Tesoura;

import java.text.DecimalFormat;

public final class Gratis extends Evento {

    public static int cont = 0;
    private int lotacao;
    private DecimalFormat df;

    public Gratis(byte codigo, String nome, String local, String data, String hora, char categoria, char tipo, int lotacao) {
        super(codigo, nome, local, data, hora, categoria, tipo);
        this.lotacao = lotacao;
        //**Defesa**//incrementar variaveis estaticas no lugar correcto
        cont++;
        df = new DecimalFormat("#####0 pessoas");
    }

    public Gratis() {
        this((byte) 0, "", "", "", "", ' ', ' ', 0);
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        if (lotacao > 10) {
            this.lotacao = lotacao;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Lotacao=" + df.format(lotacao);
    }

}
