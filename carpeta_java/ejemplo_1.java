public class ejemplo_1 {
    public static void main(String[] args) {
        /*  al masena 3 numeros entereros, realiza opercaiones aritmeticas +, -, /, * y muestra el 
        resultado en consola */

        int num1 = 9;
        int num2 = 8;
        int num3 = 5;
        

        int sumarNumeros = num1 + num2 + num3;
        int restarNumeros = num1 - num2 - num3;
        int multiplicacionNumeros = num1 * num2 * num3;
        int divisionNumeros = (num1 + num2) / num3;

        System.out.println("La suma de los 3 numeros es: " + sumarNumeros);
        System.out.println("La resta de los 3 numeros es: " + restarNumeros);
        System.out.println("La multiplicacion de los 3 numeros es: " + multiplicacionNumeros);
        System.out.println("La division de los 3 numeros es: " + divisionNumeros);
        

    }
}
