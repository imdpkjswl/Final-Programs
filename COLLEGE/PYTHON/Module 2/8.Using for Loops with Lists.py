# Variable i set to a successive value in the [0, 1, 2, 3] list in each iteration.
for i in [0, 1, 2, 3]:
    print(i)

print("---------------------------------------------")



'''
Using range(len(supplies)) in the loop can access the index (as the variable i) and 
the value at that index (as supplies[i])
'''
supplies = ['pens', 'staplers', 'flame-throwers', 'binders']
for i in range(len(supplies)):
    print('Index ' + str(i) + ' in supplies is: ' + supplies[i])
