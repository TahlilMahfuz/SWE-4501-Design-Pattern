public class RoadsterCarFactory extends CarAbstractFactory{
    @Override
    Car getCar(String carName, Engine engine, TurboCharger turboCharger) {
        //Porsche and Ferrari are roadster cars
        if(carName.equalsIgnoreCase("FERRARI")){
            return new Ferrari(engine, turboCharger);
        }
        else if(carName.equalsIgnoreCase("PORSHE")){
            return new Porsche(engine, turboCharger);
        }
        return null;
    }
}
