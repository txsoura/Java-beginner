/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa5;

import java.io.Serializable;

/**
 *
 * @author Victor
 */
public class Trabalhador implements Serializable {

    private int codigo, horas;
    private String nome;
    private double salario;

    public Trabalhador(int codigo, String nome, int horas, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.horas = horas;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public int getHoras() {
        return horas;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Trabalhador{" + "codigo=" + codigo + ", horas=" + horas + ", nome=" + nome + ", salario=" + salario + '}';
    }

}
