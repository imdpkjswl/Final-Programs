'''Syntax of while Loop in Python:
while test_expression:
    Body of while
'''

# Program to add natural numbers up to n, i.e. sum = 1+2+3+...+n
n = 10

# initialize sum and counter
sum = 0
i = 1
while i <= n:
    sum = sum + i
    i = i+1    # update counter

# print the sum
print("The sum is", sum)



'''while loop with else:
Same as with for loops, while loops can also have an optional else block.The else 
part is executed if the condition in the while loop evaluates to False.

The while loop can be terminated with a break statement. In such cases, the else 
part is ignored. '''
'''Example to illustrate
the use of else statement
with the while loop'''

counter = 0

while counter < 3:
    print("Inside while loop")
    counter = counter + 1
else:
    print("Inside else")