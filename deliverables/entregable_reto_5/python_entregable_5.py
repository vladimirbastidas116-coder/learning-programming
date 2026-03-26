ideerror = 0
añonacimieto = 0
porcentaje = 0
while True:    #This simulates a Do Loop
    print("Enter the type of identification (CC, PS, CE, CI) -> uppercase")
    tipidentificacion = input()
    if tipidentificacion == "CC":
        ideerror = 0
    else:
        if tipidentificacion == "PS":
            ideerror = 0
        else:
            if tipidentificacion == "CE":
                ideerror = 0
            else:
                if tipidentificacion == "CI":
                    ideerror = 0
                else:
                    print("Error entering the identification type")
                    ideerror = 1
    if ideerror != 1: break
print("Please enter your names:")
nombres = input()
print("Please enter your last name: ")
apellidos = input()
while True:    #This simulates a Do Loop
    print("Enter your gender type: ")
    print("M-(male)")
    print("F-(feminine)")
    genero = input()
    if genero == "M":
        ideerror = 0
    else:
        if genero == "F":
            ideerror = 0
        else:
            print("Error entering genre, please try again")
            ideerror = 1
    if ideerror != 1: break
while True:    #This simulates a Do Loop
    print("Enter your year of birth: ")
    añonacimieto = int(input())
    if añonacimiento < 2025:
        if añonacimiento > 0:
            ideerror = 0
        else:
            print("Invalid date of birth")
            ideerror = 1
    else:
        print("Invalid date of birth")
        ideerror = 1
    if ideerror != 1: break
print("Enter your address: ")
direccion = input()
print("Enter your phone number: ")
telefono = int(input())
print("ingrese su salario: ")
salario = float(input())
if salario < 1200000:
    if genero == "M":
        porcentaje = salario * 0.08
        suma = porcentaje + salario
    else:
        porcentaje = salario * 0.1
        suma = porcentaje + salario
else:
    if salario >= 2000000:
        if genero == "M":
            porcentaje = salario * 0.025
            suma = porcentaje + salario
        else:
            porcentaje = salario * 0.03
            suma = porcentaje + salario
    else:
        porcentaje = salario * 0.05
        suma = porcentaje + salario
print("se realizará un aumento de: " + str(porcentaje) + " en su salario ")
print("salario total: " + str(suma))
