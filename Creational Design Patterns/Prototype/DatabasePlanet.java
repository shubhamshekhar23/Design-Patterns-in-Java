class DatabasePlanet
{
    static String getPlanet() // a method that is very costly
    {   
        System.out.println("this operation took 1 minute");
        return "Mars";
    }
}