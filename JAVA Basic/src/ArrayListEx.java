import java.util.*;
public class ArrayListEx {
    public static void main(String[] args){
        ArrayList<String> a=new ArrayList<String>();
        int nameLength=Integer.MIN_VALUE;
        String LongestName=null;

        Scanner sc=new Scanner(System.in);
        for(int i=0;i<4;i++){
            System.out.print("Enter name>>");
            a.add(sc.next());
        }
        for(int i=0;i<4;i++){
            String name=a.get(i);
            System.out.print(name+" ");
            if(nameLength<name.length()){
                nameLength=name.length();
                LongestName=name;
            }
        }
        System.out.println("\nLongest Name is "+LongestName);

    }
}
