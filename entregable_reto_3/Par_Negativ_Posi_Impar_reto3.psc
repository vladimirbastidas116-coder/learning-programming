Proceso Par_Negativ_Posi_Impar
	// definiciones 
	// Aquí declaramos las variables:
	// num1 guardará el número que escribe el usuario
	// div guardará el residuo de dividir ese número entre 2
	Definir num1, div Como real;
	
	//outputs:
	// Mensaje de bienvenida para el usuario
	Escribir "__--bienvenido--__";
	
	// Pedimos que ingrese un número (puede ser positivo o negativo)
	Escribir "ingrese un numero(positivo o negativo)--__";
	
	// Guardamos en num1 el número que el usuario escriba
	Leer num1;
	
	// Mostramos el número para confirmar lo que se ingresó
	Escribir "numero ingresado: ", num1;
	
	// Calculamos el residuo de dividir num1 entre 2
	// Si el residuo es 0 número par
	// Si el residuo es distinto de 0  número impar
	div <- num1 MOD 2;
	
	// Aquí revisamos si el número es positivo
	Si num1 >= 0 Entonces
		// Si es mayor o igual a 0 el numero es pocitivo 
		Escribir "El numero ingresado es positivo";
		
		// Ahora verificamos si es par o impar
		Si div = 0 Entonces
			// Si el residuo es 0 par
			Escribir "__--El valor ingresado corresponde a un número par--__";
		SiNo
			// Si el residuo NO es 0 impar
			Escribir "__--El valor ingresado corresponde a un número impar--__";
		FinSi
		
	SiNo
		// Si num1 no es mayor ni igual a 0  es negativo
		Escribir "__--El valor ingresado es negativo--__";
		
		// Igual que arriba, revisamos si es par o impar
		Si div = 0 Entonces
			Escribir "__--El valor ingresado corresponde a un número par--__";
		SiNo
			Escribir "__--El valor ingresado corresponde a un número impar--__";
		FinSi
	FinSi
	
FinProceso
