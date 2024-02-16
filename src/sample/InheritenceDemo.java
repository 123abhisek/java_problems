package sample;


class Calculator{
	public int add(int i,int j) {
		return i+j;
	}
}

class Calcv extends Calculator{
	public int sub(int i,int j) {
		return i-j;
	}
}

class CalcVeryAdv extends Calcv{
	public int mul(int i,int j) {
		return i*j;
	}
}

public class InheritenceDemo {

	public static void main(String[] args) {
		 
		CalcVeryAdv in = new CalcVeryAdv();
		int a = in.sub(5, 1);
		int b = in.add(5, 6);
		int c = in.mul(5, 2);

		System.out.println(a+" "+b+" "+c);
		
	}

}
