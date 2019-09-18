package Victor_Tesoura;

import java.util.Vector;

public class Remocao {

    public Remocao() {

    }

    //metodo para procurar evento e remover
    public Vector Remover(Vector e, byte i) {
        Evento ev = (Evento) e.elementAt(i - 1);
        e.removeElementAt(i - 1);
        e.trimToSize();
        if (ev instanceof Gratis) {
            Gratis.cont--;
        } else if (ev instanceof Normal) {
            Normal.cont--;
        } else {
            Vip.cont--;
        }
        return e;
    }

}
