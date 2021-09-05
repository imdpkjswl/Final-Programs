#Multi-line statement
#A statement extend over multiple lines with the line continuation character (\):
a = 1 + 2 + 3 + \
    4 + 5 + 6 + \
    7 + 8 + 9

print(a) #45


'''This is an explicit line continuation. In Python, line continuation 
   is implied inside parentheses ( ), brackets [ ], and braces { }.'''
a = (1 + 2 + 3 +
    4 + 5 + 6 +
    7 + 8 + 9 + 10)

print(a)#55

colors = ['red',
          'blue',
          'green']

print(colors)#['red', 'blue', 'green']


#We can also put multiple statements in a single line using semicolons, as follows:
a = 1; b = 2; c = 3


#Python Indentation
#Generally, four whitespaces are used for indentation and are preferred over tabs.
if True:
    print('Hello1')
    a = 1

if True: print('Hello2'); a = 2 
#both are valid and do the same thing, but the former style is clearer.


#Python Comments
#Single-line
#This is a long comment
#and it extends
#to multiple lines

#Multi-line
"""This is also a
perfect example of
multi-line comments"""





