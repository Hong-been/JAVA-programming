class Point{// why not 'public'? "should be declared in a file named 'Point.java'"
    //At outside look, this class is ColorPoint, so we have only one public class. I guess.?
    private int x,y;
    Point() {
        this.x = 0;
        this.y = 0;
    }
    Point(int x,int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "Point("+x+","+y+")";
    }

    void showPoint(){
        System.out.println("("+x+","+y+")");
    }
}

class ColorPoint extends Point{
    private String color;
    ColorPoint (int x, int y,String color) {
        super(x,y);
        this.color=color;
    }
    void showColor(){
        System.out.print(color);
        showPoint();
    }
}
public class SuperEX {
    public static void main(String [] args){
        ColorPoint cp=new ColorPoint(2,5,"blue");
        cp.showColor();
    }
}

