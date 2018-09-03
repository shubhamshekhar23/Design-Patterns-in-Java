public class CarSoftwareMemento
{
    CarSoftwareStatus css;

    CarSoftwareMemento(CarSoftwareStatus css){
        this.css = css;
    }

    public CarSoftwareStatus getStatus(){
        return this.css;
    }
}