package Victor_Tesoura;

public final class Vip extends Pago {

    public static int cont = 0;
    private String regalia;

    public Vip(byte codigo, String nome, String local, String data, String hora, char categoria, char tipo, int bilhete, double preco, String regalia) {
        super(codigo, nome, local, data, hora, categoria, tipo, bilhete, preco);
        this.regalia = regalia;
        //**Defesa**//incrementar variaveis estaticas no lugar correcto
        cont++;
    }

    public Vip() {
        this((byte) 0, "", "", "", "", ' ', ' ', 0, 0, "");
    }

    public void setRegalia(String regalia) {
        this.regalia = regalia;
    }

    @Override
    public String toString() {
        return super.toString() + ", Regalia=" + regalia + "]";
    }

}
