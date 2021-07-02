class Main
{
	public static void main(String[] args)
	{	
        try{
            /* Setting up of system */
            Remote r = new Remote();
            MusicSystem ms = new MusicSystem();
            AirCondition ac = new AirCondition();
            LightControl lc = new LightControl();

            /* setting up instance of all the command that has to perform and pass the system instance */
            CommandPlan musicplay = new MusicPlay(ms);
            CommandPlan lightOn = new LightOn(lc);
            CommandPlan lightOff = new LightOff(lc);
            CommandPlan acon = new AcOn(ac);
            CommandPlan acoff = new AcOff(ac);


            /* Everytime we want to change the tash that remote has to perform, we use setCommand and pass the commandInstance */
            r.setCommand(musicplay);
            r.buttonPressed();

            r.setCommand(lightOn);
            r.buttonPressed();
            r.setCommand(lightOff);
            r.buttonPressed();

            r.setCommand(acon);
            r.buttonPressed();
            r.setCommand(acoff);
            r.buttonPressed();
        }
        catch(Exception e){
            System.out.println(e + " :set the debugger chain correclty");
        }
	}
}

/*Here in this example we only have one button in the remote that can be used to perform differnt tasks like lighton,lightoff, play miusic, turn on AC, turnOff ac. This commands use different systems Light, MusicSystem, Aircondition.
All these commands can be performed on a single button press; we just have to setCommand and everytime we want it to do adifferent task, we will pass the instance of the new task. we can do it by creating a class out of thses commands
which uses the original system methods( like Lightcontrol, muysicsystem, aircondition) and then perform on execute method */