import random 

dado1 = random.randint(1,6)

def tirardado(dado1):
    restante  = dado1 % 2
    return restante

restante = tirardado(dado1) 
print(f"numero del dado:{dado1}")
print("__--el numero es impar--__}")
print(f"restante de la divicion: {restante}")