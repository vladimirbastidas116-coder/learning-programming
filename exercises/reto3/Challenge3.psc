Algoritmo Challenge3
	Definir Dad, Acum, Num_Lanz, Op1, Op2, Op3, Op4, Op5, Op6 Como Entero
	Op1 = 0; Op2 = 0; Op3 = 0; Op4 = 0; Op5 = 0; Op6= 0
	Escribir "Enter the number of dice rolls"
	Leer Num_Lanz
	Dad = Aleatorio (1, 6)
	para Acum = 1 Hasta Num_Lanz Con Paso 1 Hacer
		Escribir " The roll " Acum " was equal to " Dad
		Segun Dad Hacer
			1: Op1 = Op1 + 1
			2: Op2 = Op2 + 1
			3: Op3 = Op3 + 1
			4: Op4 = Op4 + 1
			5: Op5 = Op5 + 1
			6: Op6 = Op6 + 1
		FinSegun
	FinPara
	Escribir " The number one came out "  Op1 " times. "
	Escribir " The number two came out "  Op2 " times. "
	Escribir " The number three came out "  Op3 " times. "
	Escribir " The number four came out "  Op4 " times. "
	Escribir " The number five came out "  Op5 " times. "
	Escribir " The number six came out "  Op6 " times. "
FinAlgoritmo
