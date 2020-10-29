# When you first begin writing programs, it’s tempting to create many individual
# variables to store a group of similar values.

'''
print('Enter the name of cat 1:')
catName1 = input()
print('Enter the name of cat 2:')
catName2 = input()
print('Enter the name of cat 3:')
catName3 = input()
print('Enter the name of cat 4:')
catName4 = input()
print('Enter the name of cat 5:')
catName5 = input()
print('Enter the name of cat 6:')
catName6 = input()

print('The cat names are:')
print(catName1 + ' ' + catName2 + ' ' + catName3 + ' ' + catName4 + ' ' + catName5 + ' ' + catName6)

'''


''' Instead of using multiple, repetitive variables, you can use a single
    variable that contains a list value. '''

catNames = [] # Create empty list
while True:
    print('Enter the name of cat ' + str(len(catNames) + 1) +' (Or enter nothing to stop.):')
    name = input()
    if name == '':
        break

    catNames = catNames + [name]  # list concatenation

if(len(catNames) == 0):
    print('You have not entered any cat names...')
    exit()

print('The cat names are:')
for name in catNames:
    print('    --> ' + name)