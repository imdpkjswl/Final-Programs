spam = {'name': 'Zophie', 'age': 7}

res = 'name' in spam.keys() #searching key
print(res)

res = 'Zophie' in spam.values() #searching value
print(res)

res = 'color' in spam.keys()
print(res)

res = 'color' not in spam.keys()
print(res)

res = 'color' in spam  # Best method to search key
print(res)



'''
Dictionaries have a get() method that takes two arguments: 
the key of the value to retrieve and a fallback value 
to return if that key does not exist.
'''

items = {'apples': 5, 'cups': 2}
s = 'I am bringing ' + str(items.get('cups', 0)) + ' cups.'
print(s)

s = 'I am bringing ' + str(items.get('eggs', -1)) + ' eggs.'
print(s)

#Note: here, 0 and -1 are feedback value which can be anything.