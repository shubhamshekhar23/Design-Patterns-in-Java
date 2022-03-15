# Design-Patterns-in-Java 

## One Mega Problem Statement - "Setting Up of a Car Company"

All 23 Gang of four Design Patterns implemented in Java 

### *Whats So SPECIAL* : 
When I was preparing for interview, I could not find a single problem statement that will use all the design patterns. So, To revise all the design patterns in one go, I can just look at that one big problem statement and i'll be good to go.

So, I set out to create that Mega Problem and came up with "Setting Up of a Car Company".

All the patterns are implemented using one Mega problem statement i.e Setting up of a Car Company Which involves creating a Car factory in a city that has different models of cars; have showrooms in different cities; Headquarter somewhere; car manufacturing process and Hierarchy of Employee that has different job within the car company.

Following are the features in our problem statement :

### Behavioral Design Patterns - 

#### 1. CHAIN OF RESPONSIBILITY -  
In our new Car Artificial Intelligence software, there is a possibility of virus from other hackers.There are different levels of virus and based on that level, employees can solve or not solve it. So, we have a team of developers and there is a hierarchy of developers. So, when there is a virus found in the system, it is given to the engineer. If he can not solve it, then he will pass it to team lead; if team lead cant then he will pass it to technical officer;etc. .

#### 2. COMMAND - 
In our new Car, We want to provide user a remote with only one button ( Just for elegance ) that can be used to perform differnt tasks like lighton , play music and Controlling Air condition etc. All these commands can be performed on a single button press;

#### 3. INTERPRETER - 
In our car, We want to create a voice command system in which commands can be created and interpreted. e.g startcar, fuelcheck, autodrive etc. for these commands there are AND OR combination of commands like fuelcheck and doorclosed.

#### 4. ITERATOR - 
In our company, we want to maintain a list of customers and cars and we want to iterate through these lists and get the details.

#### 5. MEDIATOR - 
We have 3 car plants, one for each cartype(luxury, sedan and sports)that has their own condition of booking cars based on how many cars are in the stock; we have a mediator that is showroom that take the customer's request for booking and then requests the carplant based on the type of car requested; In this way showroom acts as a mediator and customer doesn't have to deal with the carplant directly

#### 6. MEMENTO - 
We have created  a software for our car, and we want to track different status of the software while it is undergoing changes, so that it can safely be restored to the previous version. (Just like GIT)

#### 7. OBSERVER - 
we have a Car headquarter and some showrooms. New showrooms can be created independently in different cities, and they can request the headquarter to add them as a franchise; as soon as they are added, they get all the info of the cartypes that are avaiable at that time in the headquarter; once a new cartype is added in the headquarter; all the added showrooms are notified 

#### 8. STATE - 
We have a car that can be started with any gear.When we accelerate to some speed, then gear checks the speed limit of which it can afford, then it displays the corresponding success or failure message

#### 9. STRATEGY - 
Description Coming Soon..

#### 10. TEMPLATE - 
Description Coming Soon..

#### 11. VISITOR - 
Description Coming Soon..

#### 12. others(coming soon) - 
Blackboard, Null object, Servant, Specification


### Creational Design Patterns - 

#### 1. ABSTRACT FACTORY -  
Description Coming Soon..

#### 2. BUILDER - 
Description Coming Soon..

#### 3. FACTORY - 
Description Coming Soon..

#### 4. PROTOTYPE - 
Description Coming Soon..

#### 5. SINGLETON - 
Our company will have a single headquarter.

#### 6. others(coming soon) - 
Dependency Injection, Lazy initialization, Multiton, Object pool, Resource acquisition is initialization (RAII)


### Structural Design Patterns - 

#### 1. ADAPTER -  
Description Coming Soon..

#### 2. BRIDGE - 
Description Coming Soon..

#### 3. COMPOSITE - 
Description Coming Soon..

#### 4. DECORATOR - 
Description Coming Soon..

#### 5. FACADE - 
Description Coming Soon..

#### 6. FLYWEIGHT - 
Description Coming Soon..

#### 7. PROXY - 
Description Coming Soon..

#### 8. others(coming soon) - 
Extension object, Front controller, Marker, Module, Twin

