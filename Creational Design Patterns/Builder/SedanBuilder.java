public class SedanBuilder extends CarBuilderPlan
{
    private CarParts.cartype cartype = CarParts.cartype.SEDAN; 
    SedanBuilder()
    {
        this.car = new Car();
        System.out.println("sead built");
    };
    public void buildCarBody()
    {
        System.out.println("whatsup");
        this.car.setCarBody(this.cartype);
    };
    public void buildEngine(){
        this.car.setEngine(this.cartype);
    };
    public void buildElectronics(){
        this.car.setElectronics(this.cartype);
    };
}

class SportsBuilder extends CarBuilderPlan
{
    private CarParts.cartype cartype = CarParts.cartype.SPORTS; 
    SportsBuilder()
    {
        this.car = new Car();
    }
    public void buildCarBody()
    {
        this.car.setCarBody(this.cartype);
    };
    public void buildEngine(){
        this.car.setEngine(this.cartype);
    };
    public void buildElectronics(){
        this.car.setElectronics(this.cartype);
    };
}


class LuxuryBuilder extends CarBuilderPlan
{
    private CarParts.cartype cartype = CarParts.cartype.LUXURY; 
    LuxuryBuilder()
    {
        this.car = new Car();
    }
    public void buildCarBody()
    {
        this.car.setCarBody(this.cartype);
    };
    public void buildEngine(){
        this.car.setEngine(this.cartype);
    };
    public void buildElectronics(){
        this.car.setElectronics(this.cartype);
    };
}

