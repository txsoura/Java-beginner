import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programa45{
 public static void main (String[]args){
 byte base=0,expoente=0;
 int total=0;
 base=validar("Digite o valor da base");
 expoente=validar("Digite o valor do expoente");
   total=calculo(base,expoente);
   visualizar(base,expoente,total);
 }

 public static int calculo(byte b,byte e){
   if(e==0 && b==0){
    return 0;
   }else if(e==0){
    return 1;
   }else if(e==1){
    return b;
   }else{
    return b*calculo(b,(byte)(e-1));
   }
 }

 //Metodo para validar todas entradas do tipo "Byte"
    public static byte validar(String msg) {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        byte x = 0;
        do {
            System.out.println(msg);
            try {
                x = Byte.parseByte(bf.readLine());
            } catch (NumberFormatException | IOException ex) {
                System.out.println(ex.getMessage());
            }
            if (x < 0 || x > 127) {
                System.out.println("Numero invalido, tem de estar no intervalo entre 0 e 127!");
            }
        } while (x < 0 || x > 127);

        return x;
    }

    //Metodo para visualizar
    public static void visualizar(byte b, byte e,int x){
     System.out.println("Base "+b+", Expoente "+e+", Resultado "+x);
    }
}