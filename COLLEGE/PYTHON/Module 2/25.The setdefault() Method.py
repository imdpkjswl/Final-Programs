spam = {'name': 'Pooka', 'age': 5}
print(spam)

if 'color' not in spam:
    spam['color'] = 'black'
print(spam)  

print('---------------------------------------------')

'''
The setdefault() method offers a way to do this in one line of code. The first
argument passed to the method is the key to check for, and the second argument 
is the value to set at that key if the key does not exist. If the key does exist, 
the setdefault() method returns the key’s value.
'''  
spam = {'name': 'Alan', 'age': 15}
spam.setdefault('color', 'black')
print(spam)

rtn = spam.setdefault('color', 'white') # here, color key already exist, so it wouldn't save value.
print(spam)
print(rtn)
