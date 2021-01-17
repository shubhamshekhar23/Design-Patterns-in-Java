class Observer
{
    public static void main(String args[])
    {
        CarHeadquarter ch = new CarHeadquarter("sedan");
        ShowRoomPlan cp1 = new ShowRoom("Delhi");
        ShowRoomPlan cp2 = new ShowRoom("Bangalore");
        ShowRoomPlan cp3 = new ShowRoom("kolkata");
        ShowRoomPlan cp4 = new ShowRoom("Mumbai");

        ch.addShowRoom(cp1);
        ch.addShowRoom(cp2);
        ch.addShowRoom(cp3);
        ch.addShowRoom(cp4);

        ch.addCarType("sports");
    }
}


/* OUTPUT -

Delhi have been notified with sedan                                                                                                           
Bangalore have been notified with sedan                                                                                                       
kolkata have been notified with sedan                                                                                                         
Mumbai have been notified with sedan                                                                                                          
Delhi have been notified with sports                                                                                                          
Bangalore have been notified with sports                                                                                                      
kolkata have been notified with sports                                                                                                        
Mumbai have been notified with sports 

*/

/* This example has the functionality that at first we create a headquarter with atleast one cartype; then showroom can be created independently, then they can request the headquarter to add them; as soon as they are added, they are populated with all the cartypes that are avaiable at that time in the headquarter; once a new cartype is added in the headquarter; all the added showrooms are notified */