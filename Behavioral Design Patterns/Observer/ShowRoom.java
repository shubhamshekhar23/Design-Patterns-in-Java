import java.util.ArrayList;
import java.util.List;

public class ShowRoom implements ShowRoomPlan
{
    List<String> cartypes;
    String name;

    ShowRoom(String name){
        this.name = name;
        this.cartypes = new ArrayList<String>();
    }

    public void receive(String ct) {
        this.cartypes.add(ct);
        System.out.println(this.name + " have been notified with " + ct);
    }

}