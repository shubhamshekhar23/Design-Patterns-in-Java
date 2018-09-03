import java.util.ArrayList;
import java.util.List;

public class SoftwareCareTaker
{
    List<CarSoftwareMemento> mementolist;

    SoftwareCareTaker(){
        this.mementolist = new ArrayList<CarSoftwareMemento>();
    }

    public void add(CarSoftwareMemento c1){
        this.mementolist.add(c1);
    }

    public CarSoftwareMemento getMemento(int index){
        return this.mementolist.get(index);
    }
}