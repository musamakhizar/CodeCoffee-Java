
public class CaesarCipher {

	private String plainText; // plaintext refers to the unencrypted message
	private String chiperText; // ciphertext to the encrypted message
	private int shift; // the fixed shift position 
	
	//-- Constructors --//
	
	public CaesarCipher() {
	this.chiperText="";
	}
	
	public CaesarCipher(String plainText, int shift) {
		this.plainText = plainText;
		this.chiperText = "";
		this.shift = shift;
	}
	
	public CaesarCipher(String plainText,String chiperText, int shift) {
		this.plainText = plainText;
		this.chiperText = chiperText;
		this.shift = shift;
	}

	//-- Setters and Getters --//
	
	public String getPlainText() {
		return plainText;
	}

	public void setPlainText(String plainText) {
		this.plainText = plainText;
	}

	public String getChiperText() {
		return chiperText;
	}

	public void setChiperText(String chiperText) {
		this.chiperText = chiperText;
	}

	public int getShift() {
		return shift;
	}

	public void setShift(int shift) {
		this.shift = shift;
	}
	
	//-- Encryption  --//
	
	public String chipEncryptor(String plainText,int shift) {
		
		// Get the length of the text and interate a for loop over it
		
		for (int i = 0; i < plainText.length(); i++) {
			// -- According to formula E=(x+n)mod 26-- //
			/*
			 * Here we use the following procedure
			 * 1- Get the character at the current index of string using charAt(index) method "plainText.charAt(i)"   
			 * 2- Type cast that char to integer to get its ASCII value "(int) plainText.charAt(i)"
			 * 3- Now apply the formula of this value "( x(char) + n(shift) )mod 26" 
			 * [The imp here is that we add and subtract a number 97 to get a proper position according to ASCII scheme 
			 * so we can get the proper char when we apply shift to it "((int) plainText.charAt(i) + shift -97)%26 + 97" ] 
			 * 4- At last we type cast the shifted number back to charter so we get the proper shifted character according to ASCII scheme
			 * 5- And stored this in our object's chiper Text 
			 */
			
			if(plainText.equals(plainText.toLowerCase())) // condition to check that text is uppercased or lowercases 
			{
				this.chiperText+=(char)(((int) plainText.charAt(i) + shift -97)%26 + 97);
			}
			else {
				this.chiperText+=(char)(((int) plainText.charAt(i) + shift -65)%26 + 65);
			}
			
			
			
		}
		
		System.out.println("\n-- Encrypted Successfully --");
		return this.chiperText;
	}
	
	
	//-- Decryption --//
	
	public String chipDecryptor() {
		return chiperText;
	}
}
