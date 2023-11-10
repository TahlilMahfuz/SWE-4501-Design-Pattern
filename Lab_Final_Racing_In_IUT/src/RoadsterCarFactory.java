public class RoadsterCarFactory extends CarAbstractFactory{
    @Override
    Car getCar(String carName, Engine engine, TurboCharger turboCharger) {
        //Porsche and Ferrari are roadster cars
        if(carName.equalsIgnoreCase("FERRARI")){
            return new Ferrari("Ferrari", engine, turboCharger);
        }
        else if(carName.equalsIgnoreCase("PORSCHE")){
            return new Porsche("Porsche", engine, turboCharger);
        }
        return null;
    }
}
