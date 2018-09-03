class singleton
{
	public static void main(String[] args)
	{	
        godCreation myGod = godCreation.createMyGod("Jesus");
        System.out.println( myGod);
        godCreation myGod2 = godCreation.createMyGod("Indra");
        System.out.println( myGod2);  
	}
}

// Both mygod and mygod2 have same reference, same pointer value;