class ChainOfResponsibility
{
	public static void main(String[] args)
	{	
        try{
            CarAiVirus virus = new CarAiVirus(1);

            Engineer e1 = new Engineer();
            TeamLead t1 = new TeamLead();
            TechnicalOfficer ct1 = new TechnicalOfficer();
            Expert ee = new Expert();

            e1.setNextDebugger(t1);
            t1.setNextDebugger(ct1);
            ct1.setNextDebugger(ee);
            e1.debug(virus);
        }
        catch(Exception e){
            System.out.println(e + " :set the debugger chain correclty");
        }
	}
}

/* There is a new virus discovered whose level can be set ; now there is a debugger chain hierecahy; if an engineer can solve it
then ints fine; otherwise he will pass it to team lead; if team lead cant then he will pass it to technical officer;etc.
So a chain abstract class is created and all the debuggers will extend from it amd create a chain */