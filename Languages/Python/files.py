#File: textFile
#Reading
archive = open("textFile", "r")		#read(r), write(w), read and write(r+), append(a)
#print(archive.read())			#prints the file

#print(archive.readlines()[1])

'''
for line in archive:
	print(line)		#prints line by line
'''
archive.close()



#Writing

archive = open("textFile", "a")		#write(w) in true overwrite the file
archive.write("João - Pika das Galáxia\n")
archive.close()

