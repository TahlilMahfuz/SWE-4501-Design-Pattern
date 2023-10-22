public class Leaf implements ShapeToDraw{
    public String leafColor;
    public String leafType;
    public Leaf(String leafColor,String leafType){
        this.leafColor=leafColor;
        this.leafType=leafType;
    }
    @Override
    public void DrawShapes() {
        System.out.println("Leaf Color: "+leafColor+"\nLeaf Type: "+leafType+"\nLeaf Drawn\n");
    }
}
