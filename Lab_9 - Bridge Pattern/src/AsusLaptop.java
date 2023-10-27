public class AsusLaptop extends Device{
    public AsusLaptop(Factory factory1, Factory factory2) {
        super(factory1, factory2);
    }

    @Override
    public void manufacture() {
        System.out.println("Manufacturing Asus Laptop...");
        factory1.build();
        factory2.build();
    }
}
