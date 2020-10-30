spam = ['hello', 'hi', 'howdy', 'heyas', 'hi']
i = spam.index('hello') #0
print(i)

# When there are duplicates of the value in the list, the index of its first appearance is returned
i = spam.index('hi')
print(i)
