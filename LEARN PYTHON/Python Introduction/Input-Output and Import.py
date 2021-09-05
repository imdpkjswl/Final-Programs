'''Python Output Using print() function:
We use the print() function to output data to the standard output device (screen).'''

print('This sentence is output to the screen')


''' The actual syntax of the print() function is:
print(*objects, sep=' ', end='\n', file=sys.stdout, flush=False)
'''
print(1, 2, 3, 4) # 1 2 3 4
print(1, 2, 3, 4, sep='*') # 1*2*3*4
print(1, 2, 3, 4, sep='@', end='!') # 1@2@3@4!

#Output formatting: Sometimes we would like to format our output to make it look 
#                   attractive. This can be done by using the str.format() method. 
print('I love {0} and {1}'.format('bread','butter')) # I love bread and butter
print('I love {1} and {0}'.format('bread','butter')) # I love butter and bread


x = 12.3456789
print('The value of x is %3.2f' %x) # The value of x is 12.35



'''Python Input: To allow flexibility, we might want to take the input from the user. 
        we have the input() function to allow this. The syntax for input() is:'''
num = input('Enter a number: ')
print(num)



'''Python Import: A module is a file containing Python definitions and statements. 
            Python modules have a filename and end with the extension .py.

Definitions inside a module can be imported to another module or the interactive 
            interpreter in Python. We use the import keyword to do this.'''
import math
print(math.pi)

import sys
print(sys.path)
