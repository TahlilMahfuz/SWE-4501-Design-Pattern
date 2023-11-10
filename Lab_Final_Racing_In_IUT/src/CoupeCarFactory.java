public class CoupeCarFactory extends CarAbstractFactory{
    @Override
    Car getCar(String carType, Engine engine, TurboCharger turboCharger) {
        if(carType.equalsIgnoreCase("TOYOTA")){
            return new ToyotaGR86("Toyota GR86", engine, turboCharger);
        }
        else if(carType.equalsIgnoreCase("SUBARUBRZ")){
            return new SubaruBRZ("Subaru BRZ", engine, turboCharger);
        }
        return null;
    }
}
