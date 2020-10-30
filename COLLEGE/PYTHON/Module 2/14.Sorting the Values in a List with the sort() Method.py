'''
NOTE: sort() function is only used when list contain homogeneous type data.
'''
# sort integers in in-order
spam = [2, 5, 3.14, 1, -7]
spam.sort()
print(spam)


# sort words in lexicographical order
spam = ['ants', 'cats', 'dogs', 'badgers', 'elephants']
spam.sort()
print(spam)


# Pass True for the reverse keyword argument to have sort() sort the values in reverse order. 
spam = [2, 5, 3.14, 1, -7]
spam.sort(reverse=True)
print(spam)

