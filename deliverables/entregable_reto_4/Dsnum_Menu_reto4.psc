Proceso Dsnum_Menu
	// Aquí declaramos las variables:
	// menu será la opción que elija el usuario
	// num1 y num2 serán los números con los que trabajaremos
	// suma, resta, multi y div son variables para resultados
	Definir menu Como Entero;
	Definir num1, num2 Como Real;
	Definir suma, resta, multi, div Como Real;
	
	// Mensaje de bienvenida
	Escribir "__--bienvenido--__";
	
	// Pedimos al usuario el primer número
	Escribir "ingrese el primer numero: ";
	Leer num1;
	
	// Pedimos el segundo número
	Escribir "ingrese el segundo numero: ";
	Leer num2;
	
	// Mostramos un pequeño menú con las operaciones disponibles
	Escribir "__--Que operacion te gustaria realizar--__";
	Escribir "[1]. Sumar";
	Escribir "[2]. Restar";
	Escribir "[3]. Multiplicar";
	Escribir "[4]. Dividir";
	Escribir "[5]. Todas";
	
	// Aquí el usuario elige la opción deseada
	Leer menu;
	
	// Usamos Segun para ejecutar la opción que seleccione el usuario
	Segun menu Hacer
		1:
			// Opción 1 Suma
			Escribir "vamos a sumar valor_1: ", num1 , " y valor_2: ", num2;
			Escribir "el resultado de la suma es: ", num1 + num2;
			
		2:
			// Opción 2 Resta
			Escribir "vamos a restar valor_1: ", num1 , " y valor_2: ", num2;
			Escribir "el resultado de la resta es: ", num1 - num2 ;
			
		3:
			// Opción 3 Multiplicación
			Escribir "vamos a multiplicar valor_1: ", num1 , " y valor_2: ", num2;
			Escribir "el resultado de la multiplicacion es: ", num1 * num2;
			
		4:
			// Opción 4 División
			// Primero revisamos que num2 no sea 0, porque no se puede dividir entre cero
			Si num2 = 0 Entonces
				Escribir "__--No se puede realizar la operacion entre 0--__";
			SiNo
				Escribir "vamos a dividir valor_1: ", num1 , "y valor_2: ", num2;
				Escribir "el resultado de la divicion es: ", num1 / num2;
			FinSi
			
		5:
		    // Opción 5  Hacer todas las operaciones con los dos números
		    Escribir "vamos a realizar todas las operaciones con los valores: ", num1 ," y ",num2;
			
			Escribir "el resultado de la suma es: ", num1 + num2;
			Escribir "el resultado de la resta es: ", num1 - num2 ;
			Escribir "el resultado de la multiplicacion es: ", num1 * num2;
			
			// Verificamos nuevamente si se puede dividir o no
			Si num2 = 0 Entonces
				Escribir "__--No se puede realizar la divicion entre 0--__";
			SiNo
				Escribir "el resultado de la divicion es: ", num1 / num2;
			FinSi
			
		De Otro Modo:
			// Si el usuario ingresa una opción que no existe
			Escribir "__--ingreso no valido--__";
	FinSegun
	
FinProceso