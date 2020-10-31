print('hello'.isalpha())

print('hello123'.isalpha())

print('hello123'.isalnum())

print('hello'.isalnum())

print('123'.isdecimal())

print('    '.isspace())

print('This Is Title Case'.istitle())

print('This Is Title Case 123'.istitle())

print('This Is not Title Case'.istitle())

print('This Is NOT Title Case Either'.istitle())


# The isX string methods are helpful when you need to validate user input.
while True:
    print('Enter your age:')
    age = input()
    if age.isdecimal():
        break
    print('Please enter your age correctly.')
while True:
    print('Select a new password (letters and numbers only):')
    password = input()
    if password.isalnum():
        print('Granted:):)')
        break
    print('Passwords can only have letters and numbers.')