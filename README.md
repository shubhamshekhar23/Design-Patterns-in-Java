# Design-Patterns-in-Typescript

## One Mega Problem Statement - "Setting Up of a Car Company"

All 23 Gang of four Design Patterns implemented in Java

### _Whats So SPECIAL_:

It provides a single big problem statement consists of multiple small related staements that will use all the design patterns. So, It gets easier to link all the design patterns and create blueprint of all the design patterns.

All the patterns are implemented using one Mega problem statement i.e Setting up of a Car Company Which involves creating a Car factory in a city that has different models of cars; have showrooms in different cities; Headquarter somewhere; car manufacturing process and Hierarchy of Employee that has different job within the car company.

All the patterns are implemented using one Mega problem statement i.e Setting up of a Car Company Which involves creating a Car factory in a city that has different models of cars; have showrooms in different cities; Headquarter somewhere; car manufacturing process and Hierarchy of Employee that has different job within the car company.

Following are the features in our problem statement :

---

### Behavioral Design Patterns -

---

#### 1. CHAIN OF RESPONSIBILITY -

In our new Car Artificial Intelligence software, there is a possibility of virus from other hackers.There are different levels of virus and based on that level, employees can solve or not solve it. So, we have a team of developers and there is a hierarchy of developers. So, when there is a virus found in the system, it is given to the engineer. If he can not solve it, then he will pass it to team lead; if team lead cant then he will pass it to technical officer;etc. .

```
    /* Creating a new virus instance and set the severity level just to test */
    CarAiVirus virus = new CarAiVirus(1);

    /* Creating testers instance */
    Engineer e1 = new Engineer();
    TeamLead t1 = new TeamLead();
    TechnicalOfficer ct1 = new TechnicalOfficer();
    Expert ee = new Expert();

    /* Set the hierarchy by using ofr each one by passing the instance of upper level tester */
    e1.setNextDebugger(t1);
    t1.setNextDebugger(ct1);
    ct1.setNextDebugger(ee);

    /* Give the virus to the lowest level tester */
    e1.debug(virus);

```

#### 2. COMMAND -

In our new Car, We want to provide user a remote with only one button ( Just for elegance ) that can be used to perform differnt tasks like lighton , play music and Controlling Air condition etc. All these commands can be performed on a single button press;

```
    /* Setting up of system */
    Remote r = new Remote();
    MusicSystem ms = new MusicSystem();
    AirCondition ac = new AirCondition();
    LightControl lc = new LightControl();

    /* setting up instance of all the command that has to perform and pass the system instance */
    CommandPlan musicplay = new MusicPlay(ms);
    CommandPlan lightOn = new LightOn(lc);
    CommandPlan lightOff = new LightOff(lc);
    CommandPlan acon = new AcOn(ac);
    CommandPlan acoff = new AcOff(ac);


    /* Everytime we want to change the tash that remote has to perform, we use setCommand and pass the commandInstance */
    r.setCommand(musicplay);
    r.buttonPressed();

    r.setCommand(lightOn);
    r.buttonPressed();
    r.setCommand(lightOff);
    r.buttonPressed();

    r.setCommand(acon);
    r.buttonPressed();
    r.setCommand(acoff);
    r.buttonPressed();

```

#### 3. INTERPRETER -

In our car, We want to create a voice command system in which commands can be created and interpreted. e.g startcar, fuelcheck, autodrive etc. for these commands there are AND OR combination of commands like fuelcheck and doorclosed.

```
    // setting up the voice command sysytem
    VoiceInputPlan v1 = new VoiceInput("drive");
    VoiceInputPlan v2 = new VoiceInput("startCar");
    OrVoice driveCommand = new OrVoice(v1, v2);

    driveCommand.interpret("driveCar");
    driveCommand.interpret("startCar");

    VoiceInputPlan v3 = new VoiceInput("fuelcheck");
    VoiceInputPlan v4 = new VoiceInput("doorclosed");
    AndVoice securityCommand = new AndVoice(v3, v4);

    securityCommand.interpret("fuelcheck, doorclosed");
    securityCommand.interpret("fuel, door");
```

#### 4. ITERATOR -

In our company, we want to maintain a list of customers and cars and we want to iterate through these lists and get the details.

