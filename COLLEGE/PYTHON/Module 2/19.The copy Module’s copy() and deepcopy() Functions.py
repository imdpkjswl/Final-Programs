import copy

spam = ['A', 'B', 'C', 'D']

cheese = copy.copy(spam) # copy spam into cheese

cheese[1] = 42 # make some changes

print(spam)
print(id(spam))
print(cheese)
print(id(cheese))

'''
If the list you need to copy contains lists, then use the copy.deepcopy()
function instead of copy.copy(). 
"The deepcopy() function will copy these inner lists as well."
'''
cheese = copy.deepcopy(spam)
print(cheese)
print(id(cheese))

