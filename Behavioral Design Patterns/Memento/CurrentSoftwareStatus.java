public class CurrentSoftwareStatus {
    CarSoftwareStatus css = null;

    CurrentSoftwareStatus(CarSoftwareStatus cs){
        this.css = cs;
    }

    public void setStatus(CarSoftwareStatus css) {
        this.css = css;
    }

    public CarSoftwareMemento createMemento() {
        return new CarSoftwareMemento(this.css);
    }

    public void setStatusFromMemento(CarSoftwareMemento mem){
        this.css = mem.getStatus();
    }

    public void setNewChange(String chn){
        this.css.setNewChange(chn);
    }

    public void setCorrection(String chn){
        this.css.setCorrection(chn);        
    }

    public void getDetails(){
        this.css.getDetails();
    }
}