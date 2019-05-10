#result = int(num1) + int(num2)					#Int casting
#result = float(num1) + float(num2)				#Float casting


num1 = float(input("Enter a number: "))
num2 = float(input("Enter an other number: "))
op =   input("Enter an operator: ")

if op == "+":
	print(num1+num2)
elif op == "-":
	print(num1-num2)
elif op == "*":
	print(num1*num2)
elif op == "/":
	print(num1/num2)
else:
	print("Invalid!!")




