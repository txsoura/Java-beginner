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
public interface FormaGeometrica {

    /**
     * @param args the command line arguments
     */
    public static final float PI = 3.14f;

    public abstract float area();

    public abstract float volume();

    public abstract String nome();
}
