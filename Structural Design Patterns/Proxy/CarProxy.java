public class CarProxy implements CarPlan
{
    Driver driver=null;
    Car car;

    CarProxy(){
        this.car = new Car();
    }

    public void driveCar()
    {
        if(this.driver == null){
            System.out.println("Error : Car needs a driver");
        }
        else if(this.driver.age<18){
            System.out.println("Error : Drivers age must be graeter than 18");
        }else{
            this.car.driveCar();
        }
    }

    public void setDriver(Driver d)
    {
        this.driver = d;
    }
}