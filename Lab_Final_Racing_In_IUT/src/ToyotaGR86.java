public class ToyotaGR86 extends Car {

    public ToyotaGR86(String name, Engine engine, TurboCharger turboCharger) {
        super(name, engine, turboCharger);
    }

    @Override
    void shiftgear() {
        System.out.println("Shift Gear: 6");
    }
}
