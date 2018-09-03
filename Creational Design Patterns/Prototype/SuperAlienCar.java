class SuperAlienCar extends SuperCarPlan
{
    String planet;
    private String alienDriver = "jadoo"; // by default
    SuperAlienCar()
    {
        this.planet = DatabasePlanet.getPlanet(); // costly operation
    }

    public void setDriver(String name)
    {
        this.alienDriver = name;
    }

    public void getDetails()
    {
        System.out.println("driver name is " + this.alienDriver);
    }


}