import javax.management.StringValueExp;
import java.util.Scanner;
public class Modify {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.print(">>");
            String s=scanner.nextLine(); //한줄읽기
            StringBuffer sb = new StringBuffer(s);

            if (s.equals("exit")) { //스트링리터럴도 객체로 처리된다.
                System.out.println("종료합니다.");
                break;
            }

            int index=(int)(Math.random()*s.length());
            while (true) {
                int i=(int)(Math.random()*26); //알파벳 하나 고르기
                char c=(char)('a'+i); //알파벳 char에 정수를 더하고 char로 캐스팅.
                if(!sb.equals(c)){
                    sb.replace(index,index+1, String.valueOf(c));
                    break;
                }
            }
            System.out.println(sb);
        }

    }
}
