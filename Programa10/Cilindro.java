/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa10;

/**
 *
 * @author Victor
 */
public class Cilindro implements FormaGeometrica {

    private float altura;
    private Circulo c;

    public Cilindro() {
        this.altura = altura;
        c = new Circulo();
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public float area() {
        return c.area();
    }

    @Override
    public float volume() {
        return altura * c.area();
    }

    @Override
    public String nome() {
        return "Cilindro";
    }

    @Override
    public String toString() {
        return "Nome da figura=" + nome() + ", Volume=" + volume() + ", Area=" + area() + ", Altura=" + altura;
    }

}
