class Iterator
{
    public static void main(String args[])
    {
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
}

/* Iterator pattern is use when we have a list of a particular object like an array of same type of objects and we want to give a functionality of
iterating through the objects in a similar way for all type of list of objects; so we implement a iteratorplan and collectionplan that provides an
iterator that has similar functionality for every lius of objects
 */