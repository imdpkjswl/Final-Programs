# Check a person is eligible for voting or not
age = -12

if 18 > age > 0:
    print('Not eligible for voting')
elif age >= 18:
    print('Eligible for voting')
else:
    print('Invalid age')