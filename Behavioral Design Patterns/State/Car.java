public class Car
{
    GearState gear = null;

    Car(){
        this.gear = new NeutralGear();
    }

    public void start(GearState gs){
        this.gear = gs;
    }

    public void changeGear(GearState gs){
        this.gear = gs;
    }

    public void accelerate(int speed){
        this.gear.setSpeed(speed);
    }
}