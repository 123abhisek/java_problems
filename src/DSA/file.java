package Leaky_Bucket;

import java.util.Scanner;

public class leaky_bucket {

	public static void main(String[] args) {

		int BUCKET_STORAGE = 10; 
		int currentStorage = 0;
		int leak_rate = 1; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total packets : ");
		int num = sc.nextInt();
		int val;

		for (int i = 0; i < num; i++) {
			
		
 			System.out.println("Enter the packet size : ");	
     		val = sc.nextInt();
			
			
			val = 4;
			
			int backupStorage = currentStorage;
			currentStorage += val;
			System.out.println("\nTime : "+(i+1));
			System.out.println("Packet size : "+val);
			if (currentStorage <= BUCKET_STORAGE) {
				System.out.println("\nAccepted -->\t Current Size : "+currentStorage+"\t Remaining Size : "+(BUCKET_STORAGE-currentStorage)+"\t Total Size : "+BUCKET_STORAGE);
				
				currentStorage -= leak_rate;
 				System.out.println("\nAfter leakage : ");
				System.out.println("\t Current Size : "+currentStorage+"\t Remaining Size : "+(BUCKET_STORAGE-currentStorage)+"\t Total Size : "+BUCKET_STORAGE);
			} else {
}
			System.out.println("\nNot Accepted");
			backupStorage -= leak_rate;
			System.out.println("\nAfter leakage : ");
			System.out.println("\t Current Size : "+currentStorage+"\t Remaining Size : "+(BUCKET_STORAGE-currentStorage)+"\t Total Size : "+BUCKET_STORAGE);
			currentStorage = backupStorage;
		}
		
		System.out.println("\n***************************************************************");
		
	}

}



