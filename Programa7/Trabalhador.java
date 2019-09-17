/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa7;

import java.io.Serializable;

/**
 *
 * @author Victor
 */
public class Trabalhador implements Serializable {

    protected int codigo, horas;
    protected String nome;
    protected double salario;
    protected char categoria;

    public Trabalhador(int codigo, String nome,char categoria, int horas, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria=categoria;
        this.horas = horas;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
    	if(codigo>0) {
        this.codigo = codigo;
    }}

    public int getHoras() {
        return horas;
    }

    public char getCategoria() {
		return categoria;
	}

	public void setCategoria(char categoria) {
		if(categoria!=' ') {
		this.categoria = categoria;
		}
	}

	public void setHoras(int horas) {
        if (horas > 0) {
            this.horas = horas;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
    	if(nome.length()>3) {
        this.nome = nome;
    	}
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        }
    }

    @Override
    public String toString() {
        return "Trabalhador{" + "codigo=" + codigo + ", horas=" + horas + ", nome=" + nome + ", salario=" + salario ;
    }

}
