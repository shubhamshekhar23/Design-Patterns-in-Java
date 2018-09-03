public class PetrolSystemAdapter implements PetrolSystemPlan
{
    GasSystemPlan g1;
    PetrolSystemAdapter(GasSystemPlan g1)
    {
        this.g1 = g1;
    }

    public void providePetrolEnergy()
    {
        this.g1.provideGasEnergy();
    }
}