
public class CarList implements CollectionPlan
{
    IteratorPlan it;
    Car[] carlist;
    int size;
    int numberOfCars = 0;

    CarList(int size)
    {
        this.carlist = new Car[size];
        this.size = size;
    }

    public void add(Car c)
    {
        if(this.numberOfCars < this.size)
        {
            this.carlist[this.numberOfCars] = c;
            this.numberOfCars++;
        }else{
            System.out.println("Array is full");
        }
    }

    public IteratorPlan getIterator() {
        return new CarIterator(this.carlist);
    }
}