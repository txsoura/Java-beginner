/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Victor_Tesoura;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Victor
 */
public class Ficheiros {

    public Ficheiros() {
    }

    //metodo para criar evento gratis
    public void criarGratis(byte codigo, String nome, String local, String data, String hora, char categoria, char tipo, int lotacao, Vector e) {
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
    }

    //metodo para criar evento pago "normal"
    public void criarNormal(byte codigo, String nome, String local, String data, String hora, char categoria, char tipo, int bilhete, double preco, double consumo, Vector e) {
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
    }

    //metodo para criar evento pago "VIP"
    public void criarVip(byte codigo, String nome, String local, String data, String hora, char categoria, char tipo, int bilhete, double preco, String regalia, Vector e) {
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
    }

    //metodo para ler o vector e gravar no ficheiro de objectos "Saida.dat"
    public void gravarObj(String ficheiro, Vector e) throws IOException {

        try {
            FileOutputStream fos = new FileOutputStream(ficheiro);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(e);
            oos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Ficheiros.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Ficheiros.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
