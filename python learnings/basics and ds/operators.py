"""
The types of operators in python are:
1.Arithmetic operators
2.Assignment operators
3.Comparison operators
4.Logical operators
5.Identity operators
6.Membership operators
7.Bitwise operators"""

#arithmetic operators are + - % / // * **
a,b=10,2
print(a+b)# add
print(a-b)# substract
print(a%b)# returns the reminder
print(a/b)# returns the exact value after division here it is 5 is it was 11/2 it will be 5.5
print(a//b)# returns the floor here it is 5 if it was 11//2 it will be 5
print(a**b)# returns the a power b value
print(a*b)# returns the multiplied value

#assignement are = += -= %= /= *= **= //= &= |= ^= >>= <<=
a=10 # normal assignment
a+=10 #performs the operation and assignes the expanded version is a=a+10
print(a)
a-=10
print(a)
a+=a**2 #the operations is performed just before assignement so the right side of assignment is calculated and the result is added to it.
print(a)

#comparision == < > <= >= != are the operators which return the boolean value after operation
print(a==b)
print(a<b)
print(a>b)
print(a<=b)
print(a>=b)
print(a!=b)

#logical and or not are the logical operators used to combine statements
print(a>=b and a<1000)
print(a>=b or a<1000)

#is is an identity operator and in is an mumbership operator
print(1 in [1,2,3])

#bitwise operator are & | >> << ^ ~ are the operators that performs the operaton on the binary numbers
print(3&1)# return & operation between 11 and 01 that is 01
print(3|1)# 3 since 11 | 01 is 11
print(3>>1) # moves the whole binary code to right that it halfs the number 11 to 01
print(3<<1) # moves the whole binary code to left that it doubles the number 11 to 110

