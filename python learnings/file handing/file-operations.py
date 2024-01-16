"""
The python provides file operations where we can create open and read or write and delete the files:
The operations are:
w:write and create the file if does not exist. if the file has some text it will overrides it
r: reads the contents of the file and throws an error if the file was not found
a:same as write but if the file has old text. the cursor is placed at the end and the the content is not overritten
x: to create a file

os.remove(filename): can be used to remove the file

the file can be opened as t:text or b:binary
rt:reads in text mode
wt:writes in text mode
rb:reads in binary mode
wb:writes in binary mode
r+t:read and write in text mode
+w: read and write
+ab:read and append in binary mode

"""


"""
write():function is used to write the given text
writelines(): function is used to write multiple lines and takes list as input
read(): reads the file and also takes a argument as number to known how many characters to read
readline(): reads the file line by line
readlines():reads multiple lines at once




tell(): method returns the position of the cursor
seek(): method to move the cursor to the position that is required but only in binary mode and from the start in text mode
"""
file1=open("../files/readFile.txt","w") #opens the file in write mode
file1.write("hello this is a new file") #writes the message in the file
file1.close() #closes the file

file2=open("../files/readFile.txt","r") #opens the file in read mode
print(file2.read()) #reads the message in the file
file2.close()

file2=open("../files/readFile.txt","r")
print(file2.read(5)) #reads specified number of characters
print(file2.tell()) #returns the index
file2.close()

file2=open("../files/readFile.txt","r")
file2.seek(6) #moves the pointer to index 6 from the start
print(file2.read(5))
file2.close()

# the seek function can be used to move the cursor and it takes 2 parameters how much to move and from where to move
# the from where to move has 3 values 0:from the start,1:from the currect position,2: from the end by default it is 0
# the positive number moves cursor to right and -ve number moves cursor to left
# but this only works for files which are opened in binary format and in text format use can only use 0: from the start and +ve value to say how much to move

file2=open("../files/readFile.txt","rb")
file2.seek(6,1) #moves the pointer to index 6 from the currect position
print(file2.read(5))
file2.close()
