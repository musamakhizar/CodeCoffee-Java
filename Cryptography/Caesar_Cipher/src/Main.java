// A Java program to illustrate Caesar Cipher Technique 

/*
 * The Caesar Cipher technique is one of the earliest and simplest method of encryption technique. 
 * It’s simply a type of substitution cipher, i.e., 
 * each letter of a given text is replaced by a letter some fixed number of positions down the alphabet
 */

// Plaintext refers to the unencrypted message
// Shift refer to position
// Ciphertext to the encrypted message

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);// We will use this scanner object to get input from user(keyboard) at run time 
		
		CaesarCipher crypObj = new CaesarCipher();
		
		System.out.print("Enter Text : ");
		crypObj.setPlainText(input.next()); // By using scanner object we get input from user and stored it in CaesarChiper object's plain text
		
		System.out.print("Enter Shift (only integer no.) : "); 
		crypObj.setShift(input.nextInt()); // same for shift but this time we use nextInt to get the integer inputs
		
		crypObj.chipEncryptor(crypObj.getPlainText(), crypObj.getShift()); //by using encryption function we encrypt the message
		
		System.out.println("\nText: " + crypObj.getPlainText()
				+ "\nshift: " + crypObj.getShift()
				+ "\nCipher: " + crypObj.getChiperText());
		
	}
}
