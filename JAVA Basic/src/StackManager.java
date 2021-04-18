import java.util.Scanner;

interface StackInterface{
    int length(); //스택에 들어있는 문자열갯수 리턴
    String pop(); //스택 탑에 있는 문자열 팝
    boolean push(String ob);// 스택 탑에 문자열 ob 푸시삽입
}
class StringStack implements StackInterface{
    private String stack[]=new String[];

    public int length() { //스택에 들어있는 문자열갯수 리턴
        return stack.length;
    }
    public String pop() { //스택 탑에 있는 문자열 팝
        return stack[-1];
    }
    public boolean push(String ob){// 스택 탑에 문자열 ob 푸시삽입

        return true;
    }
}
public class StackManager {
    public static void main(String[] args){
        StringStack s=new StringStack();
        Scanner scanner = new Scanner(System.in);

        String word=scanner.next();
    }
}
