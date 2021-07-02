class Main
{
    public static void main(String[] args)
	{	
        try
        {
            AutoPilot ap = new AutoPilot();
            ap.start();
        }
        catch(Exception e){
            System.out.println("whatsup");
        }
	}
}

/**
 * Facade means hiding all the compexities from the client. In this example all the compelexity like switching on different system 
 * for the auto pilot to work has been done by the auto pilot class whcih is a facade; if it hadnot been there to make it work
 * client had to start all the system components himself.
 */