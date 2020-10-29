spam = ['cat', 'bat', 'rat', 'elephant']

# A slice is typed between square brackets, like an index, 
# but it has two integers separated by a colon
# Note: after colon integer is exclusive.

item1 = spam[0:4] 
print(item1)


item2 = spam[1:3]
print(item2)



item3 = spam[0:-1] # Negative indexing 0:-1 --> 0 to 2nd last (coz -1 is last index of list) 
print(item3)



# leave out one or both of the indexes on either side of the colon in the slice
spam = ['cat', 'bat', 'rat', 'elephant']
item4 = spam[:2]
print(item4)


item5 = spam[1:]
print(item5)