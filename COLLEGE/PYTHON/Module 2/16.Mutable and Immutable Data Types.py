'''
A list value is a mutable data type: It can have values added, removed, or changed. 
However, a string is immutable: It cannot be changed. Trying to reassign a single 
character in a string results in a TypeError error.
'''

name = 'Zophie a cat'
# name[7] = 'the' # TypeError due to mutable string.


'''
The proper way to “mutate” a string is to use slicing and concatenation
to build a new string by copying from parts of the old string.
'''
name = 'Zophie a cat'
newName = name[0:7] + 'the' + name[8:12]
print(name)
