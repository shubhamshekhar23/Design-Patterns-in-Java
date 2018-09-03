public class CarPriceVisitor{
    public int visit(LuxuryCar c){
        int p;
        int extra_luxury_cost = 100;
        p = c.carBodyPrice + c.carEnginePrice+ c.carElectronicsPrice + c.carPaintPrice;
        return p+extra_luxury_cost;
    }
    public int visit(SedanCar c){
        int p;
        int extra_sedan_cost = 50;
        p = c.carBodyPrice + c.carEnginePrice+ c.carElectronicsPrice + c.carPaintPrice;
        return p+extra_sedan_cost;
    }
    public int visit(SportsCar c){
        int p;
        int extra_sports_cost = 30;
        p = c.carBodyPrice + c.carEnginePrice+ c.carElectronicsPrice + c.carPaintPrice;
        return p+extra_sports_cost;
    }
}