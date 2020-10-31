# These methods are used to check whether a string is 
# starting/ending with any specific string or not 

'Hello world!'.startswith('Hello') #True

'Hello world!'.endswith('world!')  #True

'abc123'.startswith('abcdef')  #False

'abc123'.endswith('12')  #False

'Hello world!'.startswith('Hello world!')  #True

'Hello world!'.endswith('Hello world!')  #True

