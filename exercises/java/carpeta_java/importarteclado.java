//para importar se hace en la parte superior del codigo, antes de la clase
import java.util.Scanner; //esto es para importar la clase Scanner que se encuentra en el paquete java.util

public class importarteclado {
    public static void main(String[] args) {

        /*primero imprimimos un mensaje de bienvenida el cual le diga al usuario 
        que ingresar en el teclado */

        System.out.println("Bienvenido, por favor ingresa un numero entero: ");
        //luego creamos un objeto de la clase Scanner para poder leer lo que el usuario ingresa en el teclado
        Scanner teclado = new Scanner(System.in); //esto es para crear un objeto de la clase
        
        //luego usamos el metodo nextInt() para leer un numero entero que el usuario ingresa en el teclado
        int numero = teclado.nextInt(); //esto es para leer un numero entero que el usuario dijite 
        
        System.out.println("El numero que ingresaste es: " + numero);//esto es para mostrar en consola el numero que el usuario ingresó

        // cerraar el objeto Scanner para liberar recursos
        teclado.close();
    }
}
