import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programa44{
 public static void main (String[]args){
 byte n=0;
 int total=0;
 n=validar();
   total=calculo(n);
   visualizar(total);
 }

 public static int calculo(byte n){
   if(n==1){
    return 1;
   }else{
    return n+calculo((byte)(n-1));
   }
 }

 //Metodo para validar todas entradas do tipo "Byte"
    public static byte validar() {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        byte x = 0;
        do {
            System.out.println("Digite o numero (0 - 127)");
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
    public static void visualizar(int x){
     System.out.println("A soma e: "+x);
    }
}