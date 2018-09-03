public abstract class CarPlan{
    public abstract void assembleCarBody();
    public abstract void assembleEngine();
    public abstract void assembleCarElectronics();
    public abstract void paintingCar();
    public abstract void finishCar();

    public final void constructCar(){
        this.assembleCarBody();
        assembleEngine();
        assembleCarElectronics();
        paintingCar();
        finishCar();
    }
}