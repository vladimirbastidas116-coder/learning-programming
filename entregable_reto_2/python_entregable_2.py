print("__--Welcome, please enter a number (positive or negative)--__")
num1 = int(input())
resto = num1 % 2
if resto == 0:
    print("the number entered -" + str(num1) + "-: is even")
else:
    print("the number entered -" + str(num1) + "-: is odd")
