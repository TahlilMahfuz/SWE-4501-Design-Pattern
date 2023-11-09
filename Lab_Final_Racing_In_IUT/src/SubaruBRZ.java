public class SubaruBRZ extends Car{
    public SubaruBRZ(String name, Engine engine, TurboCharger turboCharger) {
        super(name, engine, turboCharger);
    }

    @Override
    void shiftgear() {
        System.out.println("Shift gear automatically");
    }
}
