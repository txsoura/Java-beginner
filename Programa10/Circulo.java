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
public class Circulo implements FormaGeometrica {

    private float raio;
    private Ponto p;

    public Circulo() {
        this.raio = raio;
        p=new Ponto();
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public float area() {
        return PI * (raio * 2);
    }

    @Override
    public float volume() {
        return 0;
    }

    @Override
    public String nome() {
        return "Circulo";
    }

    @Override
    public String toString() {
        return "Nome da figura=" + nome() + ", Volume=" + volume() + ", Area=" + area() + ", Raio=" + raio;
    }

}
