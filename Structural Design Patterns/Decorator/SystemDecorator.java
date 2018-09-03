abstract class SystemDecorator implements SystemPlan
{
    SystemPlan c1;

    SystemDecorator(SystemPlan c1)
    {
        this.c1 = c1;
    }

    public int getSystemCost() {
        return c1.getSystemCost();
    }
    public void getSystemDetails()
    {
        c1.getSystemDetails();
    }

}