package Victor_Tesoura;

import java.text.DecimalFormat;

public final class Normal extends Pago {

    public static int cont = 0;
    private double consumo;
    private DecimalFormat df;

    public Normal(byte codigo, String nome, String local, String data, String hora, char categoria, char tipo, int bilhete, double preco, double consumo) {
        super(codigo, nome, local, data, hora, categoria, tipo, bilhete, preco);
        this.consumo = consumo;
        //**Defesa**//incrementar variaveis estaticas no lugar correcto
        cont++;
        df = new DecimalFormat("###,##0.00 Mt");
    }

    public Normal() {
        this((byte) 0, "", "", "", "", ' ', ' ', 0, 0, 0);
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        if (consumo > 10) {
            this.consumo = consumo;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Consumo minimo=" + df.format(consumo) + "]";
    }

}
