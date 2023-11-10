public class RaceInIUT {
    public static void main(String[] args) {
        CarAbstractFactory carFactory = CarFactoryProducer.getFactory("COUPE");
        assert carFactory != null;
        Car toyotaCar=carFactory.getCar("TOYOTA", new V8Engine(), new Honeywell());
        toyotaCar.showCarInfo();
    }
}