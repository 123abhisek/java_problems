package sample;


// Varargs 

class Calc{
//	public int add(int i,int j) { 
//		return i+j;
//	}
	
	public int add(int ...n) { // Array {4,5,8,5}  -->   Varargs 
		int sum=0;
		for(int i : n) {
			sum = sum + i;
		}
		
		return sum;
	}
}

public class Practice_Varargs {

	public static void main(String[] args) {
		
		Calc obj = new Calc();
		System.out.println(obj.add(4,5,8,5));
	}

}

