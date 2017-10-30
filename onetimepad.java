import java.util.Scanner;
import java.lang.Character;
public class onetimepad {



    public static int charToInt(char l) {
		return(int)l;
    }

    public static char intToChar(int i) {
		
    	return(char)i;
    }

    public static String encipher(String original, String onetimepad) {
        int char1;
        int char2;
        char encodedChar;
        int combinedVal;
        String returnString = "";

        for (int i = 0; i < original.length(); i++){
            char1 = charToInt(original.charAt(i));
            char2 = charToInt(onetimepad.charAt(i));
            combinedVal = char1 + char2;
            encodedChar = intToChar(combinedVal);
            returnString += String.valueOf(encodedChar);
            System.out.println(returnString);
        }

        return returnString;
        system.out.println("made it out");

    }

	public static String decipher(String cryptText, String onetimepad) {
        /*int textChar;
        int cipherVal;
        int keyVal;
        char keyChar;
        char encryptedVal;
        String returnText ="";

        for (int i = 0; i < cryptText.length(); i++){
            textChar = intToChar(cryptText.charAt(i));
            keyChar = onetimepad.charAt(i);
            keyVal = Character.getNumericValue(keyChar);
            cipherVal = textChar - keyVal;
            encryptedVal = intToChar(cipherVal);
            returnText += encryptedVal;
        }
        return returnText; */
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
                toDecrypt = encipher(toEncrypt, key);
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
