class Interpreter
{
	public static void main(String[] args)
	{	
        try{
            // setting up the voice command sysytem
            VoiceInputPlan v1 = new VoiceInput("drive");
            VoiceInputPlan v2 = new VoiceInput("startCar");
            OrVoice driveCommand = new OrVoice(v1, v2);

            driveCommand.interpret("driveCar");
            driveCommand.interpret("startCar");

            VoiceInputPlan v3 = new VoiceInput("fuelcheck");
            VoiceInputPlan v4 = new VoiceInput("doorclosed");
            AndVoice securityCommand = new AndVoice(v3, v4);

            securityCommand.interpret("fuelcheck, doorclosed");
            securityCommand.interpret("fuel, door");
        }
        catch(Exception e){
            System.out.println(e + " :set the debugger chain correclty");
        }
	}
}

/*This is interpreter; just like we can define grammar rules; here we define an interpreter called voice input
that has a data based on which the interpretaion will go on; and then there are expressions handler like what combination we
want to handle AND OR and we can create our combinatuion of voice inputs and then interpret */
