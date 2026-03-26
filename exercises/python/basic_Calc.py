#Algoritm description:
'''
    Basic calc v1
    Get two numbers
    Add, subs, mult, div
    Print results
'''

#1. Initialize vars and/or constants (Inputs)
num1 = 10
num2 = 5
	
#2. Processes
add = num1 + num2
subs = num1 - num2
mult = num1 * num2
div = num1 / num2
	
#3. Outputs without f-string
print("Addition: ", add, type(add))
print("Subtraction: ", subs, type(subs))
print("Multiplication: ", mult, type(mult))
print("Division: ", div, type(div))

# Output with f-string
print("\n")
print(f"Addition: {add}")
print(f"Subtraction: {subs}")
print(f"Multiplication: {mult}")
print(f"Division: {div}")