/*programa que permite ingresar para una empresa que maneja transacciones para los productos 
para decir cual es el inventario actual del producto con la sigueinre informacion 
existecia anterior, compras,devoluciones del cliente, averias, ventas,devoluciones de compra
y vizualizar la respuesta   
*/

// importamos la clase Scanner para poder leer datos desde la consola
import java.util.Scanner;

public class empresaingresos {
    public static void main(String[] args) {

        //ingreso de datos para el producto y sus transacciones
        //inicializaciones de variables para almacenar los datos ingresados por el usuario
        int existenciaAnterior = 0;
        int compras = 0;
        int devolucionesCliente = 0;
        int averias = 0;
        int ventas = 0;
        int devolucionesCompra = 0;

        // creamos un objeto Scanner para leer datos desde la consola
        Scanner objeto = new Scanner(System.in);
        
        // mostramos un mensaje de bienvenida y solicitamos el nombre del producto
        System.out.println("binvenido a SuperMarker");
        System.out.println("que producto desea ingresar: ");
        //ingreso del nombre del producto
        String producto = objeto.nextLine();

        // solicitamos la existencia anterior del producto
        System.out.println("ingrese la existencia anterior del producto : ");
        existenciaAnterior = objeto.nextInt();

        // solicitamos las compras del producto
        System.out.println("ingrese las ingreso o compras del producto : ");
        compras = objeto.nextInt();

        // solicitamos las devoluciones del cliente
        System.out.println("ingrese las devoluciones del cliente : ");
        devolucionesCliente = objeto.nextInt();

        // solicitamos las averias del producto
        System.out.println("ingrese lacantidad de averias del producto : ");
        averias = objeto.nextInt();

        // solicitamos las ventas del producto
        System.out.println("ingrese las ventas del producto : ");
        ventas = objeto.nextInt();

        // solicitamos las devoluciones de compra del producto
        System.out.println("ingrese las devoluciones de compra del producto : ");
        devolucionesCompra = objeto.nextInt();

        // calculamos el inventario actual del producto utilizando la fórmula dada
        int inventarioActual = existenciaAnterior + devolucionesCliente + compras - averias - ventas - devolucionesCompra; 


        // mostramos el inventario actual del producto
        
        
        if (inventarioActual <0){
            System.out.println("__-------error de ingreso-------__");
            System.out.println("el inventario actual del producto es negativo, revise los datos ingresados");
        }else if (inventarioActual == 0){
            System.out.println("existecia del producto agotada: " + inventarioActual );
        }else{
            System.out.println("El inventario actual del producto es: " + inventarioActual);
        }
    objeto.close();
    }
}
