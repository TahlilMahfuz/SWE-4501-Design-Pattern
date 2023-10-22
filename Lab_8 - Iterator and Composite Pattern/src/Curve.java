public class Curve implements ShapeToDraw{
    public int area;
    public String type;
    public Curve(int area,String type){
        this.area=area;
        this.type=type;
    }
    @Override
    public void DrawShapes() {
        System.out.println("Area: "+area+"\nType: "+type+"\nCurve Drawn\n");
    }
}
