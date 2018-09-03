public class Customer
{
    String name;
    ShowRoomMediator mdtr;
    Customer(String name, ShowRoomMediator mdtr){
        this.name = name;
        this.mdtr = mdtr;
    }
    public void requestBooking(String cartype)
    {
        this.mdtr.request(cartype);
    }
}