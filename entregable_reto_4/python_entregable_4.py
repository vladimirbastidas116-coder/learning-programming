# definicion de variables
# inicializacion en 0
num1 = 0
num2 = 0

# salidas y entras _- requerimietos de la persona -_
print("Enter value to number 1: ")
num1 = float(input())
print("enter valeu to number 2: ")
num2 = float(input())
print("¿Qué operación te gustaría realizar?")
print("[1]. Add")
print("[2]. subtraction")
print("[3]. Multiply")
print("[4]. Divide")
print("[5]. All")
operacion = int(input())
if operacion == 1:
    resultado = num1 + num2
    print("The result of the sum is:" + str(resultado))
else:
    if operacion == 2:
        resultado = num1 - num2
        print("The result of the subtraction is:" + str(resultado))
    else:
        if operacion == 3:
            resultado = num1 * num2
            print("The result of the multiplication is:" + str(resultado))
        else:
            if operacion == 4:
                if num2 == 0:
                    print("error cannot be made between 0")
                else:
                    resultado = num1 / num2
                    print("The result of the division is:" + str(resultado))
            else:
                if operacion == 5:
                    print("add: " + str(num1 + num2))
                    print("subtraction: " + str(num1 - num2))
                    print("multiplication :" + str(num1 * num2))
                    if num2 == 0:
                        print("error cannot be made between 0")
                    else:
                        print("divicion :" + str(num1 + num2))
                else:
                    print("Invalid number error")
