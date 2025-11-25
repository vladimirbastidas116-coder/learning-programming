ideerror = False
añonacimieto = 0
porcentaje = 0
contin = True
conemple = 0
conF = 0
conM = 0
conO = 0
totedad = 0
sumsalario = 0

while contin:
    conemple += 1
    print(f"empleado #{conemple}")
    nombres = input("Please enter your names: ")
    apellidos = input("Please enter your last name: ")
    email = input("Por favor ingrese su Email: ")

    ideerror = True
    while ideerror:
        print("Enter your gender type: ")
        print("M - (male)")
        print("F - (feminine)")
        print("O - (other)")
        genero = input()

        if genero == "M" or genero == "F" or genero == "O":
            ideerror = False
            if genero == "F":
                conF += 1
            elif genero == "M":
                conM += 1
            elif genero == "O":
                conO += 1
        else:
            print("Error entering gender, please try again")
            ideerror = True

    añonacimieto = input("Enter your year of birth: ")
    cannum = 0
    con_string = 0
    numyear = len(añonacimieto)
    comaño = True

    while cannum < numyear:
        while comaño:
            if añonacimieto[cannum] < "0" or añonacimieto[cannum] > "9":
                con_string += 1
            
            cannum += 1

            if cannum == numyear:
                if con_string != 0:
                    print("___--ingreso de año incorrecto--___")
                    añonacimieto = input("Enter your year of birth: ")
                    cannum = 0
                    con_string = 0
                    numyear = len(añonacimieto)

                else:
                    nacimiento = int(añonacimieto)
                    edad = 2025 - nacimiento

                    if nacimiento >= 2008:
                        print("__--el año ingresado es incorrecto menor de edad--__")
                        añonacimieto = input("Enter your year of birth: ")
                        cannum = 0
                        con_string = 0
                        numyear = len(añonacimieto)

                    elif nacimiento > 2025:
                        print("error de ingreso de año superior a 2025")
                        añonacimieto = input("Enter your year of birth: ")
                        cannum = 0
                        con_string = 0
                        numyear = len(añonacimieto)

                    elif numyear >= 5:
                        print("ingreso de digitos invalido")
                        añonacimieto = input("Enter your year of birth: ")
                        cannum = 0
                        con_string = 0
                        numyear = len(añonacimieto)

                    else:
                        comaño = False

    totedad = totedad + edad

    comtel = True
    while comtel:
        telefono = input("Enter your phone number: ")

        if telefono.isdigit():
            comtel = False
        else:
            print("error de ingreso intantalo denuevo")
            print("--____________________________________--")
            comtel = True

    comsal = True
    while comsal:
        salario_ingresado = input("Ingrese su salario: ")

        if salario_ingresado.replace(".", "", 1).isdigit():
            salario = float(salario_ingresado)
            sumsalario += salario
            comsal = False
        else:
            print("Error, ingrese un número válido.")
            comsal = True

    otro = input("Has terminado tu registro. deseas agregar otro empleado.\n(S,s)si \n(N,n)no ")

    NoSi = True
    while NoSi:
        if otro == "S" or otro == "s":
            NoSi = False
            contin = True
        elif otro == "N" or otro == "n":
            NoSi = False
            contin = False
        else:
            print("__--error de ingreso intentalo denuevo--__")
            otro = input("Deseas agregar otro empleado (S/N): ")

print("--________________________________________--")
print(f"numero de mujeres ingresadas: {conF}")
print(f"numero de hombres ingresados: {conM}")
print(f"otro genero ingresadas: {conO}")
print("--________________________________________--")
print(f"cantidad de empleados regitrados: {conemple}")
print("--________________________________________--")
print(f"total de salario a pagar: {sumsalario}")
print("--________________________________________--")
print(f"el promedio de edades es: {totedad / conemple}")
print("--________________________________________--")
