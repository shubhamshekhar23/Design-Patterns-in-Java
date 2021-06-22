class Main{
    public static void main(String[] args){	
        mercedesHeadQuarter hQ =  HeadQuarterCreator.createMyheadQuarter("MercedesHq");
        System.out.println( hQ);
        mercedesHeadQuarter hQ2 =  HeadQuarterCreator.createMyheadQuarter("MercedesHq2");
        System.out.println( hQ2);  
    }
}

/* 
    Our car factory can have only one headquarter. Even if we try to instantiate a new headquarter , it wont do that but instead return the already created headquarter. 
    In our case hQ is the headquarter craeted, and again we try to craete a new hQ, it wont do that.
*/