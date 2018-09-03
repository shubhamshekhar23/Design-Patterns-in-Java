public class Car extends CarPlan
{
    private CarParts engine, carBody, electronics;
    public void setEngine(CarParts.cartype car){
        this.engine = new Engine(car);
    };    
    public void setCarBody(CarParts.cartype car){
        this.carBody = new CarBody(car);
    };    
    public void setElectronics(CarParts.cartype car){
        this.electronics = new Electronics(car);
    };
    public void getDetails()
    {
        System.out.println(this.engine.getName() + " " + this.carBody.getName()+ " " + this.electronics.getName() );
        // System.out.println("shubham" );
    }    
}

