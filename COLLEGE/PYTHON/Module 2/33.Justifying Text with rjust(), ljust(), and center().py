'''
The rjust() and ljust() string methods return a padded version of the
string they are called on, with spaces inserted to justify the text. The first
argument to both methods is an integer length for the justified string.
'''
'Hello'.rjust(10)
# '     Hello'

'Hello'.rjust(20)
# '               Hello'

'Hello World'.rjust(20)
# '         Hello World'

'Hello'.ljust(10)
# 'Hello     '


'''An optional second argument to rjust() and ljust() will specify a fill
character other than a space character.'''

'Hello'.rjust(20, '*')
# '***************Hello'

'Hello'.ljust(20, '-')
# 'Hello---------------'

#-------------------------------------------------------------------------------------#
'''The center() string method works like ljust() and rjust() but centers 
the text rather than justifying it to the left or right.'''

'Hello'.center(20)   # '       Hello        '

'Hello'.center(20, '=')  # '=======Hello========'


