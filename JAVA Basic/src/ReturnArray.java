public class ReturnArray {
	public static void main(String[] args) {
		int intArray[];
		intArray=makeArray();
		for(int k:intArray)
			System.out.println(k);
	}
	static int[] makeArray() {
		int temp[]= {0,1,2,3,4};
		for(int k:temp)
			System.out.println(k);
		return temp;
	}
}
