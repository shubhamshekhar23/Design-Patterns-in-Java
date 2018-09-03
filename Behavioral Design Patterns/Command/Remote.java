public class Remote
{
    CommandPlan cp;

    public void setCommand(CommandPlan cp)
    {
        this.cp = cp;
    }

    public void buttonPressed()
    {
        this.cp.execute();
    }

}