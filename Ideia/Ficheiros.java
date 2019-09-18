/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Victor_Tesoura;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.StringTokenizer;
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

    //metodo para ler o ficheiro de texto "Entrada.txt" e armazenar vector
    public Vector lerTxt(String entrada, Vector e) {
        byte codigo;
        String linha = "", nome, local, data, hora, regalia;
        char tipo, categoria, criterio;
        double preco, consumo;
        int bilhete, lotacao;
        StringTokenizer st;
        
        try {
            FileReader fr = new FileReader(entrada);
            BufferedReader br = new BufferedReader(fr);
            
            linha = br.readLine();
            
            while (linha != null) {
                st = new StringTokenizer(linha, "|");
                
                codigo = Byte.parseByte(st.nextToken());
                nome = st.nextToken();
                local = st.nextToken();
                data = st.nextToken();
                hora = st.nextToken();
                categoria = st.nextToken().charAt(0);
                tipo = st.nextToken().charAt(0);
                
                if (tipo == 'g' | tipo == 'G') {
                    lotacao = Integer.parseInt(st.nextToken());
                    criarGratis(codigo, nome, local, data, hora, categoria, tipo, lotacao, e);
                    Gratis.cont++;
                } else {
                    preco = Double.parseDouble(st.nextToken());
                    bilhete = Integer.parseInt(st.nextToken());
                    criterio = st.nextToken().charAt(0);
                    if (criterio == 'v' | criterio == 'V') {
                        regalia = st.nextToken();
                        criarVip(codigo, nome, local, data, hora, categoria, tipo, bilhete, preco, regalia, e);
                        Vip.cont++;
                    } else {
                        consumo = Double.parseDouble(st.nextToken());
                        criarNormal(codigo, nome, local, data, hora, categoria, tipo, bilhete, preco, consumo, e);
                        Normal.cont++;
                    }
                }
                
                linha = br.readLine();
            }
            br.close();
            
        } catch (FileNotFoundException q) {
            System.out.println(q.getMessage());
        } catch (NumberFormatException | IOException n) {
            System.out.println(n.getMessage());
        }
        return e;
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
