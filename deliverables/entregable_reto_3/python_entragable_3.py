print("__--Welcome, please enter a number (positive or negative)--__")
num1 = int(input())
resto = num1 % 2
if num1 >= 0:
    print("the number entered_" + str(num1) + ": is positive")
    if resto == 0:
        print("The remainder of the division is _" + str(resto) + ": the number is even")
    else:
        print("The remainder of the division is_" + str(resto) + ": the number is odd")
else:
    print("the number entered_" + str(num1) + ": is negative")
    if resto == 0:
        print("The remainder of the division is _" + str(resto) + ": the number is even")
    else:
        print("The remainder of the division is _" + str(resto) + ": the number is odd")
