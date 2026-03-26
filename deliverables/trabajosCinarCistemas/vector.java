public class vector {
    public static void main(String[] args) {
        int ancho = 6;
        int[] numeros = {25,4,6,3,8,2};

        int contador = 0;
        int sumando = 0;

        for (contador = 0; contador < ancho; contador++) {
            System.out.println(numeros[contador]);
            sumando += numeros[contador];
        }

        System.out.println("la suma es: " + sumando);
    }
}
