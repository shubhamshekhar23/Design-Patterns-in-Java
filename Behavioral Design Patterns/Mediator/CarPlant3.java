public class CarPlant3 implements CarPlantPlan
{
    private String cartype;
    private int numOfCars;
    CarPlant3(String cartype, int numOfCars)
    {
        this.cartype = cartype;
        this.numOfCars = numOfCars;
    }
    public String getType()
    {
        return this.cartype;
    }
    public Boolean bookCar() {
        if(numOfCars > 8) // this plant ensures he has atleast 3 cars for emergency
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