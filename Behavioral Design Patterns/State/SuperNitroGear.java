public class SuperNitroGear implements GearState
{
    public void setSpeed(int speed) {
        if(speed>500){
            System.out.println("Car not go Beyond 500Km/h; This is not JetPlane man!!");
        }else{
            System.out.println("car is at Speed :" + speed);
        }
    }
}