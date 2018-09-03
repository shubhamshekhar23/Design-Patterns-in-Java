public class Customer
{
    static int id=1;
    String name;
    Car car;
    int custId;

    Customer(String name, Car car)
    {
        this.name = name;
        this.custId = id;
        id++;
        this.car = car;
    }

    public void getDetails()
    {
        System.out.println(this.name + " with id "+ this.custId+ " is interested in car - "+ this.car.type);
    }
}