class Shape{
    public void draw(){
        System.out.println("Shape");
    }
}
class Line extends Shape{
    public void draw(){
        System.out.println("Line");
    }
}
class Rect extends Shape{
    public void draw(){
        System.out.println("Rect");
    }
}
class Circle extends Shape{
    public void draw(){
        System.out.println("Circle");
    }
}
public class MethodOverridingEx {
    //Shape을 상속받은 모든 객체들을 매개변수로 받을 수 있음.
    static void paint(Shape p){ //static 메소드에서는 static 메소드만 호출할 수 있다. 왜??
        p.draw(); //p가 가리키는 객체에 오버라이딩한 draw() 호출, 동적바인딩
    }
    public static void main(String[] args){
        Line line=new Line();
        paint(line); //Line객체의 draw() -> "Line" 출력

        // 모두 paint메소드 내에서 Shape에 대한 레퍼런스 p로 업캐스팅됨. 하지만 동적바인딩에 의하여 객체가 가진 draw() 메소드가 실행됨.
        // 자바에서는 항상 동적바인딩을 통해 오버라이딩된 메소드가 실행되도록 보장한다.
        paint(new Shape()); //"Shape"
        paint(new Line()); //"Line"
        paint(new Rect()); //"Rect"
        paint(new Circle()); //"Circle"
    }
}
