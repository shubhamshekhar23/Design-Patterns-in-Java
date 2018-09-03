public class CustomerIterator implements IteratorPlan
{
    Customer[] cl;
    int size;
    int curr_index = 0;
    CustomerIterator(Customer[] cl)
    {
        this.cl = cl;
        this.size = this.cl.length;
    }

    public Boolean hasNext()
    {
        if(this.size>this.curr_index && this.cl[this.curr_index]!=null){
            return true;
        }
        return false;
    }

    public Object next()
    {
        this.curr_index++;
        return this.cl[this.curr_index-1];
    }
}