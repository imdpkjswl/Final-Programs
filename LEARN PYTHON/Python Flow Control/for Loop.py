'''
Syntax of for Loop-
for val in sequence:
    loop body
'''
# Program to find the sum of all numbers stored in a list

# List of numbers
numbers = [6, 5, 3, 8, 4, 2, 5, 4, 11]

sum = 0 # To store sum

# iterate over the list
for val in numbers:
    sum = sum+val

print("The sum is: ", sum)


'''The range() function:
We can generate a sequence of numbers using range() function. range(10) will generate
numbers from 0 to 9 (10 numbers).

We can also define the start, stop and step size as range(start, stop,step_size). 
step_size defaults to 1 if not provided.'''
print(range(10))

print(list(range(10)))

print(list(range(2, 8)))

print(list(range(2, 20, 3)))



# Program to iterate through a list using indexing
genre = ['pop', 'rock', 'jazz']

# iterate over the list using index
for i in range(len(genre)):
    print("I like", genre[i])




'''for loop with else:
A for loop can have an optional else block as well. The else part is executed if 
the items in the sequence used in for loop exhausts.

The break keyword can be used to stop a for loop. In such cases, the else part 
is ignored. '''

digits = [0, 2, 5]

for i in digits:
    print(i)
else:
    print("No items left.")




# program to display student's marks from record
student_name = 'Jules'

marks = {'James': 90, 'Jules': 55, 'Arthur': 77}

for student in marks:
    if student == student_name:
        print(marks[student])
        break # After break execution, else part will not execute.
else:
    print('No entry with that name found.')