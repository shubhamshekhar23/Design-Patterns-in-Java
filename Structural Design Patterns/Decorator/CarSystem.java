public class CarSystem implements SystemPlan
{
    int cost;
    CarSystem()
    {
        this.cost = 250;
    }
    public int getSystemCost() {
        return this.cost;
    }

    public void getSystemDetails() {
        System.out.println("Basic Default system of the Car");
    }
}