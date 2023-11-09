public class Ferrari812 extends Car{
    public Ferrari812(String name, Engine engine, TurboCharger turboCharger) {
        super(name, engine, turboCharger);
    }

    @Override
    void shiftgear() {
        System.out.println("Shift gear by quick-Shifter");
    }
}
