with open('file.txt', 'w') as f:
    f.write('Hey! i am writing first line.')
f.close()

with open('file.txt', 'w') as f:
    f.write('\nHey! i am writing second line.')
f.close()

with open('file.txt', 'r') as f:
    print(f.read())
f.close()