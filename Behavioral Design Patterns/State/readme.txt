State - 

Description -
1. This design pattern is needed when we want to change our behaviour of system based on the internal state. We can set the state of the system by providing our state object and that will govern the behaviour.

2. In our example, gears our different states and accelerate is our behavuiour of the system. We can change the state by changing gear of the car and then we can accelerate the car. Gear will govern the accelerate behaviour.

3. To achieve this, we craete a car which can store the gear instance and expose one method that can change it. It has an accelerate method, that internally uses the current gear and set the speed of the car.

4. gist - 

common e.g.

state1 = new State();
system1 = new System();
system1.setState(state1);
system1.doSth(); // it internally uses the state1's intelligence.

car e.g

gear1 = new Gear();
car1 = new Car();
car1.changeGear(gear1);
car1.accelerate(45); // gear1 will decide if it can accelerate upto this speed or not


Problem Statement -
