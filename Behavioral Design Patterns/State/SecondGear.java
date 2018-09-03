public class SecondGear implements GearState
{
    public void setSpeed(int speed) {
        if(speed>200){
            System.out.println("Car not go Beyond 200Km/h; Try Nitro Boost to go superfast");
        }else{
            System.out.println("car is at Speed :" + speed);
        }
    }
}