"""statments are the instructions that are provided to the intrepretur to execute some lines of code
we have different types of statments such as assignment, conditional , looping etc"""

# conditional statments : these are the statments that execute a block of code if the condition is true
a,b=10,20
#if else statments
if a<b:
    print("{} is less then {}".format(a,b))
else:
    print("{1} is less then {0}".format(a,b))

#if else ladder
if a>20:
    print("{} is grater then 20".format(a))
elif a>5 and a<15:
    print("{} is grater then 5 and lessthan 15".format(a))
else:
    print("{} is lessthan 5".format(a))

#nested if else
if a>5:
    if a%2:
        print("{} is grater than 5 and even".format(a))
    else:
        print("{} is grater than 5 and odd".format(a))
else:
    if a%2:
        print("{} is less than 5 and even".format(a))
    else:
        print("{} is less than 5 and odd".format(a))

#shorthand
print("{} is even".format(a)) if a%2==0 else print("{} is odd".format(a))

#loops
#while loop
j=0
# executes until the condition is false
while j<a:
    print(j)
    j+=1
else:
    #executes when the while statment is wrong
    print("while is false")

i=0
while i<a:
    if i>5:
        #breaks the flow of the loop and skips the next lines
        break
    print(i)
    i+=1
else:
    #skips when break executes
    print("2nd while is false")
#only prints even numbers
i=0
while i<a:
    if i&1:
        #stops the executions of below lines and moves to top of the loop
        i+=1
        continue
    print(i)
    i+=1
else:
    #skips when break executes
    print("3nd while is false")

# for loop
print("for loop1")
for x in range(0,5):
    print(x)
print("for loop2")
for x in "hello":
    print(x,end=" ")
print("for loop3")
for x in range(0,5):
    if x&1:
        continue
    print(x)
print("for loop4")
for x in range(0,5,2):
    if x&1:
        continue
    print(x)
else:
    print("out of for loop")


