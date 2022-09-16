package periodo2clase10ejercicio4;
import java.util.Scanner;
public class Periodo2Clase10Ejercicio4 {
    public static void main(String[] args) {
        int suma = 0, num;
        double promedio;
        Scanner ingresar = new Scanner(System.in);
        for(int i=1; i<=5; i++){
            System.out.println("Ingrese el numero " +i);
            num = ingresar.nextInt();
            suma = suma + num;     //Acumulador
        }
        promedio = suma / 5;
        System.out.println("El promedio es " +promedio);
    
    }
    
}
