package com.example.datastructurespractice.Medium;

public class AirLineManagement {
    /*
    I approached the problem by discussing how important availability and consistency was for this system. Based on these ideas I suggested redundancy in server nodes and choosing an SQL database for consistency with a cache close to the server which would hold metrics like available runways, list of close-by airports etc. These answers were based on the various articles I had read through for system design interviews. I drew a class diagram along with the whole architecture of the system.

However the interviewer was time and again trying to steer in the direction of what kinds of metrics would be needed from the plane to ground control and vice versa. So I roughly came up with the following:

Info from flight to ATC:

Flight number and airline.
Expected landing/departure time.
Flight's coordinates in 3D plane.
Remaining fuel amount and weight of the total load (to calculate distance incase plane needs to hold landing or needs to be redirected to another airport)
Velocity & direction so trajectory can be calculated along with co-ordinates so two or more planes do not collide.
Info from ATC to flight:

Available runway to land or place in queue for take-off (to be read from cache).
Holding coordinates in case any runway is not available to land.
Co-ordinates of close-by airports incase of emergencies (storms etc) based on the their fuel level (Plane A with 2 units of fuel needs to land to closest airport than Plane B with 10 units of fuel which can land at next closest airport).
Info from ATC to other near by ATCs:

Flight number and airline for re-directed flights.
Emergency indicator for priority based on remaining fuel incase more than 1 flight is being diverted.
Thats mostly everything as far as I can recollect. Will edit incase I can think of something else.
All the best :)
     */
}
