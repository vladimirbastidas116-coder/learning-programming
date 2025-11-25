Proceso Entregable_1
	// definiciones
	Definir dado1, dado2, sumea, par1, par2 Como Entero;
	
	// Mensaje de bienvenida
	Escribir "¡Bienvenido! ¿Te gustaría tirar los dados";
	Escribir "¡Perfecto! Iniciando el lanzamiento de los dados...";
	
	// Se espera a que el usuario presione una tecla para comenzar
	Esperar Tecla;
	
	// Se generan los valores aleatorios entre 1 y 6 para cada dado 
	dado1 <- Aleatorio(1,6);
	dado2 <- Aleatorio(1,6);
	
	// Se muestran los valores obtenidos en cada variable dado
	Escribir "dado1: ", dado1;
	Escribir "dado2: ", dado2;
	
	// Se compara si ambos dados tienen el mismo valor
	Si dado1 = dado2 Entonces
		// Si son iguales YOU WIN
		Escribir "YOU WIN";
	SiNo
		// Si son diferentes GAME OVER
		Escribir "GAME OVER";
	FinSi
	
	// Se obtiene el residuo para saber si cada dado es par o impar
	par1 <- dado1 MOD 2;	
	par2 <- dado2 MOD 2;	
	
	// Se verifica si el dado 1 es par o impar
	Si par1 = 0 Entonces
		Escribir "__--El valor obtenido en el dado 1 es par--__";
	SiNo
		Escribir "__--El valor obtenido en el dado 1 es impar--__";
	FinSi
	
	// Se verifica si el dado 2 es par o impar
	Si par2 = 0 Entonces
		Escribir "__--El valor obtenido en el dado 2 es par--__";
	SiNo
		Escribir "__--El valor obtenido en el dado 2 es impar--__";
	FinSi
	
FinProceso
