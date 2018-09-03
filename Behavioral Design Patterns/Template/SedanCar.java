public class SedanCar extends CarPlan
{
    String color;

    SedanCar(String l){
        this.color = l;
    }

    public void assembleCarBody(){
        System.out.println("Sedan carbody assembled ");
    }
    public void assembleEngine(){
        System.out.println("Sedan carengine attached ");
    }
    public void assembleCarElectronics(){
        System.out.println("Sedan electronics assembled ");
    }
    public void paintingCar(){
        System.out.println("Sedan car is painted in "+ this.color);
    }
    public void finishCar(){
        System.out.println(this.color +" Sedan car is finished");
    }

}