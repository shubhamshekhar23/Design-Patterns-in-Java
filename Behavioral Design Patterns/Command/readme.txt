Command - 

Description -
1. we have a device (d1), and we can setcommands to this device by passing differend command instances. When we execute this device based on which command was set latest, it will execute that command.

2. So, it means that every command should have an information how that execute will actually do. It means that each command instance will have an instance of the system on which the methods will be called ( can be multiple methods).

3. So we have a interface commandPlan that has execute method. All the commands will implement this and define their own execute method. These command instances will be passed to d1 based on the requirements and execute.

4. Each command instance will use different systems based on what command they are e.g (acOn command will use ac system instance and operate the methods).



Problem Statement -
# Here in this example we only have one button in the remote that can be used to perform differnt tasks like lighton,lightoff, play miusic, turn on AC, turnOff ac. This commands use different systems Light, MusicSystem, Aircondition.
All these commands can be performed on a single button press; we just have to setCommand and everytime we want it to do adifferent task, we will pass the instance of the new task. we can do it by creating a class out of thses commands
which uses the original system methods( like Lightcontrol, muysicsystem, aircondition) and then perform on execute method 