```
    Car c1= new Car("sedan");
    Car c2= new Car("sports");
    Car c3= new Car("luxury");
    Car c4= new Car("super");
    Car c5= new Car("alien");
    Car c6= new Car("intelligent");

    CarList cl = new CarList(13);
    cl.add(c1);
    cl.add(c2);
    cl.add(c3);
    cl.add(c4);
    cl.add(c5);
    cl.add(c6);


    Customer p1 = new Customer("skhbd", c1);
    Customer p2 = new Customer("skjd", c2);
    Customer p3 = new Customer("weqt", c3);
    Customer p4 = new Customer("vbnvbn",c4);
    Customer p5 = new Customer("ukk", c5);
    Customer p6 = new Customer("eryreye", c6);

    CustomerList pl = new CustomerList(12);
    pl.add(p1);
    pl.add(p2);
    pl.add(p3);
    pl.add(p4);
    pl.add(p5);
    pl.add(p6);


    // Above code is only data population

    IteratorPlan custit = pl.getIterator();
    while(custit.hasNext()){
        Customer c = (Customer)custit.next();
        c.getDetails();
    }

    IteratorPlan carit = cl.getIterator();
    while(carit.hasNext()){
        Car c = (Car)carit.next();
        c.getDetails();
    }
}

```

#### 5. MEDIATOR -

We have 3 car plants, one for each cartype(luxury, sedan and sports)that has their own condition of booking cars based on how many cars are in the stock; we have a mediator that is showroom that take the customer's request for booking and then requests the carplant based on the type of car requested; In this way showroom acts as a mediator and customer doesn't have to deal with the carplant directly

```
    CarPlantPlan c1 = new CarPlant1("sportscar", 10);
    CarPlantPlan c2 = new CarPlant2("sedancar", 9);
    CarPlantPlan c3 = new CarPlant3("luxurycar", 6);

    ShowRoomMediator mdtr = new ShowRoomMediator();
    mdtr.addPlant(c1);
    mdtr.addPlant(c2);
    mdtr.addPlant(c3);

    Customer john = new Customer("John", mdtr);

    john.requestBooking("luxurycar");

```

#### 6. MEMENTO -

We have created a software for our car, and we want to track different status of the software while it is undergoing changes, so that it can safely be restored to the previous version. (Just like GIT)

```
    CarSoftwareStatus css1 = new CarSoftwareStatus("change1", "correction1");

    SoftwareCareTaker sct = new SoftwareCareTaker();
    
    sct.add(css1.createMemento());
    css1.setCorrection("correct2");
    sct.add(css1.createMemento());
    css1.setNewChange("change2");
    sct.add(css1.createMemento());

    css1.setStatusFromMemento(sct.getMemento(0));
    css1.getDetails();
    
    css1.setStatusFromMemento(sct.getMemento(1));
    css1.getDetails();
    
    css1.setStatusFromMemento(sct.getMemento(2));
    css1.getDetails();

```

#### 7. OBSERVER -

we have a Car headquarter and some showrooms. New showrooms can be created independently in different cities, and they can request the headquarter to add them as a franchise; as soon as they are added, they get all the info of the cartypes that are avaiable at that time in the headquarter; once a new cartype is added in the headquarter; all the added showrooms are notified

```
    CarHeadquarter ch = new CarHeadquarter("sedan");
    ShowRoomPlan cp1 = new ShowRoom("Delhi");
    ShowRoomPlan cp2 = new ShowRoom("Bangalore");
    ShowRoomPlan cp3 = new ShowRoom("kolkata");
    ShowRoomPlan cp4 = new ShowRoom("Mumbai");

    ch.addShowRoom(cp1);
    ch.addShowRoom(cp2);
    ch.addShowRoom(cp3);
    ch.addShowRoom(cp4);

    ch.addCarType("sports");

```

#### 8. STATE -

We have a car that can be started with any gear.When we accelerate to some speed, then gear checks the speed limit of which it can afford, then it displays the corresponding success or failure message

```

    GearState g0 = new NeutralGear();
    GearState g1 = new FirstGear();
    GearState g2 = new SecondGear();
    GearState g3 = new SuperNitroGear();

    Car c = new Car();
    
    c.start(g0);
    c.accelerate(20);
    c.changeGear(g1);
    c.accelerate(20);
    c.changeGear(g2);
    c.accelerate(250);
    c.changeGear(g3);
    c.accelerate(501);

```

#### 9. STRATEGY -

We have a special transofrmer Car that can perform 3 actions kick,jump and roll; each action has 2 types basic and super; We should be able to change the behavior of the actions at runTime for the transofrmer and accordingly its performAction should be run.

```
    Transformer t = new Transformer();
    t.setJump(new SuperJump());
    t.setKick(new SuperKick());
    t.performAction();

```

#### 10. TEMPLATE -

