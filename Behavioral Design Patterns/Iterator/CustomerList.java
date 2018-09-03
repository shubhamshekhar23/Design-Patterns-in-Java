
public class CustomerList implements CollectionPlan
{
    IteratorPlan it;
    Customer[] customerlist;
    int size;
    int numberOfCusts = 0;

    CustomerList(int size)
    {
        this.customerlist = new Customer[size];
        this.size = size;
    }

    public void add(Customer c)
    {
        if(this.numberOfCusts < this.size)
        {
            this.customerlist[this.numberOfCusts] = c;
            this.numberOfCusts++;
        }else{
            System.out.println("Array is full");
        }
    }

    public IteratorPlan getIterator() {
        return new CustomerIterator(this.customerlist);
    }
}