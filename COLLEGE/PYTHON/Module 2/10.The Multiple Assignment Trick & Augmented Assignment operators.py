'''
# The Multiple Assignment Trick:
The number of variables and the length of the list must be 
exactly equal, or Python will give you a ValueError:
'''
cat = ['fat', 'black', 'loud', '2000']
size, color, disposition, price = cat


# Augmented Assignment operators
spam = 20
# add
spam += 1
print(spam) #21

# minus
spam -= 1
print(spam) # 20

# multiply
spam *= 1
print(spam) # 20

# division
spam /= 1 
print(spam) # 20

# modulo
spam %= 1
print(spam) # 0

