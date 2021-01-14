Mediator - 

Description -
1. This design pattern is needed when we don't want to expose one functionality to end user. that's why we craete one mediator that interacts with the end user and finally communicates with the main system

2. In our example, we have 3 car types - luxury, sedan, sports. All 3 car tyypes have their separate car plants. Each car plant can book the car if they have the cars in the stock.

3. In our case, showroom acts as a mediator, that creates one customer object that is unique to each showroom and then take the request and internally go through all the car plants and match the car type that was requested and book it.

4. gist - 

c1 = new CarPlant1("sportscar", 10);
mdtr = new ShowRoomMediator();
mdtr.addPlant(c1);
john = new Customer("John", mdtr); // customer is associated with one particular showroom
john.requestBooking("sportscar");


Problem Statement -
