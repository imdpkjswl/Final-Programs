# The and Operator’s Truth Table

res = True and True
print(res)
res = True and False
print(res)
res = False and True
print(res)
res = False and False
print(res)

print()
# The or Operator’s Truth Table

res = True or True
print(res)
res = True or False
print(res)
res = False or True
print(res)
res = False or False
print(res)

print()
# The not Operator’s Truth Table
res = not True
print(res)
res = not False
print(res)
print()

# Facts
res = not True
print(res)
res = not not True
print(res)
res = not not not True
print(res)
res = not not not not True
print(res)

print()
# Mixing Boolean and comparison operators
res = (4 < 5) and (5 < 6)
print(res)
res = (4 < 5) and (9 < 6)
print(res)
res = (1 == 2) or (2 == 2)
print(res)