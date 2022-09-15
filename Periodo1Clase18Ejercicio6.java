package periodo1clase18ejercicio6;
import java.util.Scanner; 
public class Periodo1Clase18Ejercicio6 {
    public static void main(String[] args) {
    double valor, descuento, recargo, total;
    String tipo_pago;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Ingrese el valor de la compra: ");
    valor = entrada.nextDouble();
    System.out.println("Ingrese el tipo de pago: ");
    tipo_pago=entrada.next();
    descuento=0.05*valor;
    recargo=0.03*valor;
    if (tipo_pago.equalsIgnoreCase("contado"));
    System.out.println("El descuento es: " + descuento);
    total=valor -descuento;
    System.out.println("El total es: " + total);
    }
    else if (tipo_pago.equalsIgnoreCase("tarjeta")){
    System.out.println("El recargo es: " + recargo);
    total=valor +recargo;
    System.out.println("El total es: " + total);
    }
    else {
    System.out.println("Metodo de pago invalido");
    }
   
}
