import random
import math

for i in range(5):
    print(random.randint(1, 10))  # NOTE: 10 is inclusive

print('--------------------------------')

a = 2
b = 3.56

print(math.pow(a,b))
print(math.factorial(int(b)))
print(math.log10(100))
print(math.floor(b))
print(math.ceil(b))
print(math.gcd(50, 125))
print(math.sqrt(a))