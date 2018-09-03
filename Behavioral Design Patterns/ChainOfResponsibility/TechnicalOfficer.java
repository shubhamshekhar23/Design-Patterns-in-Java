class TechnicalOfficer extends DebuggerChainPlan
{    

    public void debug(CarAiVirus v)
    {
        if(v.getThreat() > 10){
            this.next.debug(v);
        }
        else
        {
            System.out.println("Virus removed by TechnicalOfficer");
        }
    }
}