class Template
{
    public static void main(String args[])
    {
       SportsCar l1 = new SportsCar("red");
       l1.constructCar();
    }
}

/*this example implements template method which says that implement a family of algorithm( or a set of functions) that will be implemented
in the abstract superclass i.e CarPlan that is constructing car which has separet steps like carbodyassemble, assembleengine etc.
and there are 3 disffern
types of car luxury , sedan etc. all of these 3 will have different ways of constructing car steps; so they will implement methods
different but constructing car alwya use those methods. so Use final keyword inside abstract superclass*/