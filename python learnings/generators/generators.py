"""
The python feartures us to use generator functions that returns an iterator
this can be achived by using yield keyword yield
the yield key word is similar to the return but when yield is used the function execution is just paused insted of ending it
so when it is called again it continues its execution
"""

def simple_generator():
    yield 1
    print("secound call")
    yield 2

x=simple_generator()
print(next(x))
y=simple_generator()
print(next(y))
print(next(x),next(y))

#how to know if it has nex is that 
z=next(x,None)
if z:
    print(z)
else:
    print("the iteration is stoped")

#other way to use generator is
for i in simple_generator():
    print(i)



