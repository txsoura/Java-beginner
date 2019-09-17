/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class Ficheiros {

    public Ficheiros() {
    }

    public void gravar(String ficheiro, Trabalhador[] t) {

        try {
            FileOutputStream fos = new FileOutputStream(ficheiro);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(t);
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tarefas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Tarefas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public Trabalhador[] ler(String ficheiro, Trabalhador[] t) {
        FileInputStream fis;
        try {
            fis = new FileInputStream(ficheiro);
            ObjectInputStream ois = new ObjectInputStream(fis);
            t = (Trabalhador[]) ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tarefas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(Tarefas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }

}
