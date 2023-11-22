public class NOSCarDecorator extends CarDecorator{
    public NOSCarDecorator(Car decoratedCar, NOS nos){
        super(decoratedCar);
        decoratedCar.setNOS(nos);
    }
}
