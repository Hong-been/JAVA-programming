import java.util.Scanner;
public class timeCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hour=0;
        int min=0;
        int sec=0;
        while(sc.hasNext()){
            min+=sc.nextInt();
            sec+=sc.nextInt();
            if(min>=60){
                hour+=min/60;
                min%=60;
            }
            if(sec>=60){
                min+=sec/60;
                sec%=60;
            }
            System.out.println(hour+": "+min+": "+sec);
        }
    }
}
