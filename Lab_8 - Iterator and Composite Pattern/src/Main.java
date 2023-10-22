public class Main {
    public static void main(String[] args) {
        System.out.println("Creating a village");

        // Components
        Rectangle brickHouse = new Rectangle();
        Rectangle mudHouse = new Rectangle();
        Triangle brickHouseCeiling = new Triangle();
        Triangle mudHouseCeiling = new Triangle();
        Curve swimmingPool = new Curve();
        Curve pond = new Curve();
        Leaf mangoTree = new Leaf();
        Leaf bananaTree = new Leaf();

        // Villages with specific combinations
        Village brickHouseVillage = new Village("Brick House Village");
        brickHouseVillage.addShape(brickHouse);
        brickHouseVillage.addShape(brickHouseCeiling);
        brickHouseVillage.addShape(mangoTree);
        brickHouseVillage.addShape(swimmingPool);

        Village mudHouseVillage = new Village("Mud House Village");
        mudHouseVillage.addShape(mudHouse);
        mudHouseVillage.addShape(mudHouseCeiling);
        mudHouseVillage.addShape(bananaTree);
        mudHouseVillage.addShape(pond);

        // Display the components in each village
        brickHouseVillage.displayComponents();
        mudHouseVillage.displayComponents();
    }
}