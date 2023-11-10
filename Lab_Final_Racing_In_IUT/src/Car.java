abstract class Car {
    private final String name;
    private Engine engine;
    private TurboCharger turboCharger;
    public Car(String name,Engine engine,TurboCharger turboCharger){
        this.name=name;
        this.setEngine(engine);
        this.setTurboCharger(turboCharger);
    }
    public void setEngine(Engine engine){
        this.engine=engine;
    }
    public void setTurboCharger(TurboCharger turboCharger){
        this.turboCharger=turboCharger;
    }
    //template Pattern
    public void startRace(){
        start();
        accelerate();
        shiftgear();
        stop();
    }
    public void showCarInfo() {
        System.out.println("Car name: " + name);
        engine.showEngineInfo();
        turboCharger.showTurboChargerInfo();
    }
    //Hook method
    public void start(){
        System.out.println("Car is starting...");
    }
    public void stop(){
        System.out.println("Car is stopping...");
    }
    public void accelerate(){
        System.out.println("Car is accelerating...");
    }
    abstract void shiftgear();
}
