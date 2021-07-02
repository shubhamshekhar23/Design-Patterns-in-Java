class Main
{
	public static void main(String[] args)
	{	
        try{
            mercedesfactory car1 = mercedesfactory.create(mercedesfactory.carType.SEDAN);
            car1.showme();
            mercedesfactory car2 = mercedesfactory.create(mercedesfactory.carType.LUXURYCAR);
            car2.showme();
            mercedesfactory car3 = mercedesfactory.create(mercedesfactory.carType.SPORTSCAR);
            car3.showme();
            mercedesfactory car4 = mercedesfactory.create(mercedesfactory.carType.SEDAN);
            car4.showme();
        }
        catch(Exception e){

        }
	}
}

// use static method to craete products in a factory, that will handle the switch case statementa ccording to the argument passed
// all produts will extend from the factory class
// client code should not be affected when we add a new cartype in our sysytem