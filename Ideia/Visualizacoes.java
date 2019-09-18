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
public class Visualizacoes {

    public Visualizacoes() {
    }

    //metodo para verificar o tipo de visualizacao de eventos
    public void visualizarVector(Vector e, byte x) {

        switch (x) {
            case 1:
                visualizarGratis(e);
                break;
            case 2:
                visualizarNormal(e);
                break;
            case 3:
                visualizarVip(e);
                break;
        }
    }

    //metodo para visualizar eventos gratis
    public void visualizarGratis(Vector e) {
        Evento ev;
        Gratis gt;
        for (int i = 0; i < e.size(); i++) {
            ev = (Evento) e.elementAt(i);
            if (ev instanceof Gratis) {
                gt = (Gratis) ev;
                System.out.println(gt.toString());
            }
        }
    }

    //metodo para visualizar eventos pagos "normal"
    public void visualizarNormal(Vector e) {
        Evento ev;
        Normal nr;
        for (int i = 0; i < e.size(); i++) {
            ev = (Evento) e.elementAt(i);
            if (ev instanceof Normal) {
                nr = (Normal) ev;
                System.out.println(nr.toString());
            }
        }
    }

    //metodo para visualizar eventos pagos "VIP"
    public void visualizarVip(Vector e) {
        Evento ev;
        Vip vp;
        for (int i = 0; i < e.size(); i++) {
            ev = (Evento) e.elementAt(i);
            if (ev instanceof Vip) {
                vp = (Vip) ev;
                System.out.println(vp.toString());
            }
        }
    }

    //metodo para visualizar 
    public void visualizar(String msg) {
        System.out.println(msg);
    }

    //metodo para visualizar vector num criterio
    public void visualizarVectorCriterio(Vector e, byte indice, String msg) {
        System.out.println(msg + e.elementAt(indice).toString());
    }
}
