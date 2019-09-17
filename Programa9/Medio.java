/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa9;

import java.text.DecimalFormat;

/**
 *
 * @author Victor
 */
public class Medio implements Calculo {

    private Validacoes v;
    private DecimalFormat mt;
    private String nome;
    private byte cursos;
    private float despesas;

    public Medio(String nome, byte cursos, float despesas) {
        this.nome = nome;
        this.cursos = cursos;
        this.despesas = despesas;
    }

    public float getDespesas() {
        return despesas;
    }

    public void setCursos(byte cursos) {
        this.cursos = cursos;
    }

    @Override
    public float valorTotal() {
        return despesas + SALARIO;
    }

    @Override
    public void cursos(byte cursos) {
        setCursos((byte) v.ValidarByte((byte) 1, (byte) 127, "Digite a quantidade de cursos (1 - 127)"));
    }

    @Override
    public String toString() {
        return "Medio{" + "Nome=" + nome + ", Numero de cursos=" + cursos + ", Valor gasto com o ensino=" + mt.format(valorTotal()) + '}';
    }

}
