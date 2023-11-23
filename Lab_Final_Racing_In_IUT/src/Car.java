public abstract class Car {
    private Engine engine;
    private TurboCharger turboCharger;
    private NOS nos;
    public Car(Engine engine,TurboCharger turboCharger){
        this.setEngine(engine);
        this.setTurboCharger(turboCharger);
    }
    //Constructor Overloading
    public Car(Engine engine,TurboCharger turboCharger,NOS nos){
        this.setEngine(engine);
        this.setTurboCharger(turboCharger);
        this.setNOS(nos);
    }
    public Engine getEngine() {
        return engine;
    }
    public void setEngine(Engine engine){
        this.engine=engine;
    }
    public TurboCharger getTurboCharger() {
        return turboCharger;
    }
    public void setTurboCharger(TurboCharger turboCharger){
        this.turboCharger=turboCharger;
    }
    public NOS getNOS() {
        return nos;
    }
    protected void setNOS(NOS nos){
        this.nos=nos;
    }
    public void showCarInfo() {
        System.out.println("Car name: " + this.getClass().getSimpleName());
        engine.showEngineInfo();
        turboCharger.showTurboChargerInfo();
        if(this.nos!=null)
            nos.showNOSInfo();
    }
    public void start(){
        System.out.println("Car is starting...");
    }
    public void stop(){
        System.out.println("Car is stopping...");
    }
    public void accelerate(){
        System.out.println("Car is accelerating...");
    }
}
