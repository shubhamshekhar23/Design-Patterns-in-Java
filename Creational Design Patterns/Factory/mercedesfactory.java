class mercedesfactory {
    enum carType {
        SEDAN, SPORTSCAR, LUXURYCAR;
    };

    static mercedesfactory create(carType car) throws Exception{
        switch (car) {
        case SEDAN:
            return new sedan();
        case SPORTSCAR:
            return new sportscar();
        case LUXURYCAR:
            return new luxurycar();
        default:
            throw new Exception(" This Car type is not supported now");
        }
    }

    void showme() {
    };
}