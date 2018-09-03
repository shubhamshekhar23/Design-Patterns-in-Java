class Decorator
{
    public static void main(String[] args)
	{	
        try
        {
            SystemPlan c1 = new NitroBoost(new SecuritySystem(new AutoPilot(new CarSystem())));
            System.out.println("Total cost of the system is " + c1.getSystemCost());
            c1.getSystemDetails();
            SystemPlan b1 = new NitroBoost(new SecuritySystem(new AutoPilot(new BikeSystem())));
            System.out.println("Total cost of the system is " + b1.getSystemCost());
            b1.getSystemDetails();
        }
        catch(Exception e){
            System.out.println("whatsup");
        }
	}
}

/*This pattern is used when you have a lot of inherited objects of different types; in this example if we had not used decorator, then we will 
 have to create 3 separate carsystem e.g nitro system, security seystem etc. if we had bus system and bike system also then there would be 
 9 subclasses*/