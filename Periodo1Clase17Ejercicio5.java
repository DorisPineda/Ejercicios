package periodo1clase17ejercicio5;
import java.util.Scanner;
public class Periodo1Clase17Ejercicio5 {
    public static void main(String[] args) {
    String nombre,clave;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese Nombre de usuario: ");
    nombre = entrada.nextLine();
    System.out.println("Ingrese Clave de usuario: ");
    clave = entrada.nextLine();
    if(nombre.equals("juan") && clave.equals("123456"));
    System.out.println("Binvenido al Sistema");
    }
    else{
    System.out.println("Nombre de Usuario o contraseña Incorrecto");
    }
    }
}