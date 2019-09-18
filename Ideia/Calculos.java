/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Victor_Tesoura;

import java.util.Vector;

/**
 *
 * @author Victor
 */
public class Calculos {

    public Calculos() {
    }

    //metodo para calcular o numero total de bilhetes
    public int CalcularBilhetes(Vector e) {
        int total = 0;
        Evento ev;
        Pago pg;
        for (int i = 0; i < e.size(); i++) {
            ev = (Evento) e.elementAt(i);
            if (ev instanceof Pago) {
                pg = (Pago) ev;
                total += pg.calcularBilhetes();

            }
        }
        return total;
    }

    //metodo para calcular o total que sera arrecadado
    public double CalcularTotal(Vector e) {
        double total = 0;
        Evento ev;
        Pago pg;
        for (int i = 0; i < e.size(); i++) {
            ev = (Evento) e.elementAt(i);
            if (ev instanceof Pago) {
                pg = (Pago) ev;
                total += pg.calcularTotal();

            }
        }
        return total;
    }

}
