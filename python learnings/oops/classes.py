"""
Python is an object oriented programming language.
Almost everything in Python is an object, with its properties and methods.
A Class is like an object constructor, or a "blueprint" for creating objects.
"""

#class is created using the class keyword
class ClassA:
    #__init__ method is the constructor of the class
    #self is the reference to that object
    def __init__(self,name):
        # name is the instance variable and this is unique to each object
        self.name=name
    

#object
obj1=ClassA("jhon")
print("name is :"+obj1.name)
obj2=ClassA("merry")
print("name is :"+obj2.name)

class ClassB:
    def __init__(self,name):
        self.name=name
    # this is a method which is used to execute a block of code while accessing the variables of the class
    def welcome_message(self):
        return "hello "+self.name+"!, welcome"
obj1=ClassB("jhon")
print(obj1.welcome_message())



class ClassC:
    #the variable defined outside of the init are static and have a life time as the class is created and program is started
    #the memory of static variables is allocated when the program starts running
    static_variable=10
    def __init__(self,name="jhon"):
        self.name=name
    def normal_method(self):
        print("static value is :",self.static_variable,"\n The name is :",self.name,sep=" ")
    #this is static method can be accessed using the class name. The class instance variables are unable to access in the static method
    # only static variables are accessable in static method and should be accessed with the class name.
    @staticmethod
    def static_method():
        print("static method can be accessed by the object and by using class name",ClassC.static_variable)

print("accesing static variable using class name :",ClassC.static_variable,"\n calling static method :")
ClassC.static_method()
obj1=ClassC()
print("accesing static variable using class name :",obj1.static_variable,"\n calling static method :")
obj1.static_method()

ClassC.static_variable=20
print(obj1.static_variable)# 20 because static variables are shared between all objects




class ClassD:
    def __init__(self,name="jhon"):
        self.name=name
    def normal_method(self):
        print("static value is :",self.static_variable,"\n The name is :",self.name,sep=" ")
    def create_age_instance(self):
        #creating a staic variable dynamically
        ClassD.static_variable=10
        #creating a instance variable dynamically
        self.age=10
        print("we can dynamically create instance variables in python :",self.age)
    def get_age(self):
        print("the age is: ",self.age)
    def get_gender(self):
        print("the gender is:",self.gender)
# print(ClassD.static_variable) throws error as it is being created in create_age_instance() method
obj1=ClassD()
# print(obj1.age) throws error as it is being created in create_age_instance() method
obj1.create_age_instance()
obj1.get_age() # if this is called before create_age_instance then it will throw an error
print(obj1.static_variable)
print(ClassD.static_variable)
obj1.gender="male" #createing instance variable and this only belongs to this object
print(obj1.gender)
obj1.get_gender()






