
def myFunction(age):
    if age < 18:
        return 'Not eligible'
    else:
        return 'Eligible'

res = myFunction(13)
print(res)
res = myFunction(43)
print(res)