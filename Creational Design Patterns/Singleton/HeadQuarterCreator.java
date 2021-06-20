class HeadQuarterCreator {
    private static HeadQuarterCreator headQuarter = null;
    String name;
    private HeadQuarterCreator(String name){
        this.name = name;
    }
    static HeadQuarterCreator createMyheadQuarter(String name){
        if(headQuarter==null){
            headQuarter = new HeadQuarterCreator(name);
        }
        return headQuarter;
    }
    String getName() {
        return headQuarter.name;
    }
}