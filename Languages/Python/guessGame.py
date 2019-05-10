def guess_game():
	secret_word = "giraffe".upper()
	guess = ""
	guessCount = 0

	while guess != secret_word and guessCount<5:
		guess = input("Take a bet: ").upper()
		if guess != secret_word:
			print("Wrong")
			guessCount += 1
		else:
			break
	if guessCount == 5:
		print("You'll not find the answer")
	else:
		print("Congratulations!!!")


for letter in "João Paulo":
	print(letter)

friends = ["Jim", "Karen", "Kevin"]
for f in friends:
	print(f)

				#Range returns a list of numbers in a range
for i in range(4,5):
	print(i)

print(3**4)			#exponation
