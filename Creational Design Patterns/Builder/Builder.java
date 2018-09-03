class Builder
{
	public static void main(String[] args)
	{	
        try{
           CarBuilderPlan sedanbuilder1 = new SportsBuilder();
           Engineer E1 = new Engineer(sedanbuilder1);
           E1.constructCar();
           E1.getCarDetails();
            //  System.out.println("whatsup");
        }
        catch(Exception e){
            System.out.println("whatsup");
        }
	}
}