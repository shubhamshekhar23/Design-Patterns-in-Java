public class LightOn implements CommandPlan
{
    LightControl ms;
    LightOn(LightControl ms)
    {
        this.ms = ms;
    }
    public void execute()
    {
        this.ms.powerOn();
    }
}