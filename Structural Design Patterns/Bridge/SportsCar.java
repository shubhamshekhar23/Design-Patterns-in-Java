public class SportsCar implements CarPlan
{
    ColorFinishPlan cf;

    SportsCar(ColorFinishPlan cf)
    {
        this.cf = cf;
    }

    public void paintCar()
    {
        this.cf.paint();
    }
}