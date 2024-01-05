"""
The modules are the python files that are created which consist of the functions and the constants that can be stored.
This can help in the reuseability of the code and divide the whole functionality to multuple modules 
The functions which are common and can be re used can be seprated ito a module and can be imported latter
"""
import greatings #is a module 
import operations as op # import module with alias name
from operations import add #import using from the method can be used directly

print(greatings.return_hello("jhon"))
print(greatings.return_welcome("jhon"))
print(add(10,20))
print(op.mul(10,20))


