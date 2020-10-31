myCat = {'size': 'fat', 'color': 'gray', 'disposition': 'loud'}

print(myCat['size']) #accessed by key

print('My cat has ' + myCat['color'] + ' fur.') #access to concate with string
print('------------------------------')



'''
Dictionaries can still use integer values as keys, just like lists use integers
for indexes, but they do not have to start at 0 and can be any number.
'''
spam = {1: 'One', 3: 'Three', 5: 'Five', 7: 'Seven'}

key = 1
for i in range(
    1, 
    len(spam)+1
    ):
    print(spam[key])
    key = key+2
 
   
    
