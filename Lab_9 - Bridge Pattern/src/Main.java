public class Main {
    public static void main(String[] args) {
        Device device1 = new AsusLaptop(new Produce(),new Assemble());
        device1.manufacture();

        Device device2 = new AsusPhone(new Produce(),new Assemble());
        device2.manufacture();
    }
}