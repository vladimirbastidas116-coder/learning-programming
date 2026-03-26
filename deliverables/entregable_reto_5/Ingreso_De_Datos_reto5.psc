Proceso Ingreso_De_Datos
	Definir  nacimien,telefono, comprovar Como Entero;
	Definir nombres, apellidos, genero, tip_ide, direccion Como Caracter;
	Definir salario, porsalario, finsalario  Como Real;
	
	
	Escribir "Bienvenido porfavor ingrese los siguientes datos--__";
	
	Repetir
		Escribir "ingrese	Tipo de identificación (CC, PS, CE, CI) MAYUSCULAS: ";
		Leer tip_ide;
		Si tip_ide = "CC" Entonces
			Escribir "____________________________";
			comprovar <- 1;
		SiNo
			Si tip_ide = "PS" Entonces
				Escribir "____________________________";
				comprovar <- 1;
			SiNo
				Si tip_ide = "CE" Entonces
					Escribir "____________________________";
					comprovar <- 1;
				SiNo
					Si tip_ide = "CI" Entonces
						Escribir "____________________________";
						comprovar <- 1;
					SiNo
						Escribir "__--ingreso no valido intaentalo denuevo--__ ";
						Escribir "_____________________________________";
						comprovar <- 0;
					FinSi
				FinSi
			FinSi
		FinSi
	Hasta Que comprovar = 1 
	
	Escribir "Ingrese sus nombres: ";
	Leer nombres;
	Escribir "ingrese sus apellidos: ";
	Leer apellidos;
	
	comprovar <- 0 ;
	
	Repetir
		Escribir "Ingrese su genero: ";
		Escribir "M (Masculino)";
		Escribir "F (Femenino)";
		Leer genero;
		
		Si genero = "M" Entonces
			Escribir "____________________________";
			comprovar <- 1;
		SiNo
			Si genero = "F" Entonces
				Escribir "____________________________";
				comprovar <- 1;
			SiNo
				Escribir "__--ingreso no valido intaentalo denuevo--__ ";
				Escribir "_____________________________________";
				comprovar <- 0;
			FinSi
		FinSi
	Hasta Que comprovar = 1;
	
	Escribir "ingrese su año de nacimiento: ";
	Leer nacimien;
	
	Escribir "ingrese su direccion: ";
	Leer direccion;
	
	Escribir "ingrese su numero de telefono: ";
	Leer telefono;
	
	Escribir "ingrese su saliari actual: "; 
	Leer salario;
	
	Si salario <= 1200000 Entonces
		Si genero = "F" Entonces
			porsalario <- salario * 0.1;
			
		SiNo
			porsalario <- salario * 0.08;
		FinSi
	SiNo
		Si salario < 2000000 Entonces
			porsalario <- salario * 0.05;
		SiNo
			Si genero = "F" Entonces
				porsalario <- salario * 0.03;
				
			SiNo
				porsalario <- salario * 0.025;
			FinSi
		FinSi
	FinSi
	
	finsalario <- salario + porsalario;
	Escribir "_______________________________________________";
	Escribir "su salario final es de: ", finsalario;
	
	
FinProceso
