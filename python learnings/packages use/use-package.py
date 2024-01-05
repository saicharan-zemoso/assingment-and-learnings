"""
the python package is a folder with the __init__.py module which can contain multiple modules 

we can specify which modules to import in the __init__.py module and by importing the package those modules can be imported

if the __init.py module is empty then all the modules are imported by default"""
import packages # as specified in the __init__.py module it imports welcome_message() and print_n_numbers() functions
import packages.module3 #as module 3 is not specified we need to import it seprately
print(packages.welcome_message("jhon"))

print(packages.module2.add_numbers(10,20)) #as we did not specify this we need to specify the module

packages.module3.hello() # works only if the packages.module3 is imported




