package periodo3clase8ejercicio2;
import java.util.Scanner;
public class Periodo3Clase8Ejercicio2 {
    public static void main(String[] args) {
        Scanner Reader = new Scanner (System.in);
        String quieroJugar ="si";
        while(quieroJugar.equals("si")){
        System.out.println("¿Quieres seguir jugando");
        quieroJugar = Reader.next();
        }
    }
}
