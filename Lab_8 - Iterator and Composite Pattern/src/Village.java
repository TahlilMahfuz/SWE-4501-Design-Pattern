import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Composite class
class Village implements ShapeToDraw, Iterable<ShapeToDraw> {
    public String name;
    public List<ShapeToDraw> shapes = new ArrayList<>();

    public Village(String name) {
        this.name = name;
    }

    public void addShape(ShapeToDraw shape) {
        shapes.add(shape);
    }

    public void removeShape(ShapeToDraw shape) {
        shapes.remove(shape);
    }

    @Override
    public void DrawShapes() {
        System.out.println("Village: " + name);
        for (ShapeToDraw shape : shapes) {
            shape.DrawShapes();
        }
    }

    @Override
    public Iterator<ShapeToDraw> iterator() {
        return shapes.iterator();
    }
}