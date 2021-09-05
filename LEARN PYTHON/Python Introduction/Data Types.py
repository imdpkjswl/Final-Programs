'''Python Numbers: Integers, floating point numbers and complex numbers fall 
        under Python numbers category. They are defined as int, float and complex 
        classes in Python.
We can use the type() function to know which class a variable or a value belongs to. 
Similarly, isinstance() function is used to check if an object belongs to a cetain class.'''
a = 5
print(a, "is of type", type(a))

a = 2.0
print(a, "is of type", type(a))

a = 1+2j
print(a, "is of type", type(a))
print(a, "is complex number?", isinstance(1+2j,complex))



'''Python List: List is an ordered sequence of items. Declaring a list is pretty 
    straight forward. Items separated by commas are enclosed within brackets [ ].'''
a = [1, 2.2, 'python']

a = [5,10,15,20,25,30,35,40]

# a[2] = 15
print("a[2] = ", a[2])

# a[0:3] = [5, 10, 15]
print("a[0:3] = ", a[0:3])

# a[5:] = [30, 35, 40]
print("a[5:] = ", a[5:])

#Lists are mutable, meaning, the value of elements of a list can be altered.
a = [1, 2, 3]
a[2] = 4
print(a)

'''Python Tuple: A Tuple is an ordered sequence of items same as a list. The only 
        difference is that tuples are immutable.'''
t = (5,'program', 1+3j)

# t[1] = 'program'
print("t[1] = ", t[1])

# t[0:3] = (5, 'program', (1+3j))
print("t[0:3] = ", t[0:3])

# Generates error
# Tuples are immutable
# t[0] = 10


'''Python Strings: A String is sequence of Unicode characters. We can use single 
        quotes or double quotes to represent strings. Multi-line strings can be 
        denoted using single/double triple quotes.'''
s = "This is a string"
print(s)
s = '''A multiline
string and it's
    written 
        by mr. dj'''
print(s)


#Like a list and tuple, the slicing operator [ ] can be used with strings.
s = 'Hello world!'

# s[4] = 'o'
print("s[4] = ", s[4])

# s[6:11] = 'world'
print("s[6:11] = ", s[6:11])

# Generates error
# Strings are immutable in Python
# s[5] ='d'


'''Python Set: A Set is an unordered collection of unique items. Set is defined by 
      values separated by comma inside braces { }. Items in a set are not ordered.'''
a = {5,2,3,1,4}

# printing set variable
print("a = ", a)

# data type of variable a
print(type(a))


'''Python Dictionary: A Dictionary is an unordered collection of key-value pairs.'''
d = {1:'value','key':2}
print(type(d))

print("d[1] = ", d[1])

print("d['key'] = ", d['key'])

# Generates error-We use key to retrieve the respective value. But not the other way.
print("d[2] = ", d[2])





