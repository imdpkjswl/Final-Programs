'''Arguments:
In the user-defined function topic, we learned about defining a function and 
calling it. Otherwise, the function call will result in an error.'''
def greet(name, msg):
    """This function greets to
    the person with the provided message"""
    print("Hello", name + ', ' + msg)

greet("Monica", "Good morning!")




'''Variable Function Arguments
Up until now, functions had a fixed number of arguments. In Python, there are 
other ways to define a function that can take variable number of arguments.'''
#Python Default Arguments
def greet(name, msg="Good morning!"):
    """
    This function greets to
    the person with the
    provided message.

    If the message is not provided,
    it defaults to "Good
    morning!"
    """
    print("Hello", name + ', ' + msg)


greet("DEEPAK")
greet("dj", "How do you do?")





'''Python Arbitrary Arguments:
In the function definition, we use an asterisk (*) before the parameter name to 
denote this kind of argument. Here is an example.'''
def greet(*names):
    """This function greets all
    the person in the names tuple."""

    # names is a tuple with arguments
    for name in names:
        print("Hello", name)


greet("Monica", "Luke", "Steve", "John")

