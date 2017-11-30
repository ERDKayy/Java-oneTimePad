import java.util.Scanner;
import java.lang.Character;
public class onetimepad {

    public static int charToInt(char l) {
		int ascii = (int) l;
		return ascii;
    }

    public static char intToChar(int i) {
		char result = (char)i;
		return result;
    }


	public static String encipher(String string, String key) {
        final byte[] text = string.getBytes("UTF-8");
        final byte[] encoded = new byte[text.length];

		for (int i = 0; i < text.length; i++) {
			encoded[i] = (byte) (text[i] ^ key[i]);
		}
        String encipheredString = new String(encoded, "UTF-8");
        return encipheredString;
	}

	public static String decipher(String string, String key) {
        final byte[] text = string.getBytes("UTF-8");
        final byte[] deciphered = new byte[text.length];

        for (int i = 0; i < text.length; i ++) {
            deciphered = (byte) (text[i] ^ key[i]);
        }
        String decipheredString = new String(deciphered, "UTF-8");
        return decipheredString;
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
                toEncrypt += sc.nextLine();
                System.out.println("char " + toEncrypt);
                toDecrypt = encipher(toEncrypt, key);
                System.out.println("Encrypted:" + toDecrypt);
            }

            else if (input == 3) {
                System.out.println("Decryption...");
                //toDecrypt = sc.next();
                //toDecrypt += sc.nextLine();
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
