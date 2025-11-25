# importa o permite utilizar aleatorio 
import random

'''
Esta función recibe el valor del dado (dado1)
y la suma acumulada anterior (add)
Devuelve la nueva suma total
'''
def sumtiros(dado,acumulado):
    acumulado = dado + acumulado 
    return acumulado

# el acumulado comienza en 0 
add = 0
# el contador de tiros comieza en 1
contador = 1
# Mensaje de bienvenida y ingreso de cantidad de tiros 
numtiros = int(input("Hola, ¿cuántas veces te gustaría tirar los dados?\n"))

# Ciclo para lanzar el dado las veces indicadas cuando "contador" = "numtiros" para el ciclo 
while contador < numtiros + 1:
    # genera un número aleatorio del 1 al 6
    dado1 = random.randint(1,6)
    print (f"Tiro {contador} valor: {dado1}")
    # emvio de datos 
    add = sumtiros(dado1,add)
    # con cada siclo suma 1 al contador 
    contador = contador +1

# Mostrar la suma total al final
print (f"La suma de todos los lanzamientos es: {add}")
