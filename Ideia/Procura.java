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
public class Procura {

    public Procura() {
    }

    //metodo para procurar o evento mais caro
    public byte maisCaro(Vector e) {
        byte indice = 0;
        double preco = 0;
        Evento ev;
        Pago pg;
        for (byte i = 0; i < e.size(); i++) {
            ev = (Evento) e.elementAt(i);
            if (ev instanceof Pago) {
                pg = (Pago) ev;
                if (pg.getPreco() > preco) {
                    preco = pg.getPreco();
                    indice = i;
                }
            }
        }
        return indice;
    }

    //metodo para procurar o evento com menor numero de bilhetes
    public byte menorBilhetes(Vector e) {
        byte indice = 0;
        double bilhetes = 0;
        Evento ev;
        Pago pg;
        for (byte i = 0; i < e.size(); i++) {
            ev = (Evento) e.elementAt(i);
            if (ev instanceof Pago) {
                pg = (Pago) ev;
                if (bilhetes > pg.getBilhete()) {
                    bilhetes = pg.getBilhete();
                    indice = i;
                }
            }
        }
        return indice;
    }

    //metodo para procurar evento por categoria
    public void procurarCategoria(Vector e) {
        char x = ' ';
        Evento ev;
        Validacoes vn = new Validacoes();
        x = vn.ValidarCategoria("Escolha a categoria: (F - Festa, M - Musica, A - Artes e G - Gastronomia)");

        for (byte i = 0; i < e.size(); i++) {
            ev = (Evento) e.elementAt(i);
            if (ev.getCategoria() == x) {
                Visualizacoes v = new Visualizacoes();
                v.visualizarVectorCriterio(e, i, "Evento da categoria selecionada: ");
            }
        }
    }

    //metodo para ordenar Vector de ojectos pelo preco
    public Vector ordenarPreco(Vector e) {
        int maior;
        Evento ev;
        Pago pg, pg2;

        for (byte i = 0; i < e.size() - 1; i++) {
            ev = (Evento) e.elementAt(i);
            if (ev instanceof Pago) {
                maior = encontraMaior(i, e);
                pg = (Pago) e.elementAt(i);
                pg2 = (Pago) e.elementAt(maior);
                e.setElementAt(pg2, i);
                e.setElementAt(pg, maior);
            }
        }
        e.trimToSize();
        return e;
    }

    //metodo para procurar o maior valor
    public int encontraMaior(int c, Vector e) {
        Evento ev;
        Pago pg, pg2;

        for (int k = c + 1; k < e.size(); k++) {
            ev = (Evento) e.elementAt(k);
            if (ev instanceof Pago) {
                pg = (Pago) e.elementAt(k);
                pg2 = (Pago) e.elementAt(c);

                if (pg.getPreco() > pg2.getPreco()) {
                    c = k;
                }
            }
        }
        return c;
    }

    //metodo para verificar se o codigo existe
    public byte incrementoCodigo(Vector e) {
        Evento ev;
        byte x = 1;
        for (int i = 0; i < e.size(); i++) {
            ev = (Evento) e.elementAt(i);
            while (ev.getCodigo() == x) {
                x++;
            }
        }
        return x;
    }

    //metodo para verificar o tipo de evento
    public void verificar(byte i, Vector e) {
        Edicoes ed = new Edicoes();
        Validacoes vn = new Validacoes();
        Evento ev = (Evento) e.elementAt(i - 1);
        if (ev instanceof Gratis) {
            ed.EditarGratis(e, i, vn.ValidarString("Digite o nome do evento"), vn.ValidarString("Digite o local do evento"), vn.validarData("Digite a data do evento (dd-MM-aaaa)"), vn.validarHora("Digite a hora do evento"), vn.ValidarCategoria("Digite a categoria do evento (Festa, Musica, Gastronomia, Arte ou Conferencia)"), 'G', (int) vn.ValidarDouble(10, 99999, "Digite lotacao do evento (10-99999"));
        } else if (ev instanceof Normal) {
            ed.EditarNormal(e, i, vn.ValidarString("Digite o nome do evento"), vn.ValidarString("Digite o local do evento"), vn.validarData("Digite a data do evento (dd-MM-aaaa)"), vn.validarHora("Digite a hora do evento"), vn.ValidarCategoria("Digite a categoria do evento (Festa, Musica, Gastronomia, Arte ou Conferencia)"), 'N', (int) vn.ValidarDouble(10, 99999, "Digite o numero de bilhetes (10-99999"), vn.ValidarDouble(10, 99999, "Digite o preco dos bilhetes (10-99999"), vn.ValidarDouble(10, 99999, "Digite o consumo minimo (10-99999"));
        } else {
            ed.EditarVip(e, i, vn.ValidarString("Digite o nome do evento"), vn.ValidarString("Digite o local do evento"), vn.validarData("Digite a data do evento (dd-MM-aaaa)"), vn.validarHora("Digite a hora do evento"), vn.ValidarCategoria("Digite a categoria do evento (Festa, Musica, Gastronomia, Arte ou Conferencia)"), 'V', (int) vn.ValidarDouble(10, 99999, "Digite o numero de bilhetes (10-99999"), vn.ValidarDouble(10, 99999, "Digite o preco dos bilhetes (10-99999"), vn.ValidarString("Digite a regalia do evento"));
        }
    }
}
