package Victor_Tesoura;

import java.util.Vector;

public class Adicoes {

    public Adicoes() {

    }
//metodo para adicionar evento gratis

    public Vector AdicionarGratis(Vector e, byte codigo, String nome, String local, String data, String hora, char categoria, char tipo, int lotacao) {
        Gratis g = new Gratis();
        g.setCodigo(codigo);
        g.setNome(nome);
        g.setLocal(local);
        g.setData(data);
        g.setHora(hora);
        g.setCategoria(categoria);
        g.setTipo(tipo);
        g.setLotacao(lotacao);

        e.addElement(g);
        Gratis.cont++;
        e.trimToSize();
        return e;
    }

//metodo para adicionar evento pago "normal"
    public Vector AdicionarNormal(Vector e, byte codigo, String nome, String local, String data, String hora, char categoria, char tipo, int bilhete, double preco, double consumo) {
        Normal n = new Normal();
        n.setCodigo(codigo);
        n.setNome(nome);
        n.setLocal(local);
        n.setData(data);
        n.setHora(hora);
        n.setCategoria(categoria);
        n.setTipo(tipo);
        n.setBilhete(bilhete);
        n.setPreco(preco);
        n.setConsumo(consumo);

        e.addElement(n);
        Normal.cont++;
        e.trimToSize();
        return e;
    }

//metodo para adicionar evento pago "VIP"
    public Vector AdicionarVip(Vector e, byte codigo, String nome, String local, String data, String hora, char categoria, char tipo, int bilhete, double preco, String regalia) {
        Vip v = new Vip();
        v.setCodigo(codigo);
        v.setNome(nome);
        v.setLocal(local);
        v.setData(data);
        v.setHora(hora);
        v.setCategoria(categoria);
        v.setTipo(tipo);
        v.setBilhete(bilhete);
        v.setPreco(preco);
        v.setRegalia(regalia);

        e.addElement(v);
        Vip.cont++;
        e.trimToSize();
        return e;
    }
}
