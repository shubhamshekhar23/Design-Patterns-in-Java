class AutoPilot extends SystemDecorator
{
    AutoPilot(SystemPlan c1)
    {
        super(c1);
    }

    public int getSystemCost() {
        return 75 + this.c1.getSystemCost();
    }
    public void getSystemDetails()
    {
        this.c1.getSystemDetails();
        System.out.println("Auto Pilot System");
    }

}