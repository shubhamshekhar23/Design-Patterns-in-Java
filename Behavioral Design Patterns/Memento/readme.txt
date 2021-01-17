Memento - 

Description -
1. This design pattern is needed when we want to save the state of a continuously changing system. We save the state in a list and then use this list to restore the system to a previous state.

2. This has 3 parts - 
Originator - this is our main system that is undergoing changes (CarSoftwareStatus), it can create memento
Memento - That stores the state of system at specific point (CarSoftwareMemento)
CareTaker - That stores the list of memento and provides it as required (SoftwareCareTaker)

3. While craeting memento, we can create a completely new originator using the field values we have at that time.

4. gist - 

originator = new Originator();
careTaker = new CareTaker();
careTaker.add(originator.createMemento());
originator.setStatusFromMemento(careTaker.getMemento(index))


Problem Statement -
