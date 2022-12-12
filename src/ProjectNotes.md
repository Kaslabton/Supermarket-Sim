## Project Notes

### Project Summary

Simulate supermarket where customer enter
according to some random interval, stop for a random interval of time,
check out for a random interval of time

### Clases

* Customer (Threaded)
* CustomerFactory
* Cashiers (Threaded)
  * This needs to be written

### Data Structures

* ArrayList of Customers
* Queue to hold Customers as they wait for checkout
  * Use a ConcurrentLinkedQueue, which is Thread safe

### Key Terms

* Thread - A piece code, a class, on object, etc. that runs its own processor thread.
* Serializable - a function or data structure that is Thread safe
  * it locks access and unlocks access as different  threads interact with it.]

### End Result

* Run simulation for a given number of ms
* A list of stats
  * Total customers
  * Total number of Cashiers used
  * Average shop time per customer
  * Average process time per customer
  * Average wait time in the Queue per customer
    * Not implemented
    * We need to add time-stamps to Customer when they
      * Enter the Queue
      * Exit the Queue
  * Average down-time per Cashier (Stretch goal)