/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa7;

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
            t.adaptadorEntrada(entrada);
            t.adaptadorVisualizarFuncionario();
            t.adaptadorVisualizarSeguranca();
            t.adaptadorGravar(ficheiro);
            t.adaptadorCalcularSalario();
            t.adaptadorContarCategoria();
            t.adaptadorLer(ficheiro);
        } catch (IOException ex) {
            Logger.getLogger(Executavel.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
