"""
Python provides some of the methods on the lists and other data structures some of them are:
1. reduce
2. map
3. filter
3. enumeration """
import functools
import copy

l1=[x for x in range(0,10)] # this is list comprehension
list_sum= functools.reduce(lambda a,b:a+b,l1) # reduce function takes 2 arguments that are a function and a object which is iterable and reduces based on the function that was passed
print(list_sum) # gives the sum of the list
highest_num=functools.reduce(lambda a,b: a if a>b else b,l1) #similarly for the finding the largest number
print(highest_num)
print(l1) # the original list is not effected

odd_list=filter(lambda a:a&1,l1) # filters the odd numbers and can work based on the function that was passed and the function should return boolean
print(list(odd_list)) # returned object is filter type so convert it in to list

even_list=filter(lambda a:a&1==0,l1)
print(list(even_list))

doubled_list=map(lambda a:a*2,l1) # map function returns the map object and some operation is performed on the each element of the list based on the function passed
print(list(doubled_list))

# enumeration takes a itreable object and converts it into a list of tuples which contains the count and the value
list1=["hi","hello","welcome"]
enum_list=enumerate(list1)# we can also pass in the count to start from
for tuples in enum_list: # in the enum object the values in the form of tuples which contains (count,value)
    print(tuples)

enum_list=enumerate(list1,100) # we can provide the count to start from
for count,value in enum_list:
    print(count,value)
list2=copy.deepcopy(list1)
list2.append("bye")
tuple1=tuple(list2)
enum_tuple=enumerate(tuple1)
for count,value in enum_tuple:
    print(count,value)

dict1={"hi":1,"hello":2}
enum_dict=enumerate(dict1)
for count,value in enum_dict:
    print(count,value)