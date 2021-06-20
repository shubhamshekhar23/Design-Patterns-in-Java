class headQuarterCreation {
    private static headQuarterCreation Hq = null;
    String name;
    private headQuarterCreation(String name){
        this.name = name;
    }
    static headQuarterCreation createMyHq(String name){
        if(Hq==null){
            Hq = new headQuarterCreation(name);
        }
        return Hq;
    }
    String getName() {
        return Hq.name;
    }
}