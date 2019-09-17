/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class Validacoes {

    private BufferedReader bf;

    public Validacoes() {
        bf = new BufferedReader(new InputStreamReader(System.in));
    }

    //Metodo para validar todas entradas do tipo "Byte"
    public int ValidarByte(byte min, byte max, String msg) {
        byte x = 0;
        do {
            System.out.println(msg);
            try {
                x = Byte.parseByte(bf.readLine());
            } catch (NumberFormatException | IOException ex) {
                Logger.getLogger(Validacoes.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (x < min || x > max) {
                System.out.println("Numero invalido, tem de estar no intervalo entre " + min + " e " + max + "!");
            }
        } while (x < min || x > max);

        return x;
    }

    //Metodo para validar todas entradas do tipo "Float"
    public float ValidarFloat(float min, float max, String msg) {
        float x = 0;
        do {
            System.out.println(msg);
            try {
                x = Float.parseFloat(bf.readLine());
            } catch (NumberFormatException | IOException ex) {
                Logger.getLogger(Validacoes.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (x < min || x > max) {
                System.out.println("Numero invalido, tem de estar no intervalo entre " + min + " e " + max + "!");
            }
        } while (x < min || x > max);

        return x;
    }

    //Metodo para validar "String"
    public String ValidarString(String msg) {
        String x = "";
        do {
            System.out.println(msg);
            try {
                x = bf.readLine();
            } catch (IOException ex) {
                Logger.getLogger(Validacoes.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (x.isEmpty() || x.length() > 30) {
                System.out.println("Texto invalido. Tem de ter entre (1 - 30) caracteres.");
            }
        } while (x.isEmpty() || x.length() > 30);

        return x;
    }
}
