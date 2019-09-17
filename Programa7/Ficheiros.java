/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa7;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class Ficheiros {

    public Ficheiros() {
    }
//metodo para gravar no ficheiro de objectos
    public void gravar(String ficheiro, Vector t) {

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
//metodo para ler do ficheiro de objectos
    public Vector ler(String ficheiro, Vector t) {
        FileInputStream fis;
        try {
            fis = new FileInputStream(ficheiro);
            ObjectInputStream ois = new ObjectInputStream(fis);
            t = (Vector) ois.readObject();
            ois.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Tarefas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException | IOException ex) {
            Logger.getLogger(Tarefas.class.getName()).log(Level.SEVERE, null, ex);
        }
        return t;
    }
    
  //metodo para ler o ficheiro de texto "ficheiro.txt" e armazenar no vector
    public Vector entrada(String entrada, Vector t) {
        String linha = "", nome;
        double salario;
        int codigo, horas;
        StringTokenizer st;
        char criterio,categoria;
        byte extra, bonus;

        try {
            FileReader fr = new FileReader(entrada);
            BufferedReader br = new BufferedReader(fr);

            linha = br.readLine();

            while (linha != null) {
                System.out.println(linha);
                st = new StringTokenizer(linha, "|");

                codigo = Integer.parseInt(st.nextToken());
                nome = st.nextToken();
                categoria=st.nextToken().charAt(0);
                horas = Integer.parseInt(st.nextToken());
                salario = Double.parseDouble(st.nextToken());
                criterio = st.nextToken().charAt(0);

                if (criterio == 'f' | criterio == 'F') {
                	bonus=Byte.parseByte(st.nextToken());
                	t.addElement(new Funcionario(bonus, codigo, nome, categoria, horas, salario));

                } else if (criterio == 's' | criterio == 'S') {
                	extra=Byte.parseByte(st.nextToken());
                	t.addElement(new Seguranca(codigo, nome, categoria, horas, salario, extra));
                }

                linha = br.readLine();
            }
            br.close();

        } catch (FileNotFoundException q) {
            System.out.println(q.getMessage());
        } catch (NumberFormatException | IOException n) {
            System.out.println(n.getMessage());
        }
        
        return t;
    }
}
