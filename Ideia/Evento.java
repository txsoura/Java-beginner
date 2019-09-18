//Numa pequena cidade cultural, há necessidade de se criar uma agenda eletrónica para fazer gestão dos eventos para uma melhor organização.
//Os dados importantes dos mesmos são: código (único), nome, local, data, hora de inicio, categoria (musica, gastronomia, festas, conferencia, formações, 
//artes, desporto), tipo de acesso (grátis ou pago), preço e quantidade de bilhetes. 
//
//A mesma visa permitir ao usuário: 
//•	visualizar detalhadamente as informações dos eventos; 
//•	visualizar os eventos dum determinado local, data ou categoria;
//•	Saber o numero de todos os eventos, bem como os pagos ou grátis;
//•	Calcular o valor que será arrecadado por todos eventos, bem como por um evento especifico;
//•	Visualizar o evento com maior valor arrecado;
//•	Ordenar os eventos por datas, categorias.
package Victor_Tesoura;

import java.io.Serializable;

/**
 *
 * @author Victor
 */
public class Evento implements Serializable {

    protected byte codigo;
    protected String nome, local, data, hora;
    protected char tipo, categoria;

    public Evento(byte codigo, String nome, String local, String data, String hora, char categoria, char tipo) {
        this.codigo = codigo;
        this.nome = nome;
        this.local = local;
        this.data = data;
        this.hora = hora;
        this.categoria = categoria;
        this.tipo = tipo;
    }

    public Evento() {
        this((byte) 0, "", "", "", "", ' ', ' ');
    }

    public byte getCodigo() {
        return codigo;
    }

    public void setCodigo(byte codigo) {
        if (codigo > 0) {
            this.codigo = codigo;
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setTipo(char tipo) {
        if (tipo == 'g' | tipo == 'G' | tipo == 'p' | tipo == 'P') {
            this.tipo = tipo;
        }
    }

    @Override
    public String toString() {
        return "Codigo=" + codigo + ", Nome=" + nome + ", Local=" + local
                + ", Data=" + data + ", Hora de inicio=" + hora + ", Categoria=" + categoria;
    }

}
