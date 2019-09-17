/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa5;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class Executavel {

    public static void main(String[] args) {
        String entrada = "ficheiro.txt", ficheiro = "ficheiro.dat";
        Tarefas t = new Tarefas();
        try {
            t.entrada(entrada);
            t.visualizar();
            t.adaptadorGravar(ficheiro);
            t.adaptadorLer(ficheiro);
            t.visualizar();
        } catch (IOException ex) {
            Logger.getLogger(Executavel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
