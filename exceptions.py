try:
	number = int(input("Number:"))
	print(number)
	i = 10/0
except ZeroDivisionError as err:
	print(err)
except ValueError:
	print("Invalid Input")


#just "except" caths every exceptions
