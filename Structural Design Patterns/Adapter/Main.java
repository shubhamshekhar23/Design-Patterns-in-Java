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

/**A car has by default petrol system installed; we can craete new gas system and install in the car; we can setsystem() but it accepts only petrolsystem
 * interface; so we craete an adapter to convert gassystem to petrolsysytem and get the energy from there.
 */