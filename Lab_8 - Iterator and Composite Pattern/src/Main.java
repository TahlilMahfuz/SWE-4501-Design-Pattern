public class Main {
    public static void main(String[] args) {
        System.out.println("Creating a village");

        Rectangle rect1 = new Rectangle();
        Rectangle rect2 = new Rectangle();
        Triangle trin1 = new Triangle();
        Curve curvObj1 = new Curve();
        Leaf leafObj1 = new Leaf();
        Leaf leafObj2 = new Leaf();

        Village objWater = new Village("Water");
        objWater.addShape(curvObj1);
        objWater.addShape(leafObj1);

        Village objTree = new Village("Tree");
        objTree.addShape(leafObj1);
        objTree.addShape(leafObj2);

        Village objHouse = new Village("House");
        objHouse.addShape(rect1);
        objHouse.addShape(trin1);
        objHouse.addShape(rect2);
        objHouse.addShape(trin1);
    }
}