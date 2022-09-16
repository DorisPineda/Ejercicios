package periodo2clase8ejercicio3;
import java.util.Scanner;
public class Periodo2Clase8Ejercicio3 {
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int numero;
        numero = ingresar.nextInt();
        for(int i =1; i<=10; i++){
            System.out.println(numero +" * " + i + " = " + numero * i);
        }
    }
}
