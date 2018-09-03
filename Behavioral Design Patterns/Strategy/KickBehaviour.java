public abstract class KickBehaviour implements BehaviourPlan
{
    public void getDetails(){
        System.out.println("Kick Action");
    }

    public void action(){
        System.out.println("Kicking");
    }
}