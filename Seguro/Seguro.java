/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguro;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class Seguro {

    private byte c;
    private Veiculo[] cliente;

    public Seguro() {
        c = 0;
        cliente = new Veiculo[80];
    }

    //metodo para ler o ficheiro de texto DadosIn.txt e meter no array de objectos
    public void ler(String ficheiro) {
        String linha = "", tseguro, matricula, tveiculo, proprietario;
        double valor;
        StringTokenizer str;

        try {
            FileReader fr = new FileReader(ficheiro);
            BufferedReader br = new BufferedReader(fr);

            linha = br.readLine();

            while (linha != null) {
                str = new StringTokenizer(linha, "|");

                proprietario = str.nextToken();
                tseguro = str.nextToken();
                matricula = str.nextToken();
                tveiculo = str.nextToken();
                valor = Double.parseDouble(str.nextToken());

                cliente[c] = new Veiculo(tseguro, matricula, tveiculo, proprietario, valor);
                c++;

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
        DecimalFormat df = new DecimalFormat("#,###,##0.00 Mt");
        System.out.println("=====================================================================================================");
        System.out.println("|     Nome do Proprietario     | Tipo de Seguro |   Matricula   | Tipo de Veiculo |      Valor      |");
        System.out.println("=====================================================================================================");
        for (byte i = 0; i < c; i++) {

            System.out.println("| "+cliente[i].toString()+" |");
            System.out.println("=====================================================================================================");
        }
    }

    //metodo para contar e calcular o ganho para cada tipo de veiculo
    public void ganhoTipo() {
        byte l = 0, p = 0;
        double vl = 0, vp = 0;
        for (byte i = 0; i < c; i++) {
            if (cliente[i].getTveiculo().equalsIgnoreCase("ligeiro")) {
                l++;
                vl += cliente[i].getValor();
            } else {
                p++;
                vp += cliente[i].getValor();
            }
        }
        visualizarGanhoTipo(l, p, vl, vp);
    }

    //metodo para visualizar o ganho de cada tipo de veiculo
    public void visualizarGanhoTipo(byte l, byte p, double vl, double vp) {
        DecimalFormat df = new DecimalFormat("#,###,##0.00 Mt");
        System.out.println("O numero de veiculos ligeiros e de: " + l + ". O seu ganho foi de: " + df.format(vl));
        System.out.println("O numero de veiculos pesados e de: " + p + ". O seu ganho foi de: " + df.format(vp));
    }

    //metodo para determinar o tipo de seguro com maior numero
    public void tipoSeguro() {
        byte x = 0, n = 0;
        for (byte i = 0; i < c; i++) {
            if (cliente[i].getTseguro().equalsIgnoreCase("completo")) {
                x++;
            } else {
                n++;
            }
        }
        if (n != x) {
            if (x > n) {
                visualizarTipoSeguro("O tipo de seguro com maior numero e o Completo.");
            } else {
                visualizarTipoSeguro("O tipo de seguro com maior numero e o Normal.");
            }
        } else {
            visualizarTipoSeguro("Nao ha tipo de seguro com maior numero.");
        }
    }

    //metodo para visualizar o maior numero de tipo do seguro
    public void visualizarTipoSeguro(String msg) {
        System.out.println(msg);
    }

    //metodo para visualizar menor valor assegurado
    public void menorValor() {
        byte x = 0;
        for (byte i = 0; i < c; i++) {
            if (cliente[x].getValor() > cliente[i].getValor()) {
                x = i;
            }
        }
        visualizarMenorValor(x);
    }

    //metodo para visualizar dados do veiculo com menor valor assegurado
    public void visualizarMenorValor(byte m) {
        System.out.println("O veiculo com o menor valor assegurado e:");
        System.out.println(cliente[m].toString());
    }

    //metodo para armazenar no ficheiro DadosOut.txt com valor maior que 150000
    public void armazenar(String ficheiro) {
        try {
            FileWriter fw = new FileWriter(ficheiro);
            BufferedWriter bw = new BufferedWriter(fw);

            for (byte i = 0; i < c; i++) {
                if (cliente[i].getValor() > 150000) {
                    bw.write(cliente[i].toString());
                    bw.newLine();
                }
            }
            bw.close();
        } catch (IOException ex) {
            Logger.getLogger(Seguro.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
