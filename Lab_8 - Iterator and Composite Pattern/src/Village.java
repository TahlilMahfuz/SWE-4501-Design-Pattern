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
        Iterator<ShapeToDraw> itr=shapes.iterator();
        while(itr.hasNext()){
            itr.next().DrawShapes();
        }
        System.out.println(this.name+" drawn\n__________________________\n");
    }

    @Override
    public Iterator<ShapeToDraw> iterator() {
        return shapes.iterator();
    }
}