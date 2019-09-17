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
public class Carro implements Calculo {

    private Validacoes v;
    private String matricula;
    private float preco, direito;
    private DecimalFormat mt;

    public Carro() {
        v = new Validacoes();
        mt = new DecimalFormat("#,###,##0.00 Mt");
        matricula = v.ValidarString("Digite a matricula (1 - 30) caracteres");
        preco = v.ValidarFloat(0, 99999, "Digite o preco original (0 - 99999)");
        direito = v.ValidarFloat(0, 99999, "Digite o valor dos direitos (0 - 99999)");
    }

    @Override
    public float calculaPreco() {
        return preco + direito + (preco + direito) * IVA;
    }

    @Override
    public String toString() {
        return "Carro{" + "Matricula=" + matricula + ", Preco original=" + mt.format(preco) + ", Valor do direito=" + mt.format(direito) + ", Preco Total=" + mt.format(calculaPreco()) + '}';
    }

}
