class TeamLead extends DebuggerChainPlan
{    
    public void debug(CarAiVirus v)
    {
        if(v.getThreat() > 5){
            this.next.debug(v);
        }
        else
        {
            System.out.println("Virus removed by TeamLead");
        }
    }
}