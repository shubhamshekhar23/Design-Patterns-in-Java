public class LightOff implements CommandPlan
{
    LightControl ms;
    LightOff(LightControl ms)
    {
        this.ms = ms;
    }
    public void execute()
    {
        this.ms.powerOff();
    }
}