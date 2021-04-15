import java.util.Scanner;

class Player{
    private String Name; // 선수 이름 선언, 클래스 멤버들만 호출 가능한 private

    public Player(String name){ //생성자
        this.Name=name;
    }

    String getName() {
        return Name;
    }
}

public class GamblingGame {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    Player P[]=new Player[2];

    for(int i=0; i<2; i++){
        System.out.print("Enter the player's name >>");
        P[i]=new Player(scanner.next());
    }
    int n=0; // 두 선수가 번갈아 게임하기 위한, n은 배열P[]의 인덱
    while(true){
        System.out.print(P[n].getName()+" <Type something except ENTER> ");
        scanner.next(); // 키를 읽고 버림

        int val[]=new int[3]; //랜덤정수를 저장할 정수 배열 생성
        for(int i=0;i<val.length;i++){ // 0,1,2 중 하나 랜덤 발생
            val[i]=(int)(Math.random()*3); //0.0~1.0 double을 랜덤생성하고 * 3한 수의 정수만 저장
            System.out.print(val[i]+"\t");
        }
        System.out.println();
        if(val[0]==val[1] & val[1]==val[2]){
            System.out.println(P[n].getName() + " is a winner!");
            break;
        }
        n++;
        n=n%2;
    }
    }
}
