public class Car
{
    public String type;
    static int id=1;
    public int carId;

    Car(String type)
    {
        this.type = type;
        this.carId = id;
        id++;
    }

    public void getDetails()
    {
        System.out.println("Car type : "+this.type+ " having id: "+this.carId);
    }
}