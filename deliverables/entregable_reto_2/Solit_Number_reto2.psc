Proceso Solit_Number
	// Definimos de variables: num1 será el número que ingresa el usuario
	// y div será el resultado de sacar el módulo (residuo) de ese número entre 2
	Definir num1, div Como real;
	
	// Mensaje de bienvenida para el usuario
	Escribir "__--bienvenido--__";
	
	// Pedimos que ingrese un número, puede ser positivo o negativo
	Escribir "ingrese un numero(positivo o negativo)--__";
	
	// Aquí el usuario escribe el número y lo guardamos en num1
	Leer num1;
	
	// Mostramos el número ingresado para confirmar
	Escribir "numero ingresado: ", num1;
	
	// Calculamos el residuo de dividir el número entre 2
	// Si el residuo es 0 -> es par, si es diferente de 0 -> es impar
	div <- num1 MOD 2;
	
	// Comprobamos si el residuo es igual a 0
	Si div = 0 Entonces
		// Si lo es, el número es par
		Escribir "__--El valor ingresado corresponde a un número par--__";
	SiNo
		// Si no, el número es impar
		Escribir "__--El valor ingresado corresponde a un número impar--__";
	FinSi

FinProceso
