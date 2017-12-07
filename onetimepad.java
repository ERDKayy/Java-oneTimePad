import java.util.Scanner;
import java.lang.Character;

public class onetimepad {
    public static int charToInt(char l) {

		return(int)l;
    }
    public static char intToChar(int i) {
    	return(char)i;
    }
    public static String encrypt(String original, String key) {

        char returnChar, selectedChar;
    	String encipheredText = "";
        int originalText, newText, shifter;
        
    	for (int i = 0; i < original.length(); i++){
    		originalText =  charToInt(original.charAt(i));
    		selectedChar = key.charAt(i);
    		shifter = Character.getNumericValue(selectedChar);
    		newText = originalText + shifter;
    		returnChar = intToChar(newText);
    		encipheredText += String.valueOf(returnChar);
    	}
    	return encipheredText;
    }
	public static String decrypt(String encryptedText, String key) {
		int shifter, originalText, newText;
    	char selectedChar, returnChar;
    	String encipheredText = "";
    	for (int i = 0; i < encryptedText.length(); i++){
    		originalText =  charToInt(encryptedText.charAt(i));
    		selectedChar = key.charAt(i);
    		shifter = Character.getNumericValue(selectedChar);
    		newText = originalText - shifter;
    		returnChar = intToChar(newText);
    		encipheredText += String.valueOf(returnChar);
    	}
		return encipheredText;
	}
    public static void main(String[] args) {
		boolean quit = false;
		String key = "";
		String to_encrypt = "";
		String to_decrypt = "";
		int input;
		String ciphertext = "";
		while (quit != true){
			System.out.println(" 1. Key \n 2. Encrypt \n 3. Decrpyt \n 4. Quit");
			Scanner arg = new Scanner(System.in);
			input = arg.nextInt();
			if (input == 1){
				System.out.println("Key: ");
				key = arg.next();
				key += arg.nextLine();
			}
			else if (input == 2){
				System.out.println("Enter text to be encrypted:");
				to_encrypt = arg.next();
				to_encrypt += arg.nextLine();
				if (key.length() != to_encrypt.length()){
                    throw new IllegalArgumentException("Non-Matching key and text length.");
                };
                to_decrypt = encrypt(to_encrypt, key);
                System.out.println(to_decrypt);
			}
			else if (input == 3){
				ciphertext = decrypt(to_decrypt, key);
				System.out.println(ciphertext);
			}
			else if (input == 4){
				quit = true;
			}
			else System.out.println("Invalid.");
		}
    }

}