public class CarBuilderPlan {
    public Car car;
    public void buildCarBody(){};
    public void buildEngine(){};
    public void buildElectronics(){};
    public Car getCar(){return this.car;};
    public void getCarDetails(){this.car.getDetails();};
}