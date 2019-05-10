#Using lists

friends= ["Kevin", "Karen", "João",1,2,3]

print(friends[0].upper())
print(friends[-1]+1)				#Back indexing will print the number three

print(friends[1:])				#List elements one and after
print(friends[1:3])				#Range of elements, excluding the right bound


l = ["Kevin","Karen", "Karol","Jim","Joao","Jorginho"]
numbers = [1,2,6,8,345,65,2304]

#l.extend(numbers)				#Concatenate two lists

l.append("Apolo")				#add an element to the end of the list
l.insert(1,"Creedo")				#inserted an indexed element

l.remove("Kevin")				#search and remove an element
#l.clear()					#clear the list

l.pop()						#remove the last element, like a stack

print(l)

print(l.index("Karol"))				#Returns the index of the element, can results into an exception

l.count("Karol")				#Returns the number of repeated gave elements

l.sort()					#sort into asceding order
l.reverse()					#reverse the list

l2 = l.copy()					#cria uma copia identica, e não um ponteiro

print(l)


#Tuples (imutable)

coordinates = (4,5)

print(coordinates[0])

