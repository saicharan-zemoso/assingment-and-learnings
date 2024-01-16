"""Decorators are a very powerful and useful tool in Python since it allows programmers to modify the behaviour of a function or class. 
Decorators allow us to wrap another function in order to extend the behaviour of the wrapped function, without permanently modifying it."""
import time
#custom decorator
def transaction_function(func):
    def innerfunction():
        print("start the transaction")
        func()
        print("end of the transactions")
    return innerfunction

# the decorators in the python modify the behaviour of function by wrapping it in another function
@transaction_function
def add_user():
    print("added the user into the database")

add_user()

def welcome_message(func):
    def add_welcome(name):
        print("welcome")
        string=func(name)
        return string+" welcome to the team!"
    return add_welcome

def hello_message(func):
    def add_hello(name):
        print("hello")
        string=func(name)
        return "hello! "+string
    return add_hello

#this is called chaning 
@hello_message
@welcome_message
def greet_user(name):
    return name

print(greet_user("jhon"))

#if the function as many parameters or unknown parameters
def calculate_time(func):
    def innerfunction(*args,**kargs):
        start=time.time()
        func(*args,**kargs)
        end=time.time()
        print("total time taken is: ",end-start)
    return innerfunction

@calculate_time
def print_numbers(num):
    time.sleep(1)
    for i in range(1,num+1):
        print(i)

print_numbers(10)

    

        