import java.util.*;
public class HashMapDictEx {
    public static void main(String[] args){
        HashMap<String, String> dict = new HashMap<String, String>();

        dict.put("baby","아기");
        dict.put("love","사랑");
        dict.put("snake","뱀");

        Set<String> keys=dict.keySet();
        Iterator<String> it=keys.iterator();
        System.out.println("(Key, Value)");
        while(it.hasNext()){
            String key=it.next();
            String value=dict.get(key);
            System.out.println("("+key+", "+value+")");
        }
        System.out.println("\nEnter a key among the Keys>>");
        Scanner sc=new Scanner(System.in);
        String eng=sc.next();
        if(dict.get(eng)==null){
            System.out.println("There is no word you entered.");
        }
        else{
            System.out.println(eng+" is \""+dict.get(eng)+"\" in Korean.");
        }


    }
}
