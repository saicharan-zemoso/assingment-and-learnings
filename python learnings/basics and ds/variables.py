"""
1.In python we don't need to declare a variable we can directly assign it and use it
2.The variables should be in snack case.
3.The variables are case sensitive in python
4.Data types in python are:str,int, float, complex,list, tuple, range,dict,set, frozenset,bool,bytes, bytearray, memoryview,NoneType.
"""
# example of simple variable in python
# the variable is int type by default
variable_1=10
print(variable_1)
print(type(variable_1))
#now this variable is string type 
variable_1="jhon"
print(variable_1)
print(type(variable_1))
#now this variable is boolean type 
variable_1=True
print(variable_1)
print(type(variable_1))
#now this variable is list type. This is similar to tuple but the value inside the type can be changed
variable_1=[1,2,3]
print(variable_1)
print(type(variable_1))
#now this variable is tuple type. This is imutable means that once assigned it cannot be changed
variable_1=(1,2,3)
print(variable_1)
print(type(variable_1))
#now this variable is dict type 
variable_1={"1":1,"hi":"hello"}
print(variable_1)
print(type(variable_1))
#this is set type it is a type which only allows the unique values
variable_1={"hi","hello","hi"}
print(variable_1)
print(type(variable_1))# this will result in {"hi","hello"}
#this is complex type
variable_1=1+10j
print(variable_1)
print(type(variable_1))
#this is float
variable_1=2.0
print(variable_1)
print(type(variable_1))
#this is called as packing var_1 will become the tuple 
var_1=10,20,30
print(var_1)
print(type(var_1))
#this is known as unpacking. while unpacking the number of values in the tuple should match with the number of varibles in left side otherwise it will result in error.
a,b,c=var_1
print(a,b,c,sep="\n")

"""
variable types:
1.global variable.
2.local variable
3.class variable
4.static variable"""

#global variable is a variable which is avaliable everywhere in the code.
#global variables are accesabel everywhere and if the value is changed it will be effected in all places.
var_1=10

def print_var_value():
    print("inside the print_var_value")
    print(var_1)

print_var_value()

def print_var_value_local():
    print("inside the print_var_value_local")
    #local are accessable only inside of this block. and once the function ends the storage gets de allocated.
    var_1=20
    local_var=30
    print(var_1)
    print(local_var)
print_var_value_local()
#original value does not change
print(var_1)

def print_var_value_global_changed():
    print("inside the print_var_value_global_changed")
    #global keyword can be used to create gloabl variables and to change the golbal value og var_1.
    global var_1
    var_1=20
    global local_var
    local_var=30
    print(var_1)
    print(local_var)
print_var_value_global_changed()
#original value does change as we used the global key word
print("local var the global variable changed in function",var_1)
print("local var the global variable created in function",local_var)



