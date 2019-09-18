/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Victor_Tesoura;

import java.io.IOException;
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

    //adaptador para chamar o metodo que le o ficheiro de texto "Entrada.txt" e armazenar vector 
    public void adaptadorLerTxt(String ficheiro) {

        Ficheiros f = new Ficheiros();
        eventos = f.lerTxt(ficheiro, eventos);

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

    //adaptador para chamar o metodo que procura pela categoria
    public void adaptadorProcuraCategorias() {
        Procura p = new Procura();
        p.procurarCategoria(eventos);
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
