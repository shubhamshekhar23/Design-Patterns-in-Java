class Prototype {
    public static void main(String[] args) {
        try {
            SuperAlienCar S1 = new SuperAlienCar();
            S1.getDetails();
            System.out.println(S1);
            SuperAlienCar S2 = (SuperAlienCar) S1.getClone();
            S2.setDriver("ET");
            S2.getDetails();
            System.out.println(S2);
        } catch (Exception e) {
            System.out.println("whatsup");
        }
    }
}

// # its better to clone an object than to create a new object when some sopertaions in creating object is very costly like in this example to get the plane 
// name for each alienCar is very costly; so we use the data fetched when creating the first object , we clone it and we can set the new proeprties to it

// # we can also craete a new method craete clone that will use a different constructor and accepot arguments from the already created object properties
// like below( not using cloneable interface) :


/* public SuperAlienCar(String planetdata)
{
    this.planet = planetdata;
}

public createClone()
{
    return new SuperAlienCar(this.planet);
}*/