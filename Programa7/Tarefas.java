/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa7;

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

    //metodo para ler o ficheiro de texto "ficheiro.txt" e armazenar no vector
    public void adaptadorEntrada(String entrada) throws IOException {
    	 Ficheiros f = new Ficheiros();
    	 f.entrada(entrada, t);
    }

    //metodo para visualizar funcionarios armazenados no vector
    public void adaptadorVisualizarFuncionario() {
    	Visualizacoes v=new Visualizacoes();
    	v.visualizarFuncionario(t);
        
    }
    
  //metodo para visualizar segurancas armazenados no vector
    public void adaptadorVisualizarSeguranca() {
    	Visualizacoes v=new Visualizacoes();
    	v.visualizarSeguranca(t);
        
    }
//metodo para gravar no ficheiro de objectos
    public void adaptadorGravar(String ficheiro) {
        Ficheiros f = new Ficheiros();
        f.gravar(ficheiro, t);

    }
  //metodo para ler o ficheiro de objectos
    public void adaptadorLer(String ficheiro) {
        Ficheiros f = new Ficheiros();
        t = f.ler(ficheiro, t);

    }
    
    //metodo para calcular o salario dos trabalhadores
    public void adaptadorCalcularSalario() {
    	Calculos c=new Calculos();
    	c.CalcularSalario(t);
    }
    
    //metodo para contar trabalhadores da categoria A
    public void adaptadorContarCategoria() {
    	Calculos c=new Calculos();
    	System.out.println("Sao "+c.contarCategoria(t)+" trabalhadores da categoria A.");
    }
    
    
}
