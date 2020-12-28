HOW TO RUN EXPERIMENT 1:

STATEMENT: Implement three nodes point – to – point network with duplex links between them. Set the queue
size, vary the bandwidth and find the number of packets dropped.

Step1: Open text editor, type the below program and save with extention .tcl (prog1.tcl ) 

Step2: Open text editor, type the below program and save with extention .awk (prog1.awk ) 

Step3: Run the simulation program
[root@localhost~]# ns prog1.tcl

Step 4: Now press the play button in the simulation window and the simulation will begins.

Step 5: After simulation is completed run awk file to see the output ,
[root@localhost~]# awk  –f  prog1.awk  prog1.tr
Number of packets droped = 152

Step 6: To see the trace file contents open the file as ,
[root@localhost~]# vi prog1.tr