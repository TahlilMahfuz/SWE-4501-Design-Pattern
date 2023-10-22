public class Rectangle implements ShapeToDraw{
    public int height,width;
    public String type;
    public Rectangle(int height,int weidth,String type){
        this.height=height;
        this.width=weidth;
        this.type=type;
    }
    @Override
    public void DrawShapes() {
        System.out.println("Height: "+height+"\nWidth: "+width+"\nType: "+type+"\nRectangle Drawn\n");
    }
}
