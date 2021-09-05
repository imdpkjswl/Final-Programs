'''Name (also called identifier) is simply a name given to objects. Everything in 
        Python is an object. Name is a way to access the underlying object.

For example, when we do the assignment a = 2, 2 is an object stored in memory and 
             a is the name we associate it with. We can get the address (in RAM) of 
        some object through the built-in function id(). Let's look at how to use it.'''
# Note: You may get different values for the id

a = 2
print('id(a) =', id(a)) #id(a) = 2285207120208

a = a+1
print('id(a) =', id(a)) #id(a) = 2285207120240

print('id(3) =', id(3)) #id(3) = 2285207120240

b = 2
print('id(b) =', id(b)) #id(b) = 2285207120208
print('id(2) =', id(2)) #id(2) = 2285207120208

