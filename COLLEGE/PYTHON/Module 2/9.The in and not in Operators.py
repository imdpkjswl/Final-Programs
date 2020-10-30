res = 'howdy' in ['hello', 'hi', 'howdy', 'heyas']
print(res) #True

spam = ['hello', 'hi', 'howdy', 'heyas']
print('cat' in spam) #False


res = 'howdy' not in spam
print(res) #False


res = 'cat' not in spam
print(res) #True



# checks to see whether the name is in a list of pets using if statement.
myPets = ['jacky', 'Pooka', 'Fat-tail', 'paul']
print('Enter a pet name:')
name = input()
if name not in myPets:
    print('I do not have a pet named ' + name)
else:
    print(name + ' is my pet.')

