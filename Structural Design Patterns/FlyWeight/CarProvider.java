import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CarProvider {
    private static HashMap<String, CarStatusPlan> hm = new HashMap<String, CarStatusPlan>();

    public static CarStatusPlan getCarStatus(String type) {
        CarStatusPlan c = null;

        if (hm.containsKey(type))
            c = hm.get(type);
        else {
            switch (type) {
            case "sports":
                c = new SportsCarStatus();
                break;
            case "sedan":
                c = new SedanCarStatus();
                break;
            case "luxury":
                c = new LuxuryCarStatus();
                break;
            default:
                System.out.println("Unreachable code!");
            }
            hm.put(type, c);
        }
        return c;
    }
}