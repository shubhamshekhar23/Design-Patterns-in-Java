import java.util.ArrayList;
import java.util.List;

import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class ShowRoomMediator
{
    List<CarPlantPlan> carPlantList;

    ShowRoomMediator()
    {
        this.carPlantList = new ArrayList<CarPlantPlan>();
    }

    public void addPlant(CarPlantPlan cp)
    {
        this.carPlantList.add(cp);
    }

    public void request(String cartype){
        this.carPlantList.forEach((plant)-> {
            if(plant.getType() == cartype){
                plant.bookCar();
            }
        });
    }
}