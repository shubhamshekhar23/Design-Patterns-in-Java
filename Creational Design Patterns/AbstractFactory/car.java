class car
{
    protected String location;
    protected int id;
    protected String type;
    car()
    {

    }
    void getDetails()
    {
        System.out.println("I am a " + this.type + " with id "+ this.id + ", manufactured in " + this.location);
    };
    void getLocation(){
        System.out.println("I was manufactured in " + this.location);
    };
}