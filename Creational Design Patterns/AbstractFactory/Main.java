class Main
{
	public static void main(String[] args)
	{	
        try{
            car car1 = myabstractfactory.createCar(myabstractfactory.cartype.SEDAN_USA);
            car1.getDetails();
            car car2 = myabstractfactory.createCar(myabstractfactory.cartype.SEDAN_USA);
            car2.getDetails();
            car car3 = myabstractfactory.createCar(myabstractfactory.cartype.SPORTSCAR_CHINA);
            car3.getDetails();
            car car4 = myabstractfactory.createCar(myabstractfactory.cartype.LUXURYCAR_INDIA);
            car4.getDetails();
            car car5 = myabstractfactory.createCar(myabstractfactory.cartype.LUXURYCAR_USA);
            car5.getDetails();
        }
        catch(Exception e){
            System.out.println("whatsup");
        }
	}
}

// what we want is the client to call only a single method and create car according to the modelid( say luxurycar_usa), which will have the information
// from where it will be manufactured; so the client doesnt have to worry about giving the location as a paramaeter; based on the model no. given we will
// identify wheree do we want this car to be manufauctured; so there is one single abstract factory which uses switch case statements and determine
// which factory will create which car