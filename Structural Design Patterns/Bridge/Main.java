class Main
{
    public static void main(String[] args)
	{	
        try
        {
            CarPlan sc1 = new SportsCar(new RedFinish());
            sc1.paintCar();
            CarPlan lc1 = new LuxuryCar(new GreenFinish());
            lc1.paintCar();
        }
        catch(Exception e){
            System.out.println("whatsup");
        }
	}
} 

/**There are 2 abstarction here : colorfinish and car; we want them to vary indepenednly; so that if a differemt machine or some methods added in 
 * colorfinish we dont want to change the car class; So we built a bridge between car class and color class by using composition; putting color 
 * object inside car object and most importantly calling color objects method inside car; this way we can change colorFInish the way we like 
 * and car remains free.
 */