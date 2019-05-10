from math import * 			#Importing math functions

#Introduction

name = "João"
isMale = True
duration =  500
dinheiro = "12341234"
print(name + " vai comer \n  \'  \ndevagar por " + duration.__str__() + " anos. Ele pretende ter " + " reais")


#Functions with Strings

phrase = "Good Moorning"
print(phrase.lower() + " or "+ phrase.upper())

print(phrase.isupper())			#Methods of the String object

print(phrase.upper().isupper())		#Using functions

print(len(phrase))			#Number of characters of the string

print(phrase[5])			#Getting the 5th character of the string, indexed with zero the first position

print(phrase.index("G"))		#Give position of the first occurency of the string, if error, results in an exception

print(phrase.replace("Good", "Nice"))	#Replace a substring by a string

#Working with  Numbers

value = 5

print(-123124.1255869 + 2341341 % 10)	#Testing the number's operators

print("Hello "+ str(value)  + " times")	#Casting a number into a string

print(str(round(3.4)) + str(floor(3.9)) + str(ceil(4.1)))	#Round a number lower or upper, you can also use floor or ceil with math imported

#Using user input

userInput = input("User input Text: ")





