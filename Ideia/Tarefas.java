/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Victor_Tesoura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class Tarefas {

    private Vector eventos;

    public Tarefas() {
        eventos = new Vector();
    }

    //**Defesa**//metodo abstracto acumular bilhetes
    //metodo para ler o ficheiro de texto "Entrada.txt" e armazenar vector
    public void lerTxt(String entrada) {
        Ficheiros f = new Ficheiros();
        byte codigo;
        String linha = "", nome, local, data, hora, regalia;
        char tipo, categoria, criterio;
        double preco, consumo;
        int bilhete, lotacao;
        StringTokenizer st;

        try {
            FileReader fr = new FileReader(entrada);
            BufferedReader br = new BufferedReader(fr);

            linha = br.readLine();

            while (linha != null) {
                st = new StringTokenizer(linha, "|");

                codigo = Byte.parseByte(st.nextToken());
                nome = st.nextToken();
                local = st.nextToken();
                data = st.nextToken();
                hora = st.nextToken();
                categoria = st.nextToken().charAt(0);
                tipo = st.nextToken().charAt(0);

                if (tipo == 'g' | tipo == 'G') {
                    lotacao = Integer.parseInt(st.nextToken());
                    f.criarGratis(codigo, nome, local, data, hora, categoria, tipo, lotacao, eventos);

                } else {
                    preco = Double.parseDouble(st.nextToken());
                    bilhete = Integer.parseInt(st.nextToken());
                    criterio = st.nextToken().charAt(0);
                    if (criterio == 'v' | criterio == 'V') {
                        regalia = st.nextToken();
                        f.criarVip(codigo, nome, local, data, hora, categoria, tipo, bilhete, preco, regalia, eventos);

                    } else {
                        consumo = Double.parseDouble(st.nextToken());
                        f.criarNormal(codigo, nome, local, data, hora, categoria, tipo, bilhete, preco, consumo, eventos);

                    }
                }

                linha = br.readLine();
            }
            br.close();

        } catch (FileNotFoundException q) {
            System.out.println(q.getMessage());
        } catch (NumberFormatException | IOException n) {
            System.out.println(n.getMessage());
        }
    }

    //adaptador para chamar o metodo que le o vector e gravar no ficheiro de objectos "Saida.dat"
    public void adaptadorGravarObj(String ficheiro) {
        Ficheiros f = new Ficheiros();
        try {
            f.gravarObj(ficheiro, eventos);
        } catch (IOException ex) {
            Logger.getLogger(Tarefas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //adaptador para chamar o metodo que visualiza os dados armazenados no vector
    public void adaptadorVisualizarVector(byte x) {
        Visualizacoes v = new Visualizacoes();
        v.visualizarVector(eventos, x);
    }

    //adaptador para chamar o metodo que calcula o numero total de bilhetes
    public int adaptadorCalcularBilhetes() {
        Calculos c = new Calculos();
        return c.CalcularBilhetes(eventos);
    }

    //adaptador para chamar o metodo que calcula o total arrecadao
    public double adaptadorCalcularTotal() {
        Calculos c = new Calculos();
        return c.CalcularTotal(eventos);
    }

    //adaptador para chamar o metodo que visualiza
    public void adaptadorVisualizar(String msg) {
        Visualizacoes v = new Visualizacoes();
        v.visualizar(msg);
    }

    //adaptador para chamar o metodo que visualiza vector por criterio
    public void adaptadorVisualizarVectorCriterio(String msg, byte c) {
        Visualizacoes v = new Visualizacoes();
        v.visualizarVectorCriterio(eventos, c, msg);
    }

    //adaptador que chama o metodo que procura o evento mais caro
    public void adaptadorMaisCaro() {
        Procura p = new Procura();
        adaptadorVisualizarVectorCriterio("Evento mais caro:", p.maisCaro(eventos));
    }

    //adaptador para chamar o metodo que procura o evento com menor numero de bilhetes
    public void adaptadorMenorBilhetes() {
        Procura p = new Procura();
        adaptadorVisualizarVectorCriterio("Evento com menor numero de bilhetes:", p.menorBilhetes(eventos));
    }

    //**Defesa**//adaptador para chamar o metodo que procura evento pelo codigo
    public void adaptadorProcura() {
        Procura p = new Procura();
        p.procurar(eventos);
    }

    //adaptador para chamar o metodo que verifica o tipo de evento
    public void adaptadorEditar(byte i) {
        Procura p = new Procura();
        p.verificar(i, eventos);
    }

    //adaptador para chamar o metodo que ordena o Vector pelo preco
    public void adaptadorOrdenaPreco() {
        Procura p = new Procura();
        p.ordenarPreco(eventos);
    }

    //adaptador para chamar o metodo que procura evento e remove
    public void adaptadorRemover(byte i) {
        Remocao o = new Remocao();
        o.Remover(eventos, i);
    }

    //adaptador para chamar o metodo que adiciona evento gratis
    public void adaptadorAdicionarGratis(String nome, String local, String data, String hora, char categoria, char tipo, int lotacao) {
        Adicoes a = new Adicoes();
        Procura p = new Procura();
        eventos = a.AdicionarGratis(eventos, p.incrementoCodigo(eventos), nome, local, data, hora, categoria, tipo, lotacao);
    }

    //adaptador para chamar o metodo que adiciona evento pago "normal"
    public void adaptadorAdicionarNormal(String nome, String local, String data, String hora, char categoria, char tipo, int bilhete, double preco, double consumo) {
        Adicoes a = new Adicoes();
        Procura p = new Procura();
        eventos = a.AdicionarNormal(eventos, p.incrementoCodigo(eventos), nome, local, data, hora, categoria, tipo, bilhete, preco, consumo);
    }

    //adaptador para chamar o metodo que adiciona evento pago "VIP"
    public void adaptadorAdicionarVip(String nome, String local, String data, String hora, char categoria, char tipo, int bilhete, double preco, String regalia) {
        Adicoes a = new Adicoes();
        Procura p = new Procura();
        eventos = a.AdicionarVip(eventos, p.incrementoCodigo(eventos), nome, local, data, hora, categoria, tipo, bilhete, preco, regalia);
    }
}
