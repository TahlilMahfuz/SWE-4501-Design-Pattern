public class Ferrari extends Car {
    public Ferrari(String carName, Engine engine, TurboCharger turboCharger) {
        super(carName, engine, turboCharger);
    }

    @Override
    void shiftgear() {
        System.out.println("Shift Gear: 7");
    }
}
