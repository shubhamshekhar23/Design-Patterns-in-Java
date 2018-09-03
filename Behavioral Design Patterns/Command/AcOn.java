public class AcOn implements CommandPlan
{
    AirCondition ms;
    AcOn(AirCondition ms)
    {
        this.ms = ms;
    }
    public void execute()
    {
        this.ms.powerOn();
        this.ms.setTemperature();
        this.ms.start();
    }
}