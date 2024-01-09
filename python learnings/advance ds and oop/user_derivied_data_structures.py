class Stack:
    def __init__(self):
        self.__stack_list=[]
        self.__top=-1
    
    def push(self,element):
        self.__stack_list.append(element)
        self.__top+=1
    
    def pop(self):
        if(self.__top<0):
            return None
        element=self.__stack_list[self.__top]
        self.__top-=1
        self.__stack_list.pop()
        return element
    
    def is_empty(self):
        return True if self.__top<0 else False
    
stack=Stack()
print(stack.is_empty())
stack.pop()
stack.push(10)
stack.push(20)
stack.push(30)
while stack.is_empty()==False:
    print(stack.pop())
else:
    print("stack is empty")