public class CarPlant2 implements CarPlantPlan
{
    private String cartype;
    private int numOfCars;
    CarPlant2(String cartype, int numOfCars)
    {
        this.cartype = cartype;
        this.numOfCars = numOfCars;
    }
    public String getType()
    {
        return this.cartype;
    }
    public Boolean bookCar() {
        if(numOfCars >5) // this plant ensures he has atleast 5 cars for emergency
        {
            this.numOfCars--;
            System.out.println("One " + this.cartype + " car booked");
            return true;
        }else 
        {
            System.out.println("Sorry, Car out of Stock");
            return false;
        }
    }
}