class Command
{
	public static void main(String[] args)
	{	
        try{
            Remote r = new Remote();
            MusicSystem ms = new MusicSystem();
            CommandPlan musicplay = new MusicPlay(ms);
            r.setCommand(musicplay);
            r.buttonPressed();
            r.setCommand(new LightOn(new LightControl()));
            r.buttonPressed();
        }
        catch(Exception e){
            System.out.println(e + " :set the debugger chain correclty");
        }
	}
}

/*Here in this example qwe ponly have one button in the remorte that can be used to perform differnt task like lighton , play miusic etc.
Ll these commandds can be performed on a single buttone pressed; we can do it by creating a class out of thses commands
which uses the original syustem methods( like Lightcontro, muysicsystem) and then perform on execute method */