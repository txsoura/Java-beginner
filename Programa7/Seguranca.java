/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa7;

/**
 *
 * @author Victor
 */
public class Seguranca extends Trabalhador {

    private byte extras;

    public Seguranca(int codigo, String nome,char categoria, int horas, double salario,byte extras) {
        super(codigo, nome,categoria, horas, salario);
        this.extras=extras;
    }

    public byte getExtras() {
        return extras;
    }

    public void setExtras(byte extras) {
        if (extras > 0) {
            this.extras = extras;
        }
    }

    @Override
    public String toString() {
        return  super.toString()+",(Seguranca{" + "extras=" + extras + ")}";
    }

}
