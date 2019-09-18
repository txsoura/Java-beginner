/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguro;

/**
 *
 * @author Victor
 */
public class Executavel {

    public static void main(String[] args) {
        Seguro s = new Seguro();
        s.ler("DadosIn.txt");
        s.visualizar();
        s.ganhoTipo();
        s.tipoSeguro();
        s.menorValor();
        s.armazenar("DadosOut.txt");
    }
}
