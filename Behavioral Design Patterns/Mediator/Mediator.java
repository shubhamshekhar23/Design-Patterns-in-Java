class Mediator
{
    public static void main(String args[])
    {
        CarPlantPlan c1 = new CarPlant1("sportscar", 10);
        CarPlantPlan c2 = new CarPlant2("sedancar", 9);
        CarPlantPlan c3 = new CarPlant3("luxurycar", 6);

        ShowRoomMediator mdtr = new ShowRoomMediator();
        mdtr.addPlant(c1);
        mdtr.addPlant(c2);
        mdtr.addPlant(c3);

        Customer john = new Customer("John", mdtr);

        john.requestBooking("luxurycar");
    }
}

/* This has 3 car plants one for each cartype(luxury, sedan and sports)that has their own condition of booking cars based on how much car is in the stock; we have a mediator that is showroom that take the customer's request for booking and requests the carplant based on the type of car requested; in this way showroom acts aas a mediator and customer doesnt have to deal with the carplant directly */