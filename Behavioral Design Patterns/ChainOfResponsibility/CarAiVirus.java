public class CarAiVirus
{
    private int threatLevel;
    CarAiVirus(int p)
    {
        this.threatLevel = p;
    }

    public int getThreat(){
        return this.threatLevel;
    }
}