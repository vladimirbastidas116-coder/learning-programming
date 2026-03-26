import random

def es_par(dado):
    return dado % 2 == 0

total_tiros = 0
suma = 0
pares = 0
impares = 0

while True:
    dado = random.randint(1,6)
    total_tiros += 1
    suma += dado
    print(f"Tiro {total_tiros}: {dado}")
    if es_par(dado):
        pares += 1
    else:
        impares += 1
    
    respuesta = input("¿Deseas lanzar de nuevo? (s/n)\n").lower()
    if respuesta != 's':
        break

print(f"Total de tiros efectuados: {total_tiros}")
print(f"Suma total de los tiros: {suma}")
print(f"Total de pares: {pares}")
print(f"Total de impares: {impares}")
