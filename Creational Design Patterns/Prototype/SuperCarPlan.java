public abstract class SuperCarPlan implements Cloneable 
{
    public Object getClone()
    {
        Object car = null;
        try{
            car = super.clone();
        }
        catch (CloneNotSupportedException e) 
        {
            e.printStackTrace();
        }
        return car;
    }
}