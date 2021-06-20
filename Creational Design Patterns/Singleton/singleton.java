class singleton
{
	public static void main(String[] args)
	{	
                mercedesHeadQuarter hQ =  headQuarterCreation.createMyHq("MercedesHq");
                System.out.println( hQ);
                mercedesHeadQuarter hQ2 =  headQuarterCreation.createMyHq("MercedesHq2");
                System.out.println( hQ2);  
	}
}

// Both mygod and mygod2 have same reference, same pointer value;