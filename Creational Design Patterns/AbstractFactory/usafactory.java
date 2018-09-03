class usafactory extends myabstractfactory {
    static car createCarIn(myabstractfactory.cartype cart) throws Exception {
        switch (cart) {
        case SEDAN_USA:
            return new sedan("USA");
        case LUXURYCAR_USA:
            return new luxurycar("USA");
        case SPORTSCAR_USA:
            return new sportscar("USA");
        default:
            return new sedan("USA");
        }
    }
}

class indiafactory extends myabstractfactory {
    static car createCarIn(myabstractfactory.cartype cart) {
        switch (cart) {
        case SEDAN_INDIA:
            return new sedan("INDIA");
        case LUXURYCAR_INDIA:
            return new luxurycar("INDIA");
        case SPORTSCAR_INDIA:
            return new sportscar("INDIA");
        default:
            return new sedan("USA");
        }
    }
}

class chinafactory extends myabstractfactory {
    static car createCarIn(myabstractfactory.cartype cart) {
        switch (cart) {
        case SEDAN_CHINA:
            return new sedan("CHINA");
        case LUXURYCAR_CHINA:
            return new luxurycar("CHINA");
        case SPORTSCAR_CHINA:
            return new sportscar("CHINA");
        default:
            return new sedan("USA");
        }
    }
}