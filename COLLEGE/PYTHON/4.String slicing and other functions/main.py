
mystr = "hello i am Deepak Jaiswal"

print(len(mystr))  # print length of string

print(mystr[4])  # print any specific character of string
print(mystr[0:4])  # print a range of character of string, here 4 is excluding

print(mystr[0:5:2])  # print character by skipping one character of string, here 0 to 5 is range and 2 is to skip one

print(mystr[:4])  # automatically it consider as start from zero
print(mystr[::])  # print any specific character of string, by default skip it take as one
print(mystr[:4:])  # by default it skip one character
print(mystr[::412])  # it just print first index value

print(mystr[-4:-2])  # negative start from last index as -1. hence -4 to -2 range will print
print(mystr[::-1])  # Reverse the given string
print(mystr[::-2])  # Reverse the given string by skipping one character


# Functions
print(mystr.isalnum())  # use to check alpha-numeric or not
print(mystr.isalpha())  # use to check alpha, space is not a alpha
print(mystr.endswith("wal")) # Used to check string is ending with specific string
print(mystr.count("i")) # used to count character
print(mystr.capitalize())  # It make capital letteer of first character of string
print(mystr.find("am")) # Used to find string in given string & return index
print(mystr.lower())  # used to make all lower case
print(mystr.upper())  # used to make all upper case
print(mystr.replace("hello", "Hi")) # Replace a string with another string

