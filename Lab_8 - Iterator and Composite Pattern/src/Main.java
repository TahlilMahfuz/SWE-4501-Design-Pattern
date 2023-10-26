public class Main {
    public static void main(String[] args) {
        System.out.println("Creating a village\n");

        // Components
        Rectangle brickHouse = new Rectangle(2,3,"Brick");
        Triangle brickHouseCeiling = new Triangle(10,20,30,"Brick");
        Curve swimmingPool = new Curve(10,"Swimming Pool");
        Leaf mangoTree = new Leaf("Green","Mango");

        // Create a village using the Builder pattern
        VillageBuilder villageBuilder = new VillageBuilder("Brick House Village Banana Tree and Pond")
                .addShape(brickHouse)
                .addShape(brickHouseCeiling)
                .addShape(swimmingPool)
                .addShape(mangoTree);

        Village brickHouseVillage = villageBuilder.build();

        // Components
        Rectangle mudHouse = new Rectangle(10,16,"Mud");
        Triangle mudHouseCeiling = new Triangle(2 ,4,6,"Mud");
        Curve pond = new Curve(20,"Pond");
        Leaf bananaTree = new Leaf("Yellow","Banana");

        // Create a village using the Builder pattern
        VillageBuilder villageBuilder2 = new VillageBuilder("Mud house Village with Manago Tree and Swimming Pool")
                .addShape(mudHouse)
                .addShape(mudHouseCeiling)
                .addShape(pond)
                .addShape(bananaTree);

        Village mudHouseVillage = villageBuilder2.build();

        // Display the components in each village
        mudHouseVillage.DrawShapes();
        brickHouseVillage.DrawShapes();
    }
}