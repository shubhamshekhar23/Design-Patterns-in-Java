class sedan extends mercedesfactory
{
    static int globalid = 0;
    int carId;
    public sedan(){
        globalid++;
        this.carId = globalid;
    }

    public void showme()
    {
        System.out.println("I am sedan car with id " + this.carId);
    }
}

class sportscar extends mercedesfactory
{
    static int globalid = 0;
    int carId;
    sportscar(){
        globalid++;
        this.carId = globalid;
    }

    void showme()
    {
        System.out.println("I am sports car with id " + this.carId);
    }
}

class luxurycar extends mercedesfactory
{
    static int globalid = 0;
    int carId;
    luxurycar(){
        globalid++;
        this.carId = globalid;
    }

    void showme()
    {
        System.out.println("I am luxury car with id " + this.carId);
    }
}