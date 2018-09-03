public class CarSoftwareStatus
{
    String newChange;
    String correction;

    CarSoftwareStatus( String n1, String n2)
    {
        this.newChange = n1;
        this.correction = n2;
    }

    public void setNewChange(String chn){
        this.newChange = chn;
    }

    public void setCorrection(String chn){
        this.correction = chn;
    }

    public void getDetails()
    {
        System.out.println("new change :" + this.newChange + " ; " + "correction : " + this.correction);
    }
}