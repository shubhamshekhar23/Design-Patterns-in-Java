public class LuxuryCar implements CarPlan
{
    String owner;
    int carBodyPrice = 500;
    int carEnginePrice = 200;
    int carElectronicsPrice= 300;
    int carPaintPrice= 100;

    LuxuryCar(String name){
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
        System.out.println("Mr. "+ this.owner + " please pay "+ p + " dollars for the LuxuryCar");
    }
}