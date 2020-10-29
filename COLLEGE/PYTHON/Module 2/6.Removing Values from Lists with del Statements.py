spam = ['cat', 'bat', 'rat', 'elephant']

# delete element at index 2
del spam[2]
print(spam)

'''
All of the values in the list after the deleted value will be moved up one index. 
'''
# again delete element at index 2
del spam[2]
print(spam)

'''
The del statement can also be used on a simple variable to delete it, as
if it were an “unassigned” statement. If you try to use the variable after
deleting it, you will get a NameError error because the variable no longer exists.
'''

variable = "World's worst VTU" 

print(variable)
del variable  # deallocate variable

try:
    print(variable) # Throw NameError exception
except Exception as e:
    print("NameError error\n",e)

