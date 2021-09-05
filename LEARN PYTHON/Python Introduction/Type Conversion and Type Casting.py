'''Implicit Type Conversion:
In Implicit type conversion, Python automatically converts one data type to 
    another data type. This process doesn't need any user involvement.'''
#Example 1: Converting integer to float
n_int = 123
n_flo = 1.23

n_new = n_int + n_flo

print("datatype of n_int:",type(n_int))
print("datatype of n_flo:",type(n_flo))

print("Value of n_new:",n_new)
print("datatype of n_new:",type(n_new))

#Example 2: Addition of string(higher) data type and integer(lower) datatype
n_int = 123
n_str = "456"

print("Data type of n_int:",type(n_int))
print("Data type of n_str:",type(n_str))

# print(n_int + n_str)  #In this situations which is known as Explicit Conversion.



'''Explicit Type Conversion:
In Explicit Type Conversion, users convert the data type of an object to required 
    data type. We use the predefined functions like int(), float(), str(), etc to 
    perform explicit type conversion.

This type of conversion is also called typecasting because the user casts (changes) 
the data type of the objects.'''

#Example 1: Addition of string and integer using explicit conversion.
n_int = 123
n_str = "456"

print("Data type of n_int:",type(n_int))
print("Data type of n_str before Type Casting:",type(n_str))

n_str = int(n_str)
print("Data type of n_str after Type Casting:",type(n_str))

n_sum = n_int + n_str

print("Sum of num_int and num_str:",n_sum)
print("Data type of the sum:",type(n_sum))

