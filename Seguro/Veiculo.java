/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seguro;

import java.text.DecimalFormat;

/**
 *
 * @author Victor
 */
public class Veiculo {

    private String tseguro, matricula, tveiculo, proprietario;
    private double valor;
    private DecimalFormat mt;

    public Veiculo(String tseguro, String matricula, String tveiculo, String proprietario, double valor) {
        mt = new DecimalFormat("#,###,##0.00 Mt");
        this.tseguro = tseguro;
        this.matricula = matricula;
        this.tveiculo = tveiculo;
        this.proprietario = proprietario;
        this.valor = valor;
    }

    public String getTseguro() {
        return tseguro;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getTveiculo() {
        return tveiculo;
    }

    public String getProprietario() {
        return proprietario;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return  proprietario + " | " + tseguro + " | " + matricula + " | " + tveiculo + " | " + mt.format(valor);
    }

}
