import random
random.seed()   #Prepare random number generator

print("Welcome, would you like to roll the dice?")
print("Press any key and then Enter to continue...")
tecla = input()
dado1 = int(random.randint(1,6))
dado2 = int(random.randint(1,6))
res1 = dado1 % 2
res2 = dado2 % 2
print("__--dado 1: " + str(dado1) + "--__")
print("__--dado 2: " + str(dado2) + "--__")
if dado1 == 0:
    print("the number is even: " + str(res1))
else:
    print("The number is odd: " + str(res1))
if dado2 == 0:
    print("the number is even: " + str(res2))
else:
    print("The number is odd: " + str(res2))
if dado1 == dado2:
    print("YOU WIN")
else:
    print("GAME OVER")
