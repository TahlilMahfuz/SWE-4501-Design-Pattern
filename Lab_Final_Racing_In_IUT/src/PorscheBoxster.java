public class PorscheBoxster extends Car{
    public PorscheBoxster(String name, Engine engine, TurboCharger turboCharger) {
        super(name, engine, turboCharger);
    }

    @Override
    void shiftgear() {
        System.out.println("Shift gear by stick");
    }
}
