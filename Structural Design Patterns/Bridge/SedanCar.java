public class SedanCar implements CarPlan
{
    ColorFinishPlan cf;

    SedanCar(ColorFinishPlan cf)
    {
        this.cf = cf;
    }

    public void paintCar()
    {
        this.cf.paint();
    }
}