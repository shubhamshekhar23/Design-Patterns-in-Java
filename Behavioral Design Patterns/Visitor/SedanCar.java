public class SedanCar implements CarPlan
{
    String owner;
    int carBodyPrice = 300;
    int carEnginePrice = 100;
    int carElectronicsPrice= 30;
    int carPaintPrice= 10;

    SedanCar(String name){
        this.owner = name;
    }

    public void setBodyPrice(int p){
        this.carBodyPrice = p;
    }

    public void setEnginePrice(int p){
        this.carBodyPrice = p;
    }

    public void setElectronicsPrice(int p){
        this.carBodyPrice = p;
    }

    public void setPaintPrice(int p){
        this.carBodyPrice = p;
    }

    public void getPrice(CarPriceVisitor cp){
        int p = cp.visit(this);
        System.out.println("Mr. "+ this.owner + " please pay "+ p + " dollars for the SedanCar");
    }
}