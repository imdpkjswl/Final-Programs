# For Loop with range that takes three arguments:
# Arguments are - Starting, Stopping, and Stepping arguments

# With one argument
for i in range(5):
    print(i)

print()

# With two argument
for i in range(1, 5):
    print(i)

print()

# With three argument
for i in range(0, 5, 2):
    print(i)

print()

# For loop with continue and break keyword
for i in range(10):
    if i == 4:
        continue
    if i == 8:
        break
    print(i)
