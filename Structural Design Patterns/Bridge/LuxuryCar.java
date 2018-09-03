public class LuxuryCar implements CarPlan
{
    ColorFinishPlan cf;

    LuxuryCar(ColorFinishPlan cf)
    {
        this.cf = cf;
    }

    public void paintCar()
    {
        this.cf.paint();
    }
}