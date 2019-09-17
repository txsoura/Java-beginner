/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa7;

/**
 *
 * @author Victor
 */
public class Funcionario extends Trabalhador {

    private float bonus;

    public Funcionario(float bonus, int codigo, String nome,char categoria, int horas, double salario) {
        super(codigo, nome,categoria, horas, salario);
        this.bonus = bonus;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        if (bonus > 0) {
            this.bonus = bonus;
        }
    }

    @Override
    public String toString() {
        return super.toString()+",(Funcionario{" + "bonus=" + bonus + ")}";
    }

}
