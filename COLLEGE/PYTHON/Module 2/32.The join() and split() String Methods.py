''' The join() method is useful when you have a list of strings that need to be
    joined together into a single string value. The join() method is called on a 
    string, gets passed a list of strings, and returns a string. 
'''


', '.join(['cats', 'rats', 'bats']) #'cats, rats, bats'

' '.join(['My', 'name', 'is', 'Simon']) #'My name is Simon'

'ABC'.join(['My', 'name', 'is', 'Simon']) #'MyABCnameABCisABCSimon'









'''
By default, the string 'My name is Simon' is split wherever whitespace characters
such as the space, tab, or newline characters are found.
You can pass delimiter string to the split() method to specify a different
string to split upon.
'''

'My name is Simon'.split()   #['My', 'name', 'is', 'Simon']

'MyABCnameABCisABCSimon'.split('ABC')  #['My', 'name', 'is', 'Simon']

'My name is Simon'.split('m')  #['My na', 'e is Si', 'on']





spam = '''Dear Alice,
How have you been? I am fine.
There is a container in the fridge
that is labeled "Milk Experiment".
Please do not drink it.
Sincerely,
Bob'''
spam.split('\n')

"""
['Dear Alice,', 'How have you been? I am fine.', 'There is a container in the
fridge', 'that is labeled "Milk Experiment".', '', 'Please do not drink it.',
'Sincerely,', 'Bob']
"""

