/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Victor_Tesoura;

import java.util.Vector;

/**
 *
 * @author Victor
 */
public class Edicoes {

    public Edicoes() {

    }


    //metodo para editar evento gratis
    public Vector EditarGratis(Vector e, byte codigo, String nome, String local, String data, String hora, char categoria, char tipo, int lotacao) {

        Evento x = new Gratis(codigo, nome, local, data, hora, categoria, tipo, lotacao);
        e.setElementAt(x, codigo - 1);
        return e;
    }

    //metodo para editar evento pago "normal"
    public Vector EditarNormal(Vector e, byte codigo, String nome, String local, String data, String hora, char categoria, char tipo, int bilhete, double preco, double consumo) {

        Evento x = new Normal(codigo, nome, local, data, hora, categoria, tipo, bilhete, preco, consumo);
        e.setElementAt(x, codigo - 1);
        return e;
    }

    //metodo para editar evento pago "VIP"
    public Vector EditarVip(Vector e, byte codigo, String nome, String local, String data, String hora, char categoria, char tipo, int bilhete, double preco, String regalia) {

        Evento x = new Vip(codigo, nome, local, data, hora, categoria, tipo, bilhete, preco, regalia);
        e.setElementAt(x, codigo - 1);
        return e;
    }
}
