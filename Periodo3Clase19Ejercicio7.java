package periodo3clase19ejercicio7;
import java.util.Scanner;
public class Periodo3Clase19Ejercicio7{
    public static void main(String[] args){
        Scanner objeto = new Scanner(System.in);
        int numero1, numero2, respuesta, contador;
        System.out.println("Ingresa el primer numero: ");
        numero1 = objeto.nextInt();
        System.out.println("Ingresa el segundo numero: ");
        numero2 = objeto.nextInt();
        contador=numero1;
        while (contador > numero2){
            System.out.println(contador);
            contador--;
        }
    }
}