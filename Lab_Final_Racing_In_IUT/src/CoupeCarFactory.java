public class CoupeCarFactory extends CarAbstractFactory{
    @Override
    Car getCar(String carType, Engine engine, TurboCharger turboCharger) {
        if(carType.equalsIgnoreCase("TOYOTA")){
            return new ToyotaGR86(engine, turboCharger);
        }
        else if(carType.equalsIgnoreCase("SUBARUBRZ")){
            return new SubaruBRZ(engine, turboCharger);
        }
        return null;
    }
}
