import random

def es_par_de_seis(dado1, dado2):
    return dado1 == 6 and dado2 == 6

tiros = 0
while True:
    dado1 = random.randint(1,6)
    dado2 = random.randint(1,6)
    tiros += 1
    print(f"Tiro {tiros}: Dado1 = {dado1}, Dado2 = {dado2}")
    if es_par_de_seis(dado1, dado2):
        break

print(f"¡Se obtuvo un par de seis después de {tiros} tiros!")
