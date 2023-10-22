import java.util.ArrayList;

class Village {
    public String name;
    public ArrayList<ShapeToDraw> shapesList = new ArrayList<ShapeToDraw>();

    public Village(String name) {
        this.name = name;
        System.out.println(this.name + " Created!");
    }

    public void addShape(ShapeToDraw shape) {
        this.shapesList.add(shape);
    }
}