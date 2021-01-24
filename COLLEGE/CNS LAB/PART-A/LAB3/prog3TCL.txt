LanRouter set debug_ 0
# Code To Create Object Of Simualtion Class
set ns [new Simulator]


# Code To Open Animation File
set nf [open prog3.nam w]
$ns namtrace-all $nf


# Code To Open Trace File
set tf [open prog3.tr w]
$ns trace-all $tf


# Code To Create Class For Colouring Node
$ns color 1 "blue"
$ns color 2 "red"


# Code For Finish Process
proc finish {} {
global ns nf tf
close $nf
close $tf
exec nam prog3.nam &
exit 0
}


# Code To Create Nodes
set n0 [$ns node]
set n1 [$ns node]
set n2 [$ns node]
set n3 [$ns node]
set n4 [$ns node]
set n5 [$ns node]
set n6 [$ns node]
set n7 [$ns node]
set n8 [$ns node]


# Code To Change Colour And Shape Of Node
$n7 shape box
$n7 color Blue
$n8 shape hexagon
$n8 color Red


# Code To Label Nodes
$n1 label "Source1"
$n2 label "Source2"
$n7 label "Destination1"
$n8 label "Destination2"


# Code To Create Links Between Nodes
$ns duplex-link $n1 $n0 2Mb 10ms DropTail
$ns duplex-link $n2 $n0 2Mb 10ms DropTail
$ns duplex-link $n0 $n3 1Mb 20ms DropTail


# Code To Create A LAN Connection
$ns make-lan "$n3 $n4 $n5 $n6 $n7 $n8" 512Kb 40ms LL Queue/DropTail Mac/802_3


# Code To Orient Nodes And Their Links
$ns duplex-link-op $n1 $n0 orient right-down
$ns duplex-link-op $n2 $n0 orient right-up
$ns duplex-link-op $n0 $n3 orient right


# Code TO Set Queue Limit
$ns queue-limit $n0 $n3 20


# Code To Create TCP, Sink & FTP Class Objects
set tcp1 [new Agent/TCP/Vegas]
$ns attach-agent $n1 $tcp1
$tcp1 set packetSize_ 55
$tcp1 set class_ 1

set sink7 [new Agent/TCPSink]
$ns attach-agent $n7 $sink7
$ns connect $tcp1 $sink7

set ftp1 [new Application/FTP]
$ftp1 attach-agent $tcp1

set tfile1 [open file1.tr w]
$tcp1 attach $tfile1
$tcp1 trace cwnd_


set tcp2 [new Agent/TCP/Reno]
$ns attach-agent $n2 $tcp2
$tcp2 set packetSize_ 55
$tcp2 set class_ 2

set sink8 [new Agent/TCPSink]
$ns attach-agent $n8 $sink8
$ns connect $tcp2 $sink8

set ftp2 [new Application/FTP]
$ftp2 attach-agent $tcp2

set tfile2 [open file2.tr w]
$tcp2 attach $tfile2
$tcp2 trace cwnd_

# Code For Initiating Simulation
$ns at 0.1 "$ftp1 start"
$ns at 4.0 "$ftp1 stop"
#$ns at 7 "$ftp1 start"
$ns at 0.2 "$ftp2 start"
$ns at 6.5 "$ftp2 stop"
#$ns at 14 "$ftp1 stop"
#$ns at 10 "$ftp2 start"
#$ns at 15 "$ftp2 stop"
$ns at 6.0 "$ftp1 start"
$ns at 12.0 "$ftp1 stop"
$ns at 8.0 "$ftp2 start"
$ns at 13.5 "$ftp2 stop"


$ns at 16 "finish"
$ns run
