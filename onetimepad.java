import java.util.Scanner;
import java.lang.Character;
public class onetimepad {

    public static int charToInt(char l) {
		int ascii = (int) character;
		return ascii;
    }

    public static char intToChar(int i) {
		char result = Character.toString(i);
		return result;
    }

	public static String xor(String string, String key) {
		char charString[] = string.toCharArray();
		char charKey[] = key.toCharArray();
		char results[];
		int char1, char2, result;
		char enciphered;
		
		for (int i = 0; i < charString.length; i++) {
			char1 = charToInt(charString[i]);
			char2 = charToInt(charKey[i]);
			
			result = char1 ^ char2;
			enciphered = intToChar(result);
			
			val = Integer.toBinary(charString[i]);
			val2 = Integer.toBinary(charKey[i]);			
			xorResult = val ^ val2;
		}
	}
	
    public static String encipher(String original, String onetimepad) {
		
		
    }

	public static String decipher(String cryptText, String onetimepad) {

        return cryptText;
	}


    public static void main(String[] args) throws IllegalArgumentException{
        boolean quit = false;
        String key = "";
        String toEncrypt = "";
        String toDecrypt = "";
        int input;
        String decrypted = "";


        while (quit != true) {
            System.out.println("________________Menu________________ \n 1. Encryption Key \n 2. Encrypt \n 3. Decrypt \n 4. Quit");
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();


            if (input == 1){
                System.out.println("Enter encryption key...");
                key = sc.next();
                key += sc.nextLine();
                System.out.println("Your key is..." + key);
            }

            else if (input == 2) {
                System.out.println("Enter text to encrypt...");
                toEncrypt = sc.next();
                toEncrypt = sc.nextLine();
                toDecrypt = xor(toEncrypt, key);
                System.out.println(toDecrypt);
                System.out.println(toEncrypt);
            }

            else if (input == 3) {
                System.out.println("Decryption...");
                toDecrypt = sc.next();
                toDecrypt += sc.nextLine();
                decrypted = decipher(toDecrypt, key);
                System.out.println(decrypted);
            }

            else if (input == 4) {
                quit = true;
                sc.close();
            }

            else System.out.println("Invalid input");
        }
        //String ciphertext = encipher("this is my message", "this is my secret key");
		//System.out.print(ciphertext);
    }
}
