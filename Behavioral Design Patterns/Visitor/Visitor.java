class Visitor
{
    public static void main(String args[])
    {
       CarPlan c = new LuxuryCar("shubham");
       CarPriceVisitor cv = new CarPriceVisitor();
       c.getPrice(cv);

       CarPlan j = new SedanCar("Shekhar Suman");
       j.getPrice(cv);
    }
}

/* this eample has defined classes for sedan, posrts and luxury car; these are supposed already finisghed; now we want to add a new method to these class
we dont have any choice but to make modification inside the class; but due to open closed principle, we will create a new class visitor that will implement
the method requitred by these classes that is getprice() which  calls the metod of the visistor that will implement method for different cars
basesed on the input this. */