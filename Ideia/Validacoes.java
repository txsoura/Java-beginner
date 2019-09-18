/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Victor_Tesoura;

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

    //metodo para validar horas
    public String validarHora(String msg) {
        String x = "";

        do {
            System.out.println(msg);
            try {
                x = bf.readLine();

            } catch (IOException ex) {
                Logger.getLogger(Validacoes.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (x.length() != 5) {
                System.out.println("Hora invalido, tem de estar no formato (hh:mm)");
            }

        } while (x.length() != 5);

        return x;
    }

    //metodo para validar data
    public String validarData(String msg) {
        String x = "";

        do {
            System.out.println(msg);
            try {
                x = bf.readLine();

            } catch (IOException ex) {
                Logger.getLogger(Validacoes.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (x.length() != 10) {
                System.out.println("Data invalido, tem de estar no formato (dd-MM-aaaa)");
            }

        } while (x.length() != 10);

        return x;
    }

    //Metodo para validar todas entradas do tipo "Byte"
    public byte ValidarByte(byte min, byte max, String msg) {
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

    //Metodo para validar todas entradas do tipo "Double"
    public double ValidarDouble(double min, double max, String msg) {
        double x = 0;
        do {
            System.out.println(msg);
            try {
                x = Double.parseDouble(bf.readLine());
            } catch (NumberFormatException | IOException ex) {
                Logger.getLogger(Validacoes.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (x < min || x > max) {
                System.out.println("Numero invalido, tem de estar no intervalo entre " + min + " e " + max + "!");
            }
        } while (x < min || x > max);

        return x;
    }

    //Metodo para validar categorias "Char"
    public char ValidarCategoria(String msg) {
        char x = ' ';
        do {
            System.out.println(msg);
            try {
                x = bf.readLine().charAt(0);
            } catch (IOException ex) {
                Logger.getLogger(Validacoes.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (x != 'f' && x != 'F' && x != 'm' && x != 'M' && x != 'a' && x != 'A' && x != 'g' && x != 'G') {
                System.out.println("Caractere invalido. So sao permitidos: (F - Festa, M - Musica, A - Artes e G - Gastronomia)");
            }
        } while (x != 'f' && x != 'F' && x != 'm' && x != 'M' && x != 'a' && x != 'A' && x != 'g' && x != 'G');

        return x;
    }

    //Metodo para validar tipo de evento
    public char ValidarTipo(String msg) {
        char x = ' ';
        do {
            System.out.println(msg);
            try {
                x = bf.readLine().charAt(0);
            } catch (IOException ex) {
                Logger.getLogger(Validacoes.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (x != 'g' && x != 'G' && x != 'p' && x != 'P') {
                System.out.println("Caractere invalido. So sao permitidos: (P - Pago, G - Gratis)");
            }
        } while (x != 'g' && x != 'G' && x != 'p' && x != 'P');

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
