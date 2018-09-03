public class AcOff implements CommandPlan
{
    AirCondition ms;
    AcOff(AirCondition ms)
    {
        this.ms = ms;
    }
    public void execute()
    {
        this.ms.powerOff();
    }
}