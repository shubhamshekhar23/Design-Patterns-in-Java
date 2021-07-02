class Main
{
    public static void main(String[] args)
	{	
        try
        {
            Driver d = new Driver(26, "shubham");
            CarProxy c = new CarProxy();
            c.setDriver(d);
            c.driveCar();
        }
        catch(Exception e){
            System.out.println("whatsup");
        }
	}
}


/* proxy means in place of something; so here we using car poroxy in plavce of just car class; we want a check wheter driver is adult to drive
we put this functionality in the proxy class and then client class that proxy insted of calling direntcly the car; all the checks
are done in proxy; */

/*this pattern is the one that is used in proxy internet to ban some sites; instead of diectly connecting to the internet
uts connected to the proxy which checks what site it is tryingt to connect if its not banned then it lets the connection go
otherwise it prevents */