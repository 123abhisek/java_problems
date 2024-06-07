package Lab_prog;

import java.util.Scanner;
import java.util.zip.CRC32;

public class Program {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String input_bit = "10111001"; // input dividend   // 2973057520
		String key = "1101"; // input key

		String input_copy = input_bit;

		for (int i = 0; i < key.length() - 1; i++) {
			input_bit += '0';
		}

		CRC32 crc = new CRC32();
		crc.update(input_bit.getBytes());
		long crcValue = crc.getValue();

		System.out.println("CRC32 Value: " + crcValue);

		String crcBinary = Long.toBinaryString(crcValue);
		while (crcBinary.length() < key.length() - 1) {
			crcBinary = "0" + crcBinary;
		}

		System.out.println("\n\nDivisor : " + input_bit + " , divident : " + key);
		System.out.println("\nSender Side ......");

		String remainder = crcBinary.substring(crcBinary.length() - (key.length() - 1));

		System.out.println("\nRemainder: " + remainder);

		String final_result = recieverSide(key, input_copy, remainder); // perform the receiver side

		// checks for errors
		if (final_result.contains("1")) {
			System.out.println("The remainder doesn't contain all zeros, hence errors");
		} else {
			System.out.println("Correct message received. The remainder contains all zeros, hence no errors");
		}
	}

	public static String recieverSide(String key, String divident, String senderKey) {

		for (int i = 0; i < senderKey.length(); i++) {
			divident += senderKey.charAt(i);
		}

		System.out.println("Encoded Data (Data + Remainder) : " + divident);

		int divisor_Len = key.length();
		String divisor = key;

		String temp = divident.substring(0, divisor_Len);

		System.out.println("\n\nDivisor : " + divisor + " , divident : " + divident);
		System.out.println("\nReceiver Side ......");
		System.out.print("\nPlease enter the correct dividend : ");

		String input = sc.nextLine();
		divident = input;

		CRC32 crc = new CRC32();
		crc.update(divident.getBytes());
		long crcValue = crc.getValue();

		String crcBinary = Long.toBinaryString(crcValue);
		while (crcBinary.length() < key.length() - 1) {
			crcBinary = "0" + crcBinary;
		}

		String remainder = crcBinary.substring(crcBinary.length() - (key.length() - 1));

		System.out.println("Remainder : " + remainder);
		return remainder;
	}
}