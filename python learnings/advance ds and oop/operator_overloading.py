class StringClass:
    def __init__(self,string=""):
        self.string=string
    
    def __add__(self,obj): # is a operation over loading function which can be used to over ride the existing + operator
        return self.string+obj.string
    
obj1=StringClass("hello! ")
obj2=StringClass("jhon")
print(obj1+obj2)

class Orders:
    def __init__(self,order=["water",]):
        self.order=order
    
    def __add__(self,obj): 
        self.order.extend(obj.order)
        return Orders(self.order[::])
    
    def __str__(self):
        return " ,".join(self.order)
    
order1=Orders(["fish","rice","water"])
order2=Orders(["chicken","naan","dal"])
print(order1+order2)
    