#declaring & assigning variable's value
website = "apple.com"
print(website)

# assigning a new value to website
website = "google.com"

print(website)

#Assigning multiple values to multiple variables
a, b, c = 5, 3.2, "Hello"
print (a)
print (b)
print (c)

x = y = z = "same"

print (x)
print (y)
print (z)


#Constants-A constant is a type of variable whose value cannot be changed.
#Declaring and assigning value to a constant
PI = 3.14
GRAVITY = 9.8


#Literals-A Literal is a raw data given in a variable or constant. 
                    #Types of Literals-
'''Numeric Literals: Numeric Literals are immutable (unchangeable). It can 
belong to 3 different numerical types: Integer, Float, and Complex.'''
a = 0b1010 #Binary Literals
b = 100 #Decimal Literal 
c = 0o310 #Octal Literal
d = 0x12c #Hexadecimal Literal

#Float Literal
float_1 = 10.5 
float_2 = 1.5e3

#Complex Literal 
x = 5.0 + 3.14j

print(a, b, c, d) #10 100 200 300
print(float_1, float_2) #10.5 150.0
print(x, x.imag, x.real) #(5+3.14j) 3.14 5.0


'''String literals: A string literal is a sequence of characters surrounded 
    by quotes. We can use both single, double, or triple quotes for a string.'''
strings = "This is Python"
char = "C"
multiline_str = """This is a multiline string with more than one line code."""
unicodes = u"\u00dcnic\u00f6de" #\u00dc represents Ü and \u00f6 represents ö.
raw_str = r"raw \n string"

print(strings)
print(char)
print(multiline_str)
print(unicodes) 
print(raw_str) 


'''Boolean literals:
    A Boolean literal can have any of the two values: True or False.'''
x = (1 == True)
y = (1 == False)
a = True + 4
b = False + 10

print("x is: ", x)
print("y is: ", y)
print("a: ", a)
print("b: ", b)

'''Special literals: Python contains one special literal i.e. None. 
    We use it to specify that the field has not been created.'''
drink = "Available"
food = None

def menu(x):
    if x == drink:
        print(drink)
    else:
        print(food)

menu(drink)
menu(food)

'''Literal Collections: There are four different literal collections List 
            literals, Tuple literals, Dict literals, and Set literals.'''
fruits = ["apple", "mango", "orange"] #list
numbers = (1, 2, 3) #tuple
alphabets = {'a':'apple', 'b':'ball', 'c':'cat'} #dictionary
vowels = {'a', 'e', 'i' , 'o', 'u'} #set

print(fruits)
print(numbers)
print(alphabets)
print(vowels)