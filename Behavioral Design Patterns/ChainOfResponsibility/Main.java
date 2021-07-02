class Main
{
	public static void main(String[] args)
	{	
        try{
            /* Creating a new virus instance and set the severity level just to test */
            CarAiVirus virus = new CarAiVirus(1);

            /* Creating testers instance */
            Engineer e1 = new Engineer();
            TeamLead t1 = new TeamLead();
            TechnicalOfficer ct1 = new TechnicalOfficer();
            Expert ee = new Expert();

            /* Set the hierarchy by using ofr each one by passing the instance of upper level tester */
            e1.setNextDebugger(t1);
            t1.setNextDebugger(ct1);
            ct1.setNextDebugger(ee);

            /* Give the virus to the lowest level tester */
            e1.debug(virus);
        }
        catch(Exception e){
            System.out.println(e + " :set the debugger chain correclty");
        }
	}
}

/* There are new viruses being discovered in the system whose severity level can be set ; now there is a debugger chain hierecahy; if an engineer can solve it then it's fine; otherwise he will pass it to team lead; if team lead can't solve it then he will pass it to technical officer;if he can't then he will pass it to the Expert where its solved finally. So a chain abstract class is created and all the debuggers will extend from it amd create a chain */