package periodo2clase11ejercicio5;
import java.util.Scanner;
public class Periodo2Clase11Ejercicio5 {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        String cadena = "";
        System.out.println("Ingrese un caracter");
        String caracter = ingresar.nextLine();
        for (int i=1; i<=20; i++){
            cadena = cadena + caracter;
            System.out.println(cadena);
        }
    }
}
