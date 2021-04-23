import java.util.Vector;

public class VectorEx {
    public static void main(String[] args){
        Vector<Integer> v=new Vector<Integer>();
        int sum=0;
        v.add(5);
        v.add(4);
        v.add(-1);

        v.add(2,100);

        System.out.println("Size of vector: " + v.size());
        System.out.println("Capacity of vextor: "+v.capacity());

        for (int i = 0; i < v.size(); i++) {
            int n = v.get(i);
            System.out.print(n+"\t");
            sum+=n;
        }
        System.out.println("\nSum of all element: "+sum);
    }
}
