# Python if Statement:
# If the number is positive, we print an appropriate message
num = 3
if num > 0:
    print(num, "is a positive number.")
print("This is always printed.")

num = -7
if num > 0:
    print(num, "is a positive number.")
print("This is also always printed.")




#Python if...else Statement:
# Program checks if the number is positive or negative & displays appropriate message
num = 3  # num = -5  # num = 0

if num >= 0:
    print("Positive or Zero")
else:
    print("Negative number")




#Python if...elif...else Statement:
'''In this program, 
we check if the number is positive or
negative or zero and 
display an appropriate message'''

num = 3.4  # num = 0  # num = -4.5

if num > 0:
    print("Positive")
elif num == 0:
    print("Zero")
else:
    print("Negative")



#Python Nested if statements:
'''In this program, we input a number
check if the number is positive or
negative or zero and display
an appropriate message
This time we use nested if statement'''

num = float(input("Enter a number: "))
if num >= 0:
    if num == 0:
        print("Zero")
    else:
        print("Positive number")
else:
    print("Negative number")
