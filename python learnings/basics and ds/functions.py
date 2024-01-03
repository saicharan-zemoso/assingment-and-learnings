"""
function in the python are the blocks of codes that can be executed any time we want by calling by its name
1. the functions are defined using def keyword.
2. we can pass some variables to functions which can be used.
3. if a function is called by it self it is known as recurssion
"""
#examble function
def print_hello():
    print("hello function")

print_hello()

#function with arguments
def greeting_person(name):
    print("hello! {}".format(name))

greeting_person("jhon")
greeting_person(name="merry")

#function with default arguments
def greeting_person_with_default(name="doe"):
    print("hello! {}".format(name))
greeting_person_with_default()
greeting_person_with_default("merry")

#function with unknown number of arguuments
def add_numbers(*numbers): #takes all the arguments as tuple
    all_sum=sum(numbers)
    print(all_sum)
add_numbers(1,2,3)
add_numbers(10,20,10,40,60)

#function with unknown number of arguuments
def add_numbers_with_dict_arguments(**numbers): #takes arguments as key value pairs
    print(numbers)
add_numbers_with_dict_arguments(a=10,b=20,c=30) # but have to specify all the keys that will be used in the function

#recurssion
def sum_of_n_numbers(n):
    if(n>0):
        return n+sum_of_n_numbers(n-1)
    return 0
print(sum_of_n_numbers(4))

list1=["a","b","c"]
def change_list(l1): #when list is passed as argument the changes made in the list are effected in the original list as well
    l1[0]="c"
    l1[2]="a"
change_list(list1)
print(list1)

dict1={"a":"a","b":"b","c":"c"}
def change_dict(l1): #same with the dict because we are passing the reference of the object
    l1["a"]="c"
    l1["c"]="a"
change_dict(dict1)
print(dict1)

#lambda functions are the annoynomous small functions that does not have any name and used to make small operstions 
add=lambda a,b:a+b # it can take any number of arguments but have single expression
print(add(10+20))



