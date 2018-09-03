public class LuxuryCar extends CarPlan
{
    String color;

    LuxuryCar(String l){
        this.color = l;
    }

    public void assembleCarBody(){
        System.out.println("luxury carbody assembled ");
    }
    public void assembleEngine(){
        System.out.println("luxury carengine attached ");
    }
    public void assembleCarElectronics(){
        System.out.println("luxury electronics assembled ");
    }
    public void paintingCar(){
        System.out.println("Luxury car is painted in "+ this.color);
    }
    public void finishCar(){
        System.out.println(this.color +" Luxury car is finished");
    }

}