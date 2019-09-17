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
public class Ponto implements FormaGeometrica {

    private float x, y;

    public Ponto() {
        this.x = x;
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    @Override
    public float area() {
        return 0;
    }

    @Override
    public float volume() {
        return 0;
    }

    @Override
    public String nome() {
        return "Ponto";
    }

    @Override
    public String toString() {
        return "Nome da figura=" + nome() + ", Volume=" + volume() + ", Area=" + area() + "x=" + x + ", y=" + y;
    }

}
