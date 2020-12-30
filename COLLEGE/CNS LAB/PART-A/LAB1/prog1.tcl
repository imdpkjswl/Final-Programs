#Create a ns simulator
set ns [new Simulator]

#Open the NS trace file
set tf [open prog1.tr w]
$ns trace-all $tf

#Open the NAM trace file
set nf [open prog1.nam w]
$ns namtrace-all $nf

#Define a 'finish' procedure
proc finish {} {
global ns tf nf
$ns flush-trace
close $tf
close $nf
exec nam prog1.nam &
exit 0
}



#Create 3 nodes
set n1 [$ns node]
set n2 [$ns node]
set n3 [$ns node]


#Createlinks between nodes
$ns duplex-link $n1 $n2 1Mb 60ms DropTail
$ns queue-limit $n1 $n2 10
$ns duplex-link $n2 $n3 512Kb 60ms DropTail
$ns queue-limit $n2 $n3 4


#Setup a UDP connection
set udp1 [new Agent/UDP]
$ns attach-agent $n1 $udp1
set null1 [new Agent/Null]
$ns attach-agent $n3 $null1
$ns connect $udp1 $null1


#Setup a CBR Application over UDP connection
set cbr1 [new Application/Traffic/CBR]
$cbr1 attach-agent $udp1
$cbr1 set packetSize_ 500
$cbr1 set interval_ 0.005

$ns at 0.2 "$cbr1 start"
$ns at 1.5 "$cbr1 stop"
$ns at 2.0 "finish"

$ns run
