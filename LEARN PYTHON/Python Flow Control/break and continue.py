'''Python break statement:
The break statement terminates the loop containing it. Control of the program flows 
to the statement immediately after the body of the loop.

If the break statement is inside a nested loop (loop inside another loop), the break 
statement will terminate the innermost loop.
NOTE: break keyword can be used inside Loop as well If statement'''
# Use of break statement inside the loop
for val in "string":
    if val == "i":
        break
    print(val,end=" ")

print("\nThe end")



'''Python continue statement:
The continue statement is used to skip the rest of codes inside a loop for the current 
iteration only. Loop does not terminate but continues on with the next iteration.
NOTE: continue keyword can be used only inside Looping statement'''
# Program to show the use of continue statement inside loops

for val in "string":
    if val == "i":
        continue # 'i' character will be skipped
    print(val,end=" ")

print("\nThe end")

