"""
Inheritance is an object orianted programming property in which the properties from one class can be passed down to children classed
"""

class ClassA:
    def __init__(self,name="jhon"):
        self.name=name
        self.__age=20 # this is private variable in the classA and is only accesable here 
    def get_name(self):
        return self.name
    def get_age(self):
        return self.__age
class ClassB:
    def __init__(self,age=20):
        self.age=age
    def get_age(self):
        return self.age
class ClassC:
    def __init__(self,email="jhon@gmail.com"):
        self.email=email

#inherits the variables of ClassA
#simple inheritance
class ClassD(ClassA):
    def __init__(self,name="don"):
        ClassA.__init__(self,name) #as it does not inherit __init__() method we have to overide it and call it
        #other was is to use super().__init__(name)
        self.name="merry" #this will override the variable name from the parent class
        self.__age=10 #this is a private instance variable only accesable in this method
    def get_age(self):
        #self.__age is not accesable here
        return self.__age
    def get_parent_age(self):
        #super().__age gives error
        return ClassA.get_age(self) #or use super().get_age()
    

obj1=ClassD()
print(obj1.name)
print(obj1.get_name())
print(obj1.get_age())
print(obj1.get_parent_age())
# multi level inheritance
class ClassE(ClassD):
    def __init__(self,name,extra_value,age=10):
        ClassD.__init__(self,name)
        self.extra_value=extra_value
        self.__age=15
    def get_age(self):
        return "the age value of classE is :"+str(self.__age)+" and the age value of class D is: "+str(super().get_age())+" and the age value of class a is: "+str(self.get_parent_age())
    
obj1=ClassE(name="classE",age=50,extra_value="hi")
print(obj1.get_age())

#multiple inheritance
#in multiple inheretances you have to be very carefull if you have same method in both super classes if you want to access them then you have to create different methods to call those
class ClassF(ClassA,ClassB):
    def __init__(self, name="jhon",age=30):
        ClassA.__init__(self,name=name)
        ClassB.__init__(self,age)
    def get_class_a_age(self):
        print("class a age:")
        return ClassA.get_age(self)
    def get_class_b_age(self):
        print("class b age:")
        return ClassB.get_age(self)
obj1=ClassF()
print(obj1.name)
print(obj1.age)
print(obj1.get_age())

        