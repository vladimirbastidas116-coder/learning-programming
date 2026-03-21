import java.util.Scanner;

/*Calcular e imprimir el valor de la boleta de cine del grupo familiar, teniendo 
en cuenta las siguientes condiciones:
Adulto (mayor igual de 18 años) 1000
Menor de edad 500
Al ingresar se debe digitar el número de niños y adultos a ingresar. 
Asimismo, se aplican los siguientes descuentos:
20% descuento (si la familia tiene estrato 1,2 y 3)
Si tienen afiliación Caja de Compensación (10% de descuento) */

public class ingresodeadultomenor {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("GRUPO FAMILIAR DE INGRESO");
        System.out.println("Ingrese el numero de adultos: ");
        int adultos = teclado.nextInt();
        System.out.println("Ingrese el numero de menores: ");
        int menores = teclado.nextInt();
        
        System.out.println("Laspersonas con estrato 1,2 y 3 tienen un descuento del 20%");
        System.out.println("Las personas con afiliacion a caja de compensacion tienen un descuento del 10%");
        System.out.println("si tine caja de conpecacion ingrese (0)");
        System.out.println("Ingrese el estrato socioeconomico (1, 2, 3, 4, 5 o 6): ");

        int estrato = teclado.nextInt();

        if (estrato >= 1 && estrato <= 3) {
            float totalAdultos = adultos * 1000;
            float totalMenores = menores * 500;
            float totalSinDescuento = totalAdultos + totalMenores;
            float totalConDescuento = totalSinDescuento * 0.2f; 
            System.out.println("El valor total con descuento por estrato es: " + totalConDescuento);
            System.out.println("total a pagar con descuento por estrato es: " + (totalSinDescuento - totalConDescuento));
        } else if (estrato == 0) {
            float totalAdultos = adultos * 1000;
            float totalMenores = menores * 500;
            float totalSinDescuento = totalAdultos + totalMenores;
            float totalConDescuento = totalSinDescuento * 0.1f;
            System.out.println("El valor total con descuento por caja de compensación es: " + totalConDescuento);
            System.out.println("total a pagar con descuento: " + (totalSinDescuento - totalConDescuento));
        } else if (estrato >= 4 && estrato <= 6) {
            float totalAdultos = adultos * 1000;
            float totalMenores = menores * 500;
            float totalSinDescuento = totalAdultos + totalMenores;
            System.out.println("El valor a pagar es de : " + totalSinDescuento);
        } else {
            System.out.println("Estrato no válido. Por favor, ingrese un estrato entre 1 y 6.");
        }

        teclado.close();



    }
}