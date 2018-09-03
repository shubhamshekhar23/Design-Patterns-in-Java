class godCreation {
    private static godCreation God = null;
    String name;
    private godCreation(String name){
        this.name = name;
    }
    static godCreation createMyGod(String name){
        if(God==null){
            God = new godCreation(name);
        }
        return God;
    }
    String getName() {
        return God.name;
    }
}