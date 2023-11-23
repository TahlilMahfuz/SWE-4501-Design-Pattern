public class NOSCarDecorator extends CarDecorator{
    public NOSCarDecorator(Car decoratedCar, NOS nos){
        super(decoratedCar);
    }
    public static void setNos(Car car,NOS nos){
        car.setNOS(nos);
    }
}
