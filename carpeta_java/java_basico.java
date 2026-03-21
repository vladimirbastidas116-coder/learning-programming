public class java_basico{
    public static void main(String[] args) {
        // system.out.println("hola mundo"); => ESTE PERMITE ESCRIBIR EN la consola 
        System.err.println("hola mundo");

        /*-------------------------------------------------------- */

        // String => permite definir caracteres 
        String cod = "hola";//puede almacenar varias letras o caracteres

        // char => sirve para definir un solo caracter
        char caracter = 'a'; //puede almacenar un solo caracter

        /*-------------------------------------------------------- */

        //byte => sirve para definir numeros enteros pequeños
        final byte nu = 127; //puede almacenar asta 127 numeros enteros

        // int=> sirve para definir numeros enteros
        int numero = 5; //pudee almacenar asta 2,147,483,647 numeros enteros

        //short => sirve para definir numeros enteros medianos
        short numeroMediano = 32767; //puede almacenar asta 32,767 numeros enteros
        
        //long => sirve para definir numeros enteros grandes
        long numeroGrande = 9223372036854775807L; //puede almacenar asta 9,223,372,036,854,775,807 numeros enteros

        // float => sirve para definir numeros decimales
        float decimal = 3.5f; //puede almacenar asta 7 digitos decimales

        // double => sirve para definir numeros decimales con mayor
        double decimalGrande = 5.6789; //puede almacenar asta 15 digitos decimales


        /*--------------------------------------------------------- */


        // boolean => sirve para definir valores logicos (true o false)
        boolean verdadero = true; //puede almacenar true o false
        
        /*operadores logicos como 
        //---------------------------------------------------------
        and = (y)se esxpresa con &&
        or = (o)se esxpresa con ||
        not = (negacion)se esxpresa con !

        //---------------------------------------------------------
        // operadores de comparacion
        > = (mayor que)
        < = (menor que)
        == (igualdad)
        != (diferente) tambien se puede expresar con <> o como negacion de la igualdad !(==)

        //---------------------------------------------------------
        // estructuras condicionales
        if = (si) //sirve para ejecutar un bloque de codigo si se cumple una condicion
        else = (sino) //sirve para ejecutar un bloque de codigo si no se cumple una condicion
        else if = (sino si) //sirve para ejecutar un bloque de codigo si se cumple otra condicion
        elif = (sino si) //sirve para ejecutar un bloque de codigo si se cumple otra condicion
        switch = (segun) se ussa con (case) para evaluar una variable y ejecutar un bloque de codigo segun su valor
        break = (romper) se usa para salir de un bloque de codigo en un switch o en un ciclo
        case = (caso)
        */


        /*--------------------------------------------------------- */
        // ciclos o bucles
        /*siclos o bucles comos se hacen, definiciones 
        y condiciones para repetir un bloque de codigo asta que se cumpla una condicion
        
        (como se crea un ciclo for, while, do while)
        FOR = (para) se usa para repetir un bloque de codigo un numero determinado de veces
        WHILE = (mientras) se usa para repetir un bloque de codigo mientras se cumpla una condicion
        DO WHILE = (hacer mientras) se usa para repetir un bloque de codigo 
        mientras se cumpla una condicion, pero se ejecuta al menos una vez
        */

        //FOR
        for (int i = 0; i < 5; i++) {
            System.out.println("hola mundo " + i);
        }
        /*funcionaminto del ciclo for
        1. se inicializa la variable i con el valor 0 
        2. se evalua la condicion i < 5, si es verdadera 
        se ejecuta el bloque de codigo dentro del ciclo
        3. se incrementa el valor de i en 1 (i++) y se vuelve a evaluar la condicion
        4. el ciclo se repite asta que la condicion i < 5 sea falsa
        */

        //WHILE
        int j = 0; //se inicializa la variable j con el valor 0
        while (j < 5) {
            System.out.println("hola mundo " + j);
            j++; //incrementa el valor de j en 1
        }

        /*funcionamiento del ciclo while
        1. se inicializa la variable j con el valor 0
        2. se evalua la condicion j < 5, si es verdadera 
        se ejecuta el bloque de codigo dentro del ciclo
        3. se incrementa el valor de j en 1 (j++) y se vuelve a evaluar la condicion
        4. el ciclo se repite asta que la condicion j < 5 sea falsa
        */

        //DO WHILE
        int k = 0; //se inicializa la variable k con el valor 0 
        do {
            System.out.println("hola mundo " + k);
            k++; //incrementa el valor de k en 1
        } while (k < 5);

        /*funcionamiento del ciclo do while
        1. se inicializa la variable k con el valor 0
        2. se ejecuta el bloque de codigo dentro del ciclo
        3. se incrementa el valor de k en 1 (k++) y se evalua la condicion k < 5
        4. el ciclo se repite asta que la condicion k < 5 sea falsa
        */


        //Funciones o metodos
        //llamar funcion 

        sinretorno();

        /*
        cracion de clases y heredadas 
        */

        //creaccion de clases y heredadas
        /*
        que es una clase: una clase es una plantilla para crear objetos y objetos son 
        instancias de una clase que sirven para almacenar datos y realizar operaciones

        heredadas: son clases que heredan de otra clase para heredar sus atributos y metodos 
        */

        //crear clase y heredada

        //creacion de objetos
        /*
        que es un objeto: un objeto es una instancia de una clase que sirve para almacenar 
        datos y realizar operaciones
        */

        //crear clase

        

    }
    // creaciion de funciones o metodos
    /*funciones o metodos como se crean, definiciones y ejemplos
    como funciona: se define una funcion o metodo con un nombre, un tipo de dato de 
    retorno y parametros (si es necesario) 
    */
    
    /*
    la funcion va fuera del main, no puede estar dentro del main, pero 
    si puede ser llamada dentro del main 
    */
    
    
    // crear funcion o metodo sin parametros y sin retorno completo
    public static void sinretorno() {
        System.out.println("hola mundo");
    }
}


