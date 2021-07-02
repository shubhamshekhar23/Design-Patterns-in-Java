class Main
{
	public static void main(String[] args)
	{	
        try
        {
            Car c1 = new Car();
            c1.startCar();
            GasSystemPlan g1 = new GasSystem();
            PetrolSystemAdapter pg1 = new PetrolSystemAdapter(g1);
            c1.setSystem(pg1);
            c1.startCar();

        }
        catch(Exception e){
            System.out.println("whatsup");
        }
	}
}

/*
    A car has by default petrol system installed; Now we have a new requirement of using gas system and install in the car;
    To Accomodate this feature we can mmake use of setsystem() in Car class but it accepts only petrolsystem
    interface; so we craete an adapter that will implment petrolSystem interface and internally will make use of gasSystem instance.
*/