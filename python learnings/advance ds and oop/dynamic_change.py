class A:
    def __init__(self):
        self.a=10
    def func(self):
        return "hello this is func method"
    
def mock_func(self):
    return "Hello this is a mock function replacing the func() method"


obj=A()
print(obj.func())
A.func=mock_func # functionality of the object is being replaced
obj=A()
print(obj.func())
def new_mock_fun(self):
    return "this is newly added function"+str(self.a)
A.new_func=new_mock_fun # we can dynamically add new methods to the class it will work and it will accept the self variable to access the object

def make_static(func): 
    def inner(*args,**kargs):
        result=func()
        return result
    return inner

@make_static # as we are adding it as static when it is called by object we need to ignore the self referance variable so that it can be called using class name
def new_static_funct():
    return "this is a static function that was added"

A.new_static=new_static_funct # we can also add new static method but we need to be careful while implementation as it might ask for self referance
print(obj.new_func())
print(obj.new_static())
print(A.new_static())

def new_mock_class_method():
    return "this is a new mocked class method"
obj.new_class_method=new_mock_class_method #we can add new class method but it does not take self referance so we cannot access the object 
# by doing in this way it stores the method in the form of a variable and calls it and it is not accessable by class name
print(obj.new_class_method())



"""
The class method is a decorator that can be used to convert a method to class method 
after becoming class method it is no longer bound to the object it is bound to the class
unlike static it takes an argument that is the class."""

class B:
    def __init__(self,b=20):
        self.b=b
    
    @classmethod
    def class_method(cl,b=30):
        return cl(b)
    
    @staticmethod
    def print_given(b):
        print(b)

bobj1=B()
bobj1.print_given(bobj1.b)
bobj2=B.class_method(50)
bobj2.print_given(bobj2.b)
# we can also add new classmethod by using classmethod() function



