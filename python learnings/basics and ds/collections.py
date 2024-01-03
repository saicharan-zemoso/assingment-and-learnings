'''
the collections in pythons are:
1. list: list is a type of collection which is mutable and it can have the values of different data types and when it is passed to a function it is passed as reference
2.tuple: tuple is an imutable version of the list. once it is assigned it cannot be changed we need to replace the whole tuple if we need change
3.dict: dict is a type of collection which stores values in key value pairs and the values can be duplicate but the key cannot be duplicate.
4.set: set is a type of collection which stores unique values
'''

# list creation ways
list1=[1,2,3]
print(list1)
list2=list((1,2,4))
print(list2)
list3=[x for x in range(0,10) if x%2==0] # list comprehension method to create list of even numbers
print(list3)
# the split method in strings also creates list
list1[2]=10
print(list1)# modified the index 2 to 10
list1.append(20) # addes new element
print(len(list1)) #length of the list
list1.extend(list2) # to add list2 elements to list 1
print(list1)
list4=list1 #copies the reference insted of making a new clone
list4[0]=11
print(list1) # will be effected in list1
list1.pop()
print(list1) # removes last element
list1.pop(1) # removes from provided index
print(list1)
list1.remove(1) #removes the value 1
print(list1)
list1.insert(0,21) # insert at index and value
print(list1)
list1.sort()
print(list1)# sorts the list
print(list1.count(11))

#tuple 
tuple1=1,2,3
tuple2=(1,2,4)
tuple3=tuple([1,2,3])
print(tuple1,tuple2,tuple3)

#sets are unordred so we cannot access them through index and the elements are not changeable but we can remove and add in to it.and it only stores unique values
set1={"hi","hello"}
set2=set([1,2,"hi","hi"])
print(set1,set2)
set1.add("welcome") #addes
set1.remove("hi") #remoes hi if not exist raises error
set1.discard("hello") # removes if exits 
set1.pop() # removes random values from the set
set1.update(set2) #addes the values from iterable object that was given and makes sure that the result is unique
print(set1)
set1.add("welcome")
print(set1.difference([1,2,3]))


# dictonary
dict1={"1":1,"2":2}
dict2=dict(name="jhon",age=50,gender="male")
print(dict1,dict2)
print(dict2["name"]) # throws error if not found
print(dict2.get("name"))# returns none if not found
print(dict2.keys())
print(dict2.values())
print(dict2.items())
#updating
dict2["name"]="doe"
dict2.update({"age":60})
print(dict2)
#adding new elements in the same way
dict2["game"]="football"
print(dict2)
#removing
dict2.pop("game")
print(dict2)
