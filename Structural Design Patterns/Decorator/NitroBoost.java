class NitroBoost extends SystemDecorator
{
    NitroBoost(SystemPlan c1)
    {
        super(c1);
    }

    public int getSystemCost() {
        return 25 + this.c1.getSystemCost();
    }
    public void getSystemDetails()
    {
        this.c1.getSystemDetails();
        System.out.println("Nitro Boost System");
    }

}