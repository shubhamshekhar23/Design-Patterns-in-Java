class Composite
{
    public static void main(String[] args)
	{	
        try
        {
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
        }
        catch(Exception e){
            System.out.println("whatsup");
        }
	}
}

/** When you want to keep the list of same type of objects inside the same object; using composition; you can also craete a directory class and storing all the 
 * objects there and calling getdetails() from there.
 */