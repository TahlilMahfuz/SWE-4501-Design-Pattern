public abstract class CarDecorator extends Car{
    protected Car decoratedCar;
    public CarDecorator(Car decoratedCar,NOS nos){
        super(decoratedCar.getEngine(), decoratedCar.getTurboCharger(),nos);
        this.decoratedCar = decoratedCar;
    }
}
