public abstract class CarDecorator extends Car{
    protected Car decoratedCar;
    public CarDecorator(Car decoratedCar){
        super(decoratedCar.getEngine(), decoratedCar.getTurboCharger());
        this.decoratedCar = decoratedCar;
    }
}
