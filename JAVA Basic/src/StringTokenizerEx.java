import java.util.StringTokenizer;
public class StringTokenizerEx {
    public static void main(String[] args){
        String text="name=hongbeen&addr=Seoul&age=26";
        StringTokenizer st = new StringTokenizer(text, "&");
        int count=st.countTokens();
        System.out.println("토큰 갯수: "+ count);
        for(int i=count;i>0;i--){
            String token=st.nextToken();
            System.out.println(token);
        }
    }
}
