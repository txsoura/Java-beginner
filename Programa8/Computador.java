/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa8;

import java.text.DecimalFormat;

/**
 *
 * @author Victor
 */
public class Computador implements Calculo {

    private Validacoes v;
    private int serie;
    private float preco;
    private DecimalFormat mt;

    public Computador() {
        v = new Validacoes();
        mt = new DecimalFormat("#,###,##0.00 Mt");
        serie = v.ValidarInt(0, 99999999, "Digite o numero de serie (0 - 99999999)");
        preco = v.ValidarFloat(0, 99999, "Digite o preco base (0 - 99999)");
    }

    @Override
    public float calculaPreco() {
        return preco * IVA + preco;
    }

    @Override
    public String toString() {
        return "Computador{" + "Numero de serie=" + serie + ", Preco base=" + mt.format(preco) + ", Preco Total=" + mt.format(calculaPreco()) + '}';
    }

}
