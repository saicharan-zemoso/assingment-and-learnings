"""A RegEx is a powerful tool for matching text, based on a pre-defined pattern. 
It can detect the presence or absence of a text by matching it with a particular pattern, 
and also can split a pattern into one or more sub-patterns. 
The Python standard library provides a re module for regular expressions.
Its primary function is to offer a search, where it takes a regular expression and a string. 
Here, it either returns the first match or else none."""

import re
#re is one of the module which can be used in finding the patterns in the given string

list_string="""
1.hello
2.welcome
3.dii11dhsj
4.jdjdckj
"""
#gets all the matchings as list
regex=re.compile("[0-9]+\.[a-zA-Z0-9]+")
print(regex.findall(list_string))
#gets the first occurance as object
x=regex.search(list_string)
print(x.group())
print(x.start())
print(x.end())


