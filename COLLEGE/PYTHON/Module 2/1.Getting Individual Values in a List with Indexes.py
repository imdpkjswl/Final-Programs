#Create List manually
ls = []    #Empty list

ls = ['cat', 'bat', 'rat', 'elephant']

# Getting list value by the help of indexes
item1 = ls[0]   #cat
print(item1)

item2 = ls[3]   #elephant
print(item2)

#Lists can also contain other list values. The values in these lists of lists can be accessed using multiple indexes:
spam = [['cat', 'bat'], [10, 20, 30, 40, 50]]
item1 = spam[0] # Access list at index 0
print(item1)


item2 = spam[0][1] # Access 0th index list whose value at index 1
print(item2)


item3 = spam[1][4] # Access 1st index list whose value at index 4
print(item3)

