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

/* this has 3 car plants one for each cartyepe(luxiury, sedan and sports)that has their own codintionof boioking caars based on how much cart is in the stock; we have a meditor
that is sjowroom that take sthe custoemr srequest for bookig and requests the carplant based on the type of car requested; in this way
showroom acts aas a mediator and customer doesnt have to deal with the carplant directly */