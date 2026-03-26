import java.util.Scanner;

public class vendedor {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float comicion = 0.0f; 
        String texto = "";  

        System.out.println("Ingrese el nombre del vendedor: ");
        String nombre = teclado.nextLine();

        System.out.println("Ingrese el valor de la primero venta #1: ");
        float venta1 = teclado.nextFloat();

        System.out.println("Ingrese el valor de la segundo venta #2: ");
        float venta2 = teclado.nextFloat();

        System.out.println("Ingrese el valor de la tercer venta #3: ");
        float venta3 = teclado.nextFloat();

        float ventaTotal = venta1 + venta2 + venta3;
        
        System.out.println("El total de la venta echa por " + nombre + " es: " + ventaTotal );
        
        if (ventaTotal > 5000000){
            System.out.println("================__________=====================");
            texto  = "mayor a 5.000.000, (su comicion es del 10%)";
            comicion = 0.10f ; 
        }
        else if (ventaTotal == 0){
            System.out.println("================__________=====================");
            texto = "igual a 0, (su comicion es del 0%)";
            System.out.println(texto);
        }
        else {
            System.out.println("================__________=====================");
            texto = "menor a 5.000.000, (su comicion es del 5%)";
            comicion =  0.05f; 
            System.out.println("su comision es de " + comicion );
        }
        float totalComicion = ventaTotal * comicion;
        System.out.println("su venta total es " + texto);
        System.out.println("su comision es de " + totalComicion );
        teclado.close();
    }
    
}
