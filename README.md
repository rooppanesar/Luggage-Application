# Luggage-Application
This is a Luggage Handling application.

Question details
You are asked to write a program that simulates the actions of luggage handling for a large
aircraft, assuming:
Luggage is loaded into containers in the order the luggage arrives.
When a container doesn't have enough capacity for the next luggage, or there is no more luggage,
the container is loaded into the aircraft.
The weight capacity of each container is 40 weight units.
At the destination, containers are unloaded from the plane in LIFO order, meaning the last
container loaded in is unloaded first.
Luggage is unloaded from containers in FIFO order, meaning the first luggage which was loaded
into each container is unloaded first.
Input: one string containing all luggage weights, separated by commas (no space) in the order of
arrival: "<bag1_weight>,<bag2_weight>,...<bagN_weight>".
Output: a string in the same format as input representing the order in which the bags are
unloaded.
For example, the bags "30,5,6" will be loaded into 2 containers, "30,5" and "6". Then the
containers will be unloaded in the opposite order: "6", "30, 5" and the bags in each container will
be unloaded in order, so the overall result will be "6,30,5".
Bags’ weights are always > 0 units.
Dimensions of luggage and containers do not matter.
Handle bags that are > 40 units: throw an error/just ignore the bag as being against airline policy.
The last container might not fill completely: make sure it is accounted for.
Handle empty input: must result in empty output nonetheless.
