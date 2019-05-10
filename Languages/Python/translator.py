#Giraffe Language
#	Vogal -> g

def translate(phrase):
	translation = ""
	for letter in phrase:
		if letter.lower() in "aeiou":				#in is a type of belongs
			translation = translation + "g"
		else:
			translation = translation + letter
	return translation

print(translate(input("Digite: ")))


'''
Comentárioem
bloco
são feitos
com três
apóstrofos

'''

