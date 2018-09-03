public class AutoPilot
{
    CarSystemPlan map,engine,ai,guidingvoice;
    AutoPilot()
    {
        this.map = new GoogleMap();
        this.engine = new Engine();
        this.ai = new ArtificialIntelligence();
        this.guidingvoice = new GuidingVoice();
    }

    public void start(){
        this.map.turnOn();
        this.engine.turnOn();
        this.ai.turnOn();
        this.guidingvoice.turnOn();
        System.out.println("You can relax now. The car is in autopilot mode");
    }

    public void end(){
        this.map.turnOff();
        this.engine.turnOff();
        this.ai.turnOff();
        this.guidingvoice.turnOff();
    }
}