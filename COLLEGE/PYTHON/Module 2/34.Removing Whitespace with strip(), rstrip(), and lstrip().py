import pyperclip

''' Sometimes you may want to strip off whitespace characters (space, tab, 
    and newline) from the left side, right side, or both sides of a string. 
    The strip() string method will return a new string without any whitespace
    characters at the beginning or end. The lstrip() and rstrip() methods
    will remove whitespace characters from the left and right ends, respectively.
'''

spam = '    Hello World    '
spam.strip()  #'Hello World' #strip both side

spam.lstrip() #'Hello World    ' #strip left side

spam.rstrip() #'    Hello World' #strip right side

spam = 'SpamSpamBaconSpamEggsSpamSpam'
spam.strip('ampS') #'BaconSpamEggs'        #strip from both side of string









'''
Copying and Pasting Strings with the pyperclip Module:
The pyperclip module has copy() and paste() functions that can send text
to and receive text from your computer’s clipboard. Sending the output of
your program to the clipboard will make it easy to paste it to an email, word
processor, or some other software.
Note: pyperclip module is not available in python, it's a third party module and 
to using this, we have to install this by given command:
pip install pyperclip
'''

pyperclip.copy('Hello world!')
print(pyperclip.paste())  #'Hello world!'

