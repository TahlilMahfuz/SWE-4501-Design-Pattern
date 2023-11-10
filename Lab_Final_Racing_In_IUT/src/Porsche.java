public class Porsche extends Car {
    public Porsche(String carName, Engine engine, TurboCharger turboCharger) {
        super(carName,engine,turboCharger);
    }

    @Override
    void shiftgear() {
        System.out.println("Shift Gear: 7");
    }
}
