import java.util.ArrayList;
import java.util.List;

// Builder class for creating villages
class VillageBuilder {
    private String name;
    private List<ShapeToDraw> shapes = new ArrayList<>();

    public VillageBuilder(String name) {
        this.name = name;
    }

    public VillageBuilder addShape(ShapeToDraw shape) {
        shapes.add(shape);
        return this;
    }

    public Village build() {
        Village village = new Village(name);
        village.shapes = this.shapes;
        return village;
    }
}