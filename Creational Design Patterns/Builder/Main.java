class Main
{
	public static void main(String[] args)
	{	
        try{
            /* when building sedan  */
           CarBuilderPlan sedanbuilder1 = new SedanBuilder();
           Engineer E1 = new Engineer(sedanbuilder1);
           E1.constructCar();
           E1.getCarDetails();

            /* when building Soprts  */
           CarBuilderPlan sportsBuilder1 = new SportsBuilder();
           Engineer E2 = new Engineer(sportsBuilder1);
           E2.constructCar();
           E2.getCarDetails();

            /* when building Luxury  */
           CarBuilderPlan luxuryBuilder1 = new LuxuryBuilder();
           Engineer E3 = new Engineer(luxuryBuilder1);
           E3.constructCar();
           E3.getCarDetails();
        }
        catch(Exception e){
            System.out.println("whatsup");
        }
	}
}

/* 
   1.  We have main classes as Car, Carplan, and carParts that are necessary to build cars of type sedan, sports and luxury. Car creation is a complicated process and its done by step by step, by building engine, carbody , electrnoics etc. So, We use a builder and we expose the builder to client so that he doesnt have to deal with the nuances of the complication. Thas where we create the Carbuilderplan and sedanbuilder, luxurybuilder and sportsbuilder. Engineer uses this builder to create cars.
   2. Even if , we want to expose one method inside carBuilderPlan buildWholeCar() that will run all the steps inside constructCar() by engineer, we can do it also. But, its better to expose, each steps as we might not need to run all of them according to requirements.
*/