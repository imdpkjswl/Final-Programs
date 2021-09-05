'''In Python programming, the pass statement is a null statement. The difference 
      between a comment and a pass statement in Python is that while the interpreter 
      ignores a comment entirely, pass is not ignored. However, nothing happens when 
      the pass is executed. It results in no operation (NOP).'''

# pass is just a placeholder for functionality to be added later.
sequence = {'p', 'a', 's', 's'}
for val in sequence:
    pass

# We can do the same thing in an empty function or class as well.

def function(args):
    pass

class Example:
    pass

print("THE END")