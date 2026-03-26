import os
from random import randint 

lives = 3
status =True

def roll_dice():
    dice1 = randint(1,6)
    dice2= randint (1,6)
    return dice1, dice2

#print(roll_dice())

com = True
conttiros = 0

while com:
    conttiros += 1
    key = input("press any key to roll dices")
    dices = roll_dice()
    print (f"dice 1: {dices[0]}")
    print (f"dice 2: {dices[1]}")
    
    if (dices[0] + dices[1]) % 2 == 0 :
        lives +=1
        com =True
    else:
        lives -= 1
        com = True
    print(lives)

    if dices[0] == 6 and dices[1] == 6:

        print (f"you win tiro: {conttiros}")
        break
    
    elif lives == 0:
        print(f"geme over tiro: {conttiros}")
        break 




