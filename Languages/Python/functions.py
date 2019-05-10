from math import *

def say_hi(name):
	print("Hello Bro " + name)

def pow3(number):						#Functions need to be indented
	return (pow(number,3))

def maxNum(n1,n2,n3):
	if n1>=n2 and n2 >= n3:
		print(n1)
	elif n3>=n2 and n3 >= n1:
		print(n3)
	else:
		print(n2)


#say_hi(input("Say your name: "))
#print(pow3(10))


is_male = False
is_tall = True

if is_male or is_tall:						#Boolean operators: and, or, not()
	print("You're male or tall")
elif is_tall and not(is_male):
	print("You are tall")
else:
	print("You're not")

maxNum(1,2,3)
