import random

def es_par(dado):
    return dado % 2 == 0

numtiros = int(input("¿Cuántos tiros deseas realizar?\n"))
pares = 0
impares = 0

for contador in range(1, numtiros+1):
    dado = random.randint(1,6)
    print(f"Tiro {contador}: {dado}")
    if es_par(dado):
        pares += 1
    else:
        impares += 1

print(f"Total de pares: {pares}")
print(f"Total de impares: {impares}")
