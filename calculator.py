
def add(x, y):
    return (x + y)
def subtract(x, y):
    return (x - y)
def multiply(x, y):
    return (x * y)
def divide(x, y):
    return (x / y)
def modulus(x, y):
    return (x % y)
def exponentiation(x, y):
    return (x ** y)
def floor_division(x, y):
    return (x // y)

print("Select operation.")
print("1.Add")
print("2.Subtract")
print("3.Multiply")
print("4.Divide")
print("5.Modulus")
print("6.Exponentiation")
print("7.Floor_division")

while True:
    choice = input("Enter choice(1/2/3/4/5/6/7): ")
    if choice in ('1', '2', '3', '4','5','6','7'):
        num1 = float(input("Enter first number: "))
        num2 = float(input("Enter second number: "))
        
        if choice == '1':
            print(num1, "+", num2, "=", add(num1, num2))

        elif choice == '2':
            print(num1, "-", num2, "=", subtract(num1, num2))

        elif choice == '3':
            print(num1, "*", num2, "=", multiply(num1, num2))

        elif choice == '4':
            print(num1, "/", num2, "=", divide(num1, num2))

        elif choice== '5':
            print(num1, "%", num2, "=" ,modulus(num1, num2))
        
        elif choice == '6':
            print(num1, "**" ,num2 ,"=" ,exponentiation(num1, num2))

        elif choice == '7':
            print(num1, "//" ,num2 , "=" ,floor_division(num1, num2))
        next_calculation = input("Let's do next calculation? (yes/no): ")
        if next_calculation == "no":
            print("Thank You")
            break
    
    else:
        print("Invalid Input")