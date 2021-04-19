package app;
import lib.Calculator;

public class GoodCalc extends Calculator{
    public int add(int a,int b){
        return a+b;
    }
    public int subtract(int a,int b){
        return a-b;
    }
    public double average(int[] a){
        double sum=0;
        for (int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum/a.length;
    }
    public static void main(String[] args){
        GoodCalc gc=new GoodCalc();
        int a[]=new int[] {3,44,32,90,47};

        System.out.println(gc.add(1,3));
        System.out.println(gc.subtract(1,3));
        System.out.println(gc.average(a));
    }
}
