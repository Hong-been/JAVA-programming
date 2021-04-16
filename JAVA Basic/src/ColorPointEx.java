class Point{// why not 'public'? "should be declared in a file named 'Point.java'"
    //At outside look, this class is ColorPoint, so we have only one public class. I guess.?
    private int x,y;
    void set(int x,int y){
        this.x=x;
        this.y=y;
    }
    void showPoint(){
        System.out.println("("+x+","+y+")");
    }
}

class ColorPoint extends Point{
    private String color;
    void setColor(String color){
        this.color=color;
    }
    void showColor(){
        System.out.println(color);
        showPoint();
    }
}
public class ColorPointEx extends ColorPoint{
    public static void main(String [] args){
        Point P=new Point();
        P.set(2,5);
        P.showPoint();

        ColorPoint cp = new ColorPoint();
        cp.set(3,4);
        cp.setColor("orange");
        cp.showColor();
    }
}

