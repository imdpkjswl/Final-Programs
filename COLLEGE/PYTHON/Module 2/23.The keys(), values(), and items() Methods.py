spam = {'color': 'red', 'age': 42}

# a for loop iterates over each of the values in the spam dictionary.
for v in spam.values():
        print(v)

print('--------------------------')

# a for loop iterates over each of the keys in the spam dictionary.
for k in spam.keys():
        print(k)
        

# a for loop iterates over each of the key-value pairs in the spam dictionary.
# Note: It returns tuples for every key-value pair.        
for i in spam.items():
        print(i)

print('----------------------------')


'''
You can also use the multiple assignment trick in a for loop to assign
the key and value to separate variables.
'''
spam = {'color': 'white', 'age': 20}
for k, v in spam.items(): #it first return key then value of key
        print('Key: ' + k + ', Value: ' + str(v))        


      