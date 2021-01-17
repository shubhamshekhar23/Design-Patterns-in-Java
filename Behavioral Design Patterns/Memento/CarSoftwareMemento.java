public class CarSoftwareMemento
{
    CarSoftwareStatus css;

    CarSoftwareMemento(CarSoftwareStatus css){
        this.css = new CarSoftwareStatus(css.newChange, css.correction);
    }

    public CarSoftwareStatus getStatus(){
        return this.css;
    }
}