Observer - 

Description -
1. This design pattern is needed when we want to notify a list of objects when certain thing happens.

2. To achieve this, we store a list of objects that need to be notified in the main object and when required we iterate over the list and call a certain method on the object in the list.

3. In our example, At first we create a headquarter with one cartype; then showroom can be created independently, then they are added to the headquarter; As soon as they are added, they are populated with all the cartypes that are avaiable at that time in the headquarter; once a new cartype is added in the headquarter; all the added showrooms are notified.

4. gist - 

ch = new HeadQuarter("sedan");
ch.addShowRoom(showroom1); // this will notify showroom1 of sedan
ch.addCarType("sports"); // this notifies the showroom1 of sports


Problem Statement -
