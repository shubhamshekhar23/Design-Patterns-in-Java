class Engineer extends DebuggerChainPlan
{    
    public void debug(CarAiVirus v)
    {
        if(v.getThreat() > 2){
            this.next.debug(v);
        }
        else
        {
            System.out.println("Virus removed by Engineer");
        }
    }
}