Constructing car has separate steps like carbodyassemble, assembleengine etc.
and there are 3 different types of car luxury , sedan etc. All of these 3 will have different ways of constructing car steps; so they will implement methods differently but constructing car always use the basic methods

```
    SportsCar l1 = new SportsCar("red");
    l1.constructCar();

```

#### 11. VISITOR -

We have 3 cars sedan, luxury and sportsCar. Each one has proper defined getPrice functions. Now, we have to make changes in that function(addding some extra broker fee), Following open-closed principle, we dont want to make changes in each classes. So, we craete a visitor class.

```
    CarPlan c = new LuxuryCar("shubham");
    CarPriceVisitor cv = new CarPriceVisitor();
    c.getPrice(cv);

    CarPlan j = new SedanCar("Shekhar Suman");
    j.getPrice(cv);

```

#### 12. others(coming soon) -

Blackboard, Null object, Servant, Specification

---

### Creational Design Patterns -

---

#### 1. ABSTRACT FACTORY -

We want to expose only one simple functionality to manufacture a Car to the client and don't want client to worry abut how and where (USA, China, India) that Car is manufactured. Based on the Car Type, A Class (That is abstract factory), will internally decide how and which class too call.

```
    car car1 = myabstractfactory.createCar(myabstractfactory.cartype.SEDAN_USA);
    car1.getDetails();
    car car2 = myabstractfactory.createCar(myabstractfactory.cartype.SEDAN_USA);
    car2.getDetails();
    car car3 = myabstractfactory.createCar(myabstractfactory.cartype.SPORTSCAR_CHINA);
    car3.getDetails();
    car car4 = myabstractfactory.createCar(myabstractfactory.cartype.LUXURYCAR_INDIA);
    car4.getDetails();
    car car5 = myabstractfactory.createCar(myabstractfactory.cartype.LUXURYCAR_USA);
    car5.getDetails();

```

#### 2. BUILDER -

We have 3 cars type - Luxury, Sedan and Sports. They all have different process of building cars(e.g building engine, carbody , electrnoics etc). Car creation is a complicated process and its done by step by step. So, We use a builder and we expose the builder to client so that he doesnt have to deal with the nuances of the complication. Engineer uses this builder to create cars.

```
    /* when building sedan  */
    CarBuilderPlan sedanbuilder1 = new SedanBuilder();
    Engineer E1 = new Engineer(sedanbuilder1);
    E1.constructCar();
    E1.getCarDetails();

    /* when building Soprts  */
    CarBuilderPlan sportsBuilder1 = new SportsBuilder();
    Engineer E2 = new Engineer(sportsBuilder1);
    E2.constructCar();
    E2.getCarDetails();

    /* when building Luxury  */
    CarBuilderPlan luxuryBuilder1 = new LuxuryBuilder();
    Engineer E3 = new Engineer(luxuryBuilder1);
    E3.constructCar();
    E3.getCarDetails();

```

#### 3. FACTORY -

We have 3 main car types- Luxury, sedan and sports car. To Manufacture these cars, one factory is provided and CLient can provide the car type and Factory takes care of manufacturing Car.

```
    mercedesfactory car1 = mercedesfactory.create(mercedesfactory.carType.SEDAN);
    car1.showme();
    mercedesfactory car2 = mercedesfactory.create(mercedesfactory.carType.LUXURYCAR);
    car2.showme();
    mercedesfactory car3 = mercedesfactory.create(mercedesfactory.carType.SPORTSCAR);
    car3.showme();
    mercedesfactory car4 = mercedesfactory.create(mercedesfactory.carType.SEDAN);
    car4.showme();

```

#### 4. PROTOTYPE -

We have a superAlienCar that is manufactured on the Mars.(Yes we have colonised Mars !). Now just to manufacture a Car, we need to get the planetName from a Datbase, That is an expensive operation. So, We want to manufacture a Car and then want to clone that car, so that expensive operation doesn't run again. Here, we use prototype pattern.

```
    SuperAlienCar S1 = new SuperAlienCar();
    S1.getDetails();
    System.out.println(S1);
    SuperAlienCar S2 = (SuperAlienCar) S1.getClone();
    S2.setDriver("ET");
    S2.getDetails();
    System.out.println(S2);

```

#### 5. SINGLETON -

Our company will have a single headquarter that is only once created. After that we can only get access to that headquarter and can not be changed.

```
    mercedesHeadQuarter hQ =  HeadQuarterCreator.createMyheadQuarter("MercedesHq");
    System.out.println( hQ);
    mercedesHeadQuarter hQ2 =  HeadQuarterCreator.createMyheadQuarter("MercedesHq2");
    System.out.println( hQ2);  

```

