public class CarParts {
    public static enum cartype {
        SEDAN, SPORTS, LUXURY;
    };
    public String getName(){return "shubham";};

}

class Engine extends CarParts {
    public String engineNo;

    public Engine(cartype car) {
        switch (car) {
        case SEDAN:
            this.engineNo = "SedanEngine";
            break;
        case SPORTS:
            this.engineNo ="SportsEngine";
            break;
        case LUXURY:
            this.engineNo = "LuxuryEngine";
            break;
        }
    }
    public String getName(){
        return this.engineNo;
    }
}

class Electronics extends CarParts {
    public String electronics;

    public Electronics(cartype car) {
        switch (car) {
        case SEDAN:
            this.electronics = "SedanElectronics";
            break;
        case SPORTS:
            this.electronics ="SportsElectronics";
            break;
        case LUXURY:
            this.electronics = "LuxuryElectronics";
            break;
        }
    }
    public String getName(){
        return this.electronics;
    }
}

class CarBody extends CarParts {
    public String carBody;

    public CarBody(cartype car) {
        switch (car) {
        case SEDAN:
            this.carBody = "SedanCarBody";
            break;
        case SPORTS:
            this.carBody ="SportsCarBody";
            break;
        case LUXURY:
            this.carBody = "LuxuryCarBody";
            break;
        }
    }
    public String getName(){
        return this.carBody;
    }
}