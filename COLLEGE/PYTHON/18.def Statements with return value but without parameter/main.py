
def myFunction():
    if age < 18:
        return 'Not eligible'
    else:
        return 'Eligible'

age = 37
res = myFunction()
print(res)

age = 13
res = myFunction()
print(res)