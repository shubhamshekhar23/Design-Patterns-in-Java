public abstract class RollBehaviour implements BehaviourPlan
{
    public void getDetails(){
        System.out.println("Roll Action");
    }

    public void action(){
        System.out.println("Rolling");
    }
}