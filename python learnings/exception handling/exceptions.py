"""
The exceptions are the obstractions in the normal flow of the program.
There are 2 types of excetpions in the 
1. compile time excption
2. run time excptions 

python provides some of the features to handel these types of excptions to continue with the program even after the exception
python reserved some keywords for exception handing
1. try : a block of code which might have some exception
2. expect: a block of code which is used to handel the exceptions
3. else: a block of code which is executed if there is no exception
4. finally : a block of code which is executed everytime if there is an exceptions and even if there isn't one.
5. raise: key word which is used if the user wants to throw an exception.

some of the common exceptions that we know are divide by zero (ZeroDivisionError), index out of bound , key not found exception etc.

The Exception class is in the to of the hirarchy and can be derived to build our own exception class

"""
# simple try block and exception block
try:
    a=0
    b=10
    c=b/a 
    print("hello") # this line will be skiped as above line gives an exception if the there is no exception then there will be no error
except ZeroDivisionError as z:
    print("message",z)

# multiple expect blocks
try:
    list1=[1,2,3,4]
    print(list1[10])
except ZeroDivisionError as z:
    print("zero division",z) #this is skiped as the actual error is index out of bound
except IndexError as ie:
    print("index out of bound error",ie)

# common expect blocks
try:
    list1=[1,2,3,4]
    list1.remove(10)
except ZeroDivisionError as z:
    print("zero division",z) 
except IndexError as ie:
    print("index out of bound error",ie)
except:
    print("as the above exceptions are specific and not the exception that was raised so it will be handled here")
#same as above but we can get the error message
try:
    list1=[1,2,3,4]
    list1.remove(10)
except ZeroDivisionError as z:
    print("zero division",z) 
except IndexError as ie:
    print("index out of bound error",ie)
except Exception as e:
    print("as the above exceptions are specific and not the exception that was raised so it will be handled here",e)

#if you place the parent exception on to then the exception will never move down so write specific exception first
try:
    c=10/0
except Exception as e:
    print("as the above exceptions are specific and not the exception that was raised so it will be handled here",e)
except ZeroDivisionError as z:
    print("zero division",z) 
except IndexError as ie:
    print("index out of bound error",ie)

#to build a custom exception class 
class CustomExecption(Exception):
    def __init__(self, *args: object) -> None:
        super().__init__(*args)

try:
    raise CustomExecption("custom created exception")
except CustomExecption as c:
    print(c)
except Exception as e:
    print(e)
finally:
    print("block of code execueted after the execution of the try and except blocks")

#else block
try:
    a=10
    b=20
    c=b/a
    print("no exceptions")
except ZeroDivisionError as e:
    print(e)
else:
    print("executed if the except block is not executed or if there is no exception")
finally:
    print("here executed after else block and this is commonly used for the garbage collection")






