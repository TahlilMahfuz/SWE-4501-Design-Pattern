public class Triangle implements ShapeToDraw{
    public int side1,side2,side3;
    public String type;
    public Triangle(int side1,int side2,int side3,String type){
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
        this.type=type;
    }
    @Override
    public void DrawShapes() {
        System.out.println("Side1: "+side1+"\nSide2: "+side2+"\nSide3: "+side3+"\nType: "+type+"\nTriangle Drawn\n");
    }
}
