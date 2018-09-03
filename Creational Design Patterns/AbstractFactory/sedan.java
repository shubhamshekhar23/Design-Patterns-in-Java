class sedan extends car
{   
    static int globalId = 0;
    sedan(String location)
    {
        globalId++;
        this.id = globalId;
        this.location = location;
        this.type = "sedan";
    }
}

class sportscar extends car
{   
    static int globalId = 0;
    sportscar(String location)
    {
        globalId++;
        this.id = globalId;
        this.location = location;
        this.type = "sports car";
    }
}

class luxurycar extends car
{   
    static int globalId = 0;
    luxurycar(String location)
    {
        globalId++;
        this.id = globalId;
        this.location = location;
        this.type = "luxury car";
    }
}