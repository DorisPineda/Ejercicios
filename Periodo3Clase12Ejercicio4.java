package periodo3clase12ejercicio4;
import java.util.Scanner;
public class Periodo3Clase12Ejercicio4 {
    public static void main(String[] args) {
        int suma = 0, cant = 0, valor, promedio;
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Ingrese 0 para salir");
            System.out.println("Ingrese el valor");
            valor=entrada.nextInt();
            if(valor != 0){
                suma = suma + valor;
                cant = cant +1;
            }
        } while (valor != 0);
        if(cant != 0){
            promedio = suma / cant;
            System.out.println("El proemdio es: " +promedio);
        } else {
            System.out.println("No se ingresaron valores");
        }
    }
}