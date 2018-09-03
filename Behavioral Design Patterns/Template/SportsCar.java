public class SportsCar extends CarPlan
{
    String color;

    SportsCar(String l){
        this.color = l;
    }

    public void assembleCarBody(){
        System.out.println("Sports carbody assembled ");
    }
    public void assembleEngine(){
        System.out.println("Sports carengine attached ");
    }
    public void assembleCarElectronics(){
        System.out.println("Sports electronics assembled ");
    }
    public void paintingCar(){
        System.out.println("Sports car is painted in "+ this.color);
    }
    public void finishCar(){
        System.out.println(this.color +" Sports car is finished");
    }

}