import java.util.ArrayList;
import java.util.List;

public class CarHeadquarter {
    List<String> cartypes;
    List<ShowRoomPlan> showrooms;

    CarHeadquarter(String ct) {
        this.cartypes = new ArrayList<String>();
        this.showrooms = new ArrayList<ShowRoomPlan>();
        this.cartypes.add(ct);
    }

    public void addCarType(String ct) {
        this.cartypes.add(ct);
        this.sendMessageToAll(ct);
    }

    public void sendMessageToAll(String ct) {
        this.showrooms.forEach((show) -> {
            show.receive(ct);
        });
    }

    public void addShowRoom(ShowRoomPlan sp) {
        this.showrooms.add(sp);
        this.cartypes.forEach((st) -> {
            sp.receive(st);
        });
    }
}