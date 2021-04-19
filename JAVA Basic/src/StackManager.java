import java.util.Scanner;
interface StackInterface{
    int length(); //스택에 들어있는 문자열 갯수 리턴
    String pop(); //스택 탑에 있는 문자열 팝
    boolean push(String ob);// 스택 탑에 문자열 ob 푸시삽입
}
class StringStack implements StackInterface{
    private String stack[];
    private int index=0;
    //생성자
    StringStack(int capacity){
        stack=new String[capacity];
    }

    public int length() { //스택에 들어있는 문자열갯수 리턴
        return index;
    }
    public String pop() { //스택 탑에 있는 문자열 팝
        if(index==0)
            return null;
        index--;
        return stack[index];
    }
    public boolean push(String ob){// 스택 탑에 문자열 ob 푸시삽입, capacity 다 차면 false
        if(index!=stack.length){
            stack[index]=ob;
            index++;
            return true;
        }
        else
            return false;
    }
}
public class StackManager {
    public static void main(String[] args){
        int StackNum=5;
        StringStack s=new StringStack(StackNum);
        Scanner text = new Scanner(System.in);

        //length()가 5가 될때까지
        for(int i=0;i<5;i++){
            System.out.print(i+1 + ".>>");
            s.push(text.next());
            }

        int sLength=s.length();
        while(sLength>0){
            System.out.print(s.pop()+"\t");
            sLength--;
        }
    }
}