#### 6. others(coming soon) -

Dependency Injection, Lazy initialization, Multiton, Object pool, Resource acquisition is initialization (RAII)

---

### Structural Design Patterns -

---

#### 1. ADAPTER -

Our car has by default petrol system installed. Now, after launching our car in the market, a significant number of users are requesting to install a Gas system as well. So, to achieve this in existing system, we create a PetrolSystemAdapter and set this to the Car.

```
    Car c1 = new Car();
    c1.startCar();
    GasSystemPlan g1 = new GasSystem();
    PetrolSystemAdapter pg1 = new PetrolSystemAdapter(g1);
    c1.setSystem(pg1);
    c1.startCar();

```

#### 2. BRIDGE -

We have different car types and we want provide a functionality of painting cars in different color schemes. We want color schemes to vary independently of the cars so that they are not dependent on each other.

```
    CarPlan sc1 = new SportsCar(new RedFinish());
    sc1.paintCar();
    CarPlan lc1 = new LuxuryCar(new GreenFinish());
    lc1.paintCar();

```

#### 3. COMPOSITE -

We have different employees in our car company that can have subordinates( which are other employees). e.g director has subordinates leadManager. LeadManager can have sedanManager, SportsManager, luxuryManager etc.

```
    Employee director = new Employee("john", "Director", 1200);
    Employee leadmanager = new Employee("Kate", "Manager", 1000);
    Employee sportsmanager = new Employee("robert", "Sports Manager", 900);
    Employee sedanmanager = new Employee("ludo", "Sedan Manager", 900);
    Employee luxurymanager = new Employee("kevin", "Luxury Manager", 900);
    Employee engineer1 = new Employee("tom", "car Engineer", 700);
    Employee engineer2 = new Employee("leonard", "car engineer", 700);
    Employee worker1 = new Employee("mike", "worker", 500);
    Employee worker2 = new Employee("steve", "worker", 500);

    director.add(leadmanager);

    leadmanager.add(sportsmanager);
    leadmanager.add(sedanmanager);
    leadmanager.add(luxurymanager);

    sportsmanager.add(engineer1);
    sedanmanager.add(engineer2);

    engineer1.add(worker1);
    engineer2.add(worker2);

    sportsmanager.showSubordinatesDetails();

```

#### 4. DECORATOR -

We have a Car and while manufacturing it , we want to add different functionality to it like NitroSystem, Security System, Auto Pilot system etc.Order of the addition of functionality doesnt matter.

```
    SystemPlan c1 = new NitroBoost(new SecuritySystem(new AutoPilot(new CarSystem())));
    System.out.println("Total cost of the system is " + c1.getSystemCost());
    c1.getSystemDetails();
    SystemPlan b1 = new NitroBoost(new SecuritySystem(new AutoPilot(new BikeSystem())));
    System.out.println("Total cost of the system is " + b1.getSystemCost());
    b1.getSystemDetails();

```

#### 5. FACADE -

We want to expose a functionality of putting Car on autoPilot. But for autoPilot to work, there are some steps that has to be done like mapOn, EngineOn, AI on, guiding Voice on etc. All these steps are done by Facade and is hidden from client.

```
    AutoPilot ap = new AutoPilot();
    ap.start();
```

#### 6. FLYWEIGHT -

After a car is purchased by a customer, he can get the details when shoudl he go for servicing; he can go to website of the company
and specify which type of car he has; then he can set the kmcovered by the car and how much mileage
he is getting; then based on the internal formula of the system; the advice is returned;

Now , ther are so many request for the same type of car like thousands; and we have to create carstausobject for all of them;
this is not a good idea; thats why we cache the object created and then return that same object to the next customer if the type matches
so in this way we only have 3 cars in the cache and there is no memory overload.

```
    CarStatusPlan cs1 = CarProvider.getCarStatus("sports");
    cs1.setKmCovered(21);
    cs1.setMileage(30);
    cs1.getStatus();
```

#### 7. PROXY -

We have a car system class that has a method driveCar. But, If the driver is age below 18, then car should not drive. We dont want to put this check on theis car Class. Instead, we will create a CarProxy class that is exposed to the client , that will do the check and take decision.

```
    Driver d = new Driver(26, "shubham");
    CarProxy c = new CarProxy();
    c.setDriver(d);
    c.driveCar();

```

#### 8. others(coming soon) -

Extension object, Front controller, Marker, Module, Twin
