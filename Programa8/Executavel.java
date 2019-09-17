/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa8;

/**
 *
 * @author Victor
 */
public class Executavel {

    public static void main(String[] args) {
        Calculo carro, computador;

        carro = new Carro();
        computador = new Computador();
        System.out.println(((Carro)carro).toString());
        System.out.println(((Computador)computador).toString());

    }
}
