public class LuxuryCarStatus implements CarStatusPlan
{
    private String type = "luxury";
    public int kmCovered;
    public int mileage;

    public void setKmCovered(int kmCovered){
        this.kmCovered = kmCovered;
    }

    public void setMileage(int mileage){
        this.mileage = mileage;
    }
    public void getStatus() {
        if(kmCovered/mileage > 10){
            System.out.println("You should consider servicing your car");
        }
        else{
            System.out.println("Everything is fine with your "+ this.type + " car");
        }
    }
}