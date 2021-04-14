import java.util.Scanner;
class Player{
	String name;
	Scanner scanner = new Scanner(System.in);
	
	public Player() {
		this(null);
	}
	public Player(String name) {
		this.name=name;
	}
	
	//Enter word, return word
	String sayword() {
		
		System.out.print(this.name +">> ");
		String word=scanner.next();
		
		return word;
	}
	
	boolean succeed(String before,String after) {
		boolean succeed;
		int lastIndex=before.length()-1;
		char lastChar=before.charAt(lastIndex);
		char firstChar=after.charAt(0);
		
		if(lastChar==firstChar) 
			succeed=true;
		
		else
			succeed=false;
		
		return succeed;
	}
	
}
public class WordGameApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int people;
		String name;
		String word="아버지";
		String nextWord;
		
		System.out.println("<java WordGameApp>");
		
		System.out.print("How many people would participate?>> ");
		people = scanner.nextInt();
		
		Player [] players = new Player[people];
		
		for(int i=0;i<players.length;i++) {
			System.out.print(i+1 +": Enter player's name>> ");
			name=scanner.next();
			players[i]=new Player(name);
		}			
		System.out.println("Start with \""+word+"\"");
		
		while(true) {
			boolean gameover=true;
			for(int i=0;i<players.length;i++) {
				
				nextWord=players[i].sayword();
				gameover=players[i].succeed(word, nextWord);
				
				if(gameover==false) {
					System.out.println(players[i].name +" is a looser.");
					break;
					}
				word=nextWord;
			}
			if(gameover==false) {
				break;
				}
		}
	}
}

