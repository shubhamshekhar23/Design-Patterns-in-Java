class myabstractfactory {
    enum cartype {
        SEDAN_USA, SPORTSCAR_USA, LUXURYCAR_USA, SEDAN_INDIA, SPORTSCAR_INDIA, LUXURYCAR_INDIA, SEDAN_CHINA,
        SPORTSCAR_CHINA, LUXURYCAR_CHINA;
    };

    static car createCar(cartype car) throws Exception {
        switch (car) {
        case SEDAN_USA:
            return usafactory.createCarIn(car);
        case SPORTSCAR_USA:
            return usafactory.createCarIn(car);
        case SEDAN_INDIA:
            return indiafactory.createCarIn(car);
        case SPORTSCAR_CHINA:
            return chinafactory.createCarIn(car);
        case LUXURYCAR_INDIA:
            return indiafactory.createCarIn(car);
        default:
            return indiafactory.createCarIn(cartype.SEDAN_INDIA);
        }
    }
}