from random import randint

# Función que suma 1 al contador correspondiente
def contar(dado, c1, c2, c3, c4, c5, c6):
    if dado == 1:
        c1 += 1
    elif dado == 2:
        c2 += 1
    elif dado == 3:
        c3 += 1
    elif dado == 4:
        c4 += 1
    elif dado == 5:
        c5 += 1
    else:
        c6 += 1
    return c1, c2, c3, c4, c5, c6

# Contadores
Op1 = Op2 = Op3 = Op4 = Op5 = Op6 = 0

# Solicitar cantidad de tiros
numtiros = int(input("Hola, ¿cuántas veces te gustaría lanzar el dado?\n"))

# Ciclo de lanzamientos
contador = 1
while contador <= numtiros:
    dado = randint(1, 6)
    print(f"Tiro {contador}: salió {dado}")

    # Llamar la función para actualizar los contadores
    Op1, Op2, Op3, Op4, Op5, Op6 = contar(dado, Op1, Op2, Op3, Op4, Op5, Op6)

    contador += 1

# Resultados
print(f"El número 1 salió {Op1} veces.")
print(f"El número 2 salió {Op2} veces.")
print(f"El número 3 salió {Op3} veces.")
print(f"El número 4 salió {Op4} veces.")
print(f"El número 5 salió {Op5} veces.")
print(f"El número 6 salió {Op6} veces.")
