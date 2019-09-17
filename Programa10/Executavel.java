/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa10;

/**
 *
 * @author Victor
 */
public class Executavel {

    public static void main(String[] args) {
        Validacoes v = new Validacoes();
        Ponto p = new Ponto();
        p.setX(v.ValidarFloat(0, 127, "Digite o X (0 - 127)"));
        p.setY(v.ValidarFloat(0, 127, "Digite o Y (0 - 127)"));
        System.out.println(p.toString());
        
        Circulo c = new Circulo();
        c.setRaio(v.ValidarFloat(0, 127, "Digite o Raio (0 - 127)"));
        System.out.println(c.toString());
        
        Cilindro ci = new Cilindro();
        ci.setAltura(v.ValidarFloat(0, 127, "Digite o Raio (0 - 127)"));
        System.out.println(ci.toString());
    }
}
