# Access Control Using Java
This project uses threads and semaphores to simulate the control of people accessing a park. 

## Main Class:
The "**Main Class**" creates three instances of the "Torno" class, which extends the Thread class. Each instance is created with a unique id number, 1, 2, and 3 respectively.

The "start()" method is then called on each of the instances, which starts their execution in their own separate threads. The start() method internally calls the run() method on the instance.

This means that all three instances are running simultaneously and independently, each simulating a turnstile, and incrementing the count of people in the park as people are entering.

It is **important to notice** that the ***order of execution is not guaranteed***, it depends on the scheduler.

## Parque Class:

The class "**Parque**" has a semaphore and keeps count of the number of people in the park. 

## Torno Class:

The class "**Torno**" extends the Thread class and simulates the access control turnstiles. 

In the main method, three instances of the "Torno" class are created and started. 

Each instance simulates a turnstile, and when a person enters the park, the count is incremented and displayed. 

**Note:**
The program simulates the entrance of 10 people for each turnstile.
