spam = 'Hello world!'
spam = spam.upper() #make upper
print(spam)

spam = spam.lower() #make lower
print(spam)


spam = 'Hello world!'
print(spam.islower()) #check whether string is lower or not.

print(spam.isupper()) #check whether string is upper or not.

print('HELLO'.isupper()) #check whether string is upper or not.

print('abc12345'.islower()) #check whether string is lower or not.

print('12345'.islower()) # false

print('12345'.isupper()) # false



# Mixed with other string functions
print('Hello'.upper())

print('Hello'.upper().lower())

print('Hello'.upper().lower().upper())

print('HELLO'.lower())

print('HELLO'.lower().islower())

