public class Car
{
    PetrolSystemPlan p1;
    public Car()
    {
        this.p1 = new PetrolSystem();
    }

    public void setSystem(PetrolSystemPlan p1)
    {
        this.p1 = p1;
    }

    public void startCar(){
        this.p1.providePetrolEnergy();
        System.out.println("Car started successfully");
    }
}