/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa6;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;

/**
 *
 * @author Victor
 */
public class Tarefas {

    private Vector t;

    public Tarefas() {
        t = new Vector();
    }

    //metodo para ler o ficheiro de texto "ficheiro.txt" e armazenar no array de objectos
    public void entrada(String entrada) throws IOException {
        String linha = "", nome;
        double salario;
        int codigo, horas;
        StringTokenizer st;

        try {
            FileReader fr = new FileReader(entrada);
            BufferedReader br = new BufferedReader(fr);

            linha = br.readLine();

            while (linha != null) {
                System.out.println(linha);
                st = new StringTokenizer(linha, "|");

                codigo = Integer.parseInt(st.nextToken());
                nome = st.nextToken();
                horas = Integer.parseInt(st.nextToken());
                salario = Double.parseDouble(st.nextToken());

                t.addElement(new Trabalhador(codigo, nome, horas, salario));

                linha = br.readLine();
            }
            br.close();

        } catch (FileNotFoundException q) {
            System.out.println(q.getMessage());
        } catch (NumberFormatException | IOException n) {
            System.out.println(n.getMessage());
        }
    }

    //metodo para visualizar os dados armazenados no array de objectos
    public void visualizar() {

        System.out.println(t.toString());
        System.out.println("=======================================================================================================================");
    }

    public void adaptadorGravar(String ficheiro) {
        Ficheiros f = new Ficheiros();
        f.gravar(ficheiro, t);

    }

    public void adaptadorLer(String ficheiro) {
        Ficheiros f = new Ficheiros();
        t = f.ler(ficheiro, t);

    }
}
