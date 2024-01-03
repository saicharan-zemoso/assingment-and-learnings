str="This is a string.This is just for an expirement, this is for performing some opertations on the strings"
#the sep value of string can be used to specify how to print the given comma seerated values 
print("start",str,"end",sep="\n")
#in operator checks if the given string is in the string
print("this returns id the string is in the str:","string" in str)
#index is a method of string that returns the first index of the occurance if not present it returns -1
print(str.index("string"))
#use slicing ot get the sub string
print("slicing in string")#this method does not modify the original string
print(str[1:])#from index 1 to the end
print(str[:10])#from start to index 10 and index 10 is not included
print(str[:1])
print(str[0:4])# sub string from index 0 to index 3 and index 4 is not included this will result in :This
print(str[0:4:2])#last value is step to get the substring in even indexes
print(str[::-1])# reverse the string
print(str[-1])#gives the value in the last index
print(str[-4:])#last 4 charecters
# some methods that does not modify the original string but gives the modified version of the original string
print(str.upper())#returns the uppercase 
print(str.lower())#returns the lowercase
print(str.capitalize())# returns the captilized string
print(str.split(","))#returns the list by spliting the original string where the delimiter occurs
print(len(str))# returns the length
print(str.replace("is","in"))#replace the is with in
print(str.strip())#removes if there are extra white spaces in the start or end
print(str.title())#makes each word capital
print(str+"concat")#return a new concatinated string
print("this is formated string {2} and insert the number {0} in any order we choose{1}".format(10,"string in the last","string in the first"))