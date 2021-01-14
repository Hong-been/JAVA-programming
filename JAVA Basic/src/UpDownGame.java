import java.util.Random;
import java.util.Scanner;

public class UpDownGame {
	public static void main(String[] args) {
	Random rand =new Random();
	
	Scanner scanner = new Scanner(System.in);
	int guess;
	String again;
	
	do {
		int answer=rand.nextInt(100);
		System.out.println("A random number has been choiced. Guess this.(0-99)");
		int i=1;
		do {

			System.out.print(i+">> ");
			guess= scanner.nextInt();

			if(guess>answer)
				System.out.println("More lower.");
			else if(guess<answer)
				System.out.println("More higher.");
			i+=1;
		}
		while(guess!=answer);
	
		System.out.print("Collect! The answer is "+answer+". Wanna again?(y/n)>> ");
		again= scanner.next();
	}
	while(again.equals("y"));
	}
}
