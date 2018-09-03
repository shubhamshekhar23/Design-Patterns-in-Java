public abstract class JumpBehaviour implements BehaviourPlan
{
    public void getDetails(){
        System.out.println("Jump Action");
    }

    public void action(){
        System.out.println("Jumping");
    }
}