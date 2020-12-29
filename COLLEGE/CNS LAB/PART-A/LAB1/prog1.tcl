set ns [new Simulator]   /*object create of Simulator classs */


# Open nam trace file in write mode
set nf [open prog1.nam w]
$ns namtrace-all $nf


# Open trace file in write mode
set tf [open prog1.tr w]
$ns trace-all $tf


# Finish process
proc finish {} {
global ns nf tf
close $nf
close $tf
exec nam prog1.nam & 
exit 0
}



# Code for creating node
set n0 [$ns node]
set n1 [$ns node]
set n2 [$ns node]
set n3 [$ns node]



# Code to label the nodes
$n0 label "Source/udp0"
$n1 label "Source/udp1"
$n2 label "Router"
$n3 label "Destination/Null"


# Vary the bandwidths below and See the change in the number of packets dropped in each Simulation
$ns duplex-link $n0 $n2 250Kbps 20ms DropTail
$ns duplex-link $n1 $n2 25Mb 20ms DropTail
$ns duplex-link $n2 $n3 10Mb 20ms DropTail


# Code to set the queue-limit for each Links
$ns set queue-limit $n0 $n2 10
$ns set queue-limit $n1 $n2 10
$ns set queue-limit $n2 $n3 10


# Code to attach UDP Agent & Null Agent to nodes using UDP protocol(Connectionless)
set udp0 [new Agent/UDP]
$ns attach-agent $n0 $udp0    	/* assigning all feature of udp to n0 */ 

set cbr0 [new Application/Traffic/CBR]
$cbr0 attach-agent $udp0
$cbr0 set packetSize 1000
$cbr0 set interval 0.05

set udp1 [new Agent/UDP]
$ns attach-agent $n1 $udp1
set cbr1 [new Application/Traffic/CBR]
$cbr1 attach-agent $udp1

set udp2 [new Agent/UDP]
$ns attach-agent $n2 $udp2
set cbr2 [new Application/Traffic/CBR]
$cbr2 attach-agent $udp2

#Assigning null object to n3
set null0 [new Agent/Null]
$ns attach-agent $n3 $null0


# Code to connect the Agents
$ns connect $udp0 $null0
$ns connect $udp1 $null0


# Code to start the Simulation
$ns at 0.3 "$cbr0 start"
$ns at 0.15 "$cbr1 start"
$ns at 2.0 "finish"
$ns run
