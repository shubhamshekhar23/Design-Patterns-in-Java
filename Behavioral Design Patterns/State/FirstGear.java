public class FirstGear implements GearState
{
    public void setSpeed(int speed) {
        if(speed>50){
            System.out.println("Can not go Beyond 50Km/h; Change gear");
        }else{
            System.out.println("car is at Speed :" + speed);
        }
    }
}