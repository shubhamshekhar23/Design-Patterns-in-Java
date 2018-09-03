public class NeutralGear implements GearState
{
    public void setSpeed(int speed) {
        if(speed>0){
            System.out.println("The Car is in neutral state; Try changing gear");
        }
    }
}