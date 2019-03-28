monthConvert = {
	"Jan" : "January",
	1     : "January",
	"Feb" : "February",
	2     : "February",
	"Mar" : "March",
	3 : "March"
}

print(monthConvert["Jan"])
print(monthConvert.get("Feb"))
print(monthConvert.get("PAF", "Not valid key"))
print(monthConvert[1])



#using while into a dictionary

i = 1
while i < 10:
	print(i)
	i += 1
