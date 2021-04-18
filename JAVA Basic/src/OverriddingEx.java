/* 출력순서 맞추기
* 다음을 보고 오버라이딩과 동적바인딩을 고려하여, 실행결과를 말하라.
*/
class SuperObject{
    public void paint(){ draw(); }
    public void draw() {
        draw();
        System.out.println("Super Object");
    }
}
class SubOject extends SuperObject{
    public void paint(){ super.draw();}
    public void draw(){
        System.out.println("Sub Object");
    }
}

public class OverriddingEx {
    public static void main(String[] args){
        SuperObject b=new SubOject();
        b.paint();
    }
}
