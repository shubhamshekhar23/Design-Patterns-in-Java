class Main
{
    public static void main(String[] args)
	{	
        try
        {
            CarStatusPlan cs1 = CarProvider.getCarStatus("sports");
            cs1.setKmCovered(21);
            cs1.setMileage(30);
            cs1.getStatus();
        }
        catch(Exception e){
            System.out.println("whatsup");
        }
	}
}

/* After a car is purchased by a customer, he can get the details wghen shoudl he go for servicing; he can go online to teh website of the car
 and get the car object(carstatusobject) by specifying which type of car he has.; then he can set the kmcovered by the car and how much mileage 
 he is getting; then based on the internal formula of the system; tghe advide is returned;*/

 /*Now , ther are so many request for the same type of car like thousands; and we have to create carstausobject for all of them;
 this is not a good idea; thats why we cache the object created and then return that same object to the next customer if the type matches
 so in this way we only have 3 cars in the cache and there is nnno memory overload. */