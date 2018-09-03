public class CarPlant1 implements CarPlantPlan
{
    private String cartype;
    private int numOfCars;
    CarPlant1(String cartype, int numOfCars)
    {
        this.cartype = cartype;
        this.numOfCars = numOfCars;
    }
    public String getType()
    {
        return this.cartype;
    }
    public Boolean bookCar() {
        if(numOfCars >0)
        {
            this.numOfCars--;
            System.out.println("One car booked");
            return true;
        }else 
        {
            System.out.println("Sorry, Car out of Stock");
            return false;
        }
    }
}