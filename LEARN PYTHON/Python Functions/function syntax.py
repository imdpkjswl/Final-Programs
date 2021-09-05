'''Syntax of Function:
def function_name(parameters):
	"""docstring"""
	statement(s)
Above shown is a function definition that consists of the following components.

1.Keyword def that marks the start of the function header.
2.A function name to uniquely identify the function. Function naming follows the same rules of writing identifiers in Python.
3.Parameters (arguments) through which we pass values to a function. They are optional.
4.A colon (:) to mark the end of the function header.
5.Optional documentation string (docstring) to describe what the function does.
6.One or more valid python statements that make up the function body. Statements must have the same indentation level (usually 4 spaces).
7.An optional return statement to return a value from the function.

NOTE: In python, the function definition should always be present before the 
      function call. Otherwise, we will get an error.'''

def greet(name):
    """
    This function greets to
    the person passed in as
    a parameter
    """
    print("Hello, " + name + ". Good morning!")

#How to call a function in python?
greet('dj')


'''The return statement:
        The return statement is used to exit a function and go back to the 
        place from where it was called.'''

def absolute_value(num):
    """This function returns the absolute
    value of the entered number"""

    if num >= 0:
        return num
    else:
        return -num


print(absolute_value(2))

print(absolute_value(-4))


#Python Built-in Functions
Python abs()
returns absolute value of a number

Python all()
returns true when all elements in iterable is true

Python any()
Checks if any Element of an Iterable is True

Python ascii()
Returns String Containing Printable Representation

Python bin()
converts integer to binary string

Python bool()
Converts a Value to Boolean

Python bytearray()
returns array of given byte size

Python bytes()
returns immutable bytes object

Python callable()
Checks if the Object is Callable

Python chr()
Returns a Character (a string) from an Integer

Python classmethod()
returns class method for given function

Python compile()
Returns a Python code object

Python complex()
Creates a Complex Number

Python delattr()
Deletes Attribute From the Object

Python dict()
Creates a Dictionary

Python dir()
Tries to Return Attributes of Object

Python divmod()
Returns a Tuple of Quotient and Remainder

Python enumerate()
Returns an Enumerate Object

Python eval()
Runs Python Code Within Program

Python exec()
Executes Dynamically Created Program

Python filter()
constructs iterator from elements which are true

Python float()
returns floating point number from number, string

Python format()
returns formatted representation of a value

Python frozenset()
returns immutable frozenset object

Python getattr()
returns value of named attribute of an object

Python globals()
returns dictionary of current global symbol table

Python hasattr()
returns whether object has named attribute

Python hash()
returns hash value of an object

Python help()
Invokes the built-in Help System

Python hex()
Converts to Integer to Hexadecimal

Python id()
Returns Identify of an Object

Python input()
reads and returns a line of string

Python int()
returns integer from a number or string

Python isinstance()
Checks if a Object is an Instance of Class

Python issubclass()
Checks if a Class is Subclass of another Class

Python iter()
returns an iterator

Python len()
Returns Length of an Object

Python list()
creates a list in Python

Python locals()
Returns dictionary of a current local symbol table

Python map()
Applies Function and Returns a List

Python max()
returns the largest item

Python memoryview()
returns memory view of an argument

Python min()
returns the smallest value

Python next()
Retrieves next item from the iterator

Python object()
creates a featureless object

Python oct()
returns the octal representation of an integer

Python open()
Returns a file object

Python ord()
returns an integer of the Unicode character

Python pow()
returns the power of a number

Python print()
Prints the Given Object

Python property()
returns the property attribute

Python range()
return sequence of integers between start and stop

Python repr()
returns a printable representation of the object

Python reversed()
returns the reversed iterator of a sequence

Python round()
rounds a number to specified decimals

Python set()
constructs and returns a set

Python setattr()
sets the value of an attribute of an object

Python slice()
returns a slice object

Python sorted()
returns a sorted list from the given iterable

Python staticmethod()
transforms a method into a static method

Python str()
returns the string version of the object

Python sum()
Adds items of an Iterable

Python super()
Returns a proxy object of the base class

Python tuple()
Returns a tuple

Python type()
Returns the type of the object

Python vars()
Returns the __dict__ attribute

Python zip()
Returns an iterator of tuples

Python __import__()
Function called by the import statement