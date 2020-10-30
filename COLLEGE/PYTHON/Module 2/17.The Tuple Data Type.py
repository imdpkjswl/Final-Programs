'''
tuples are typed with parentheses, ( and ) and 
it is an immutable data type
'''

spam = ('hello', 42, 0.5)

# spam[1] = 'hi' # TypeError due to immutable property of tuple

print(spam[0]) # access 0th index value

print(spam[1:3]) # access by slicing tuple

print(len(spam)) # length of tuple

