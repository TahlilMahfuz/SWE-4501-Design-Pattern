import java.util.ArrayList;
import java.util.Iterator;

class Village {
    public String name;
    public ArrayList<ShapeToDraw> shapesList = new ArrayList<ShapeToDraw>();

    public Village(String name) {
        this.name = name;
        System.out.println(this.name + " Created!\n");
    }

    public void addShape(ShapeToDraw shape) {
        this.shapesList.add(shape);
    }

    public void displayComponents() {
        System.out.println("Components of " + this.name + ":");
        //Iterator Pattern
        Iterator iterator = this.shapesList.iterator();
        while (iterator.hasNext()) {
            ShapeToDraw shape = (ShapeToDraw)iterator.next();
            shape.DrawShapes();
        }
        System.out.println('\n');
    }
}