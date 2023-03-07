import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Cryptography {

    //For each plaintext letter "p" substitute the ciphertext letter "C"
    // C = K(p, k) % 26 = (p + k) % 26
    // p = K(C, k) % 26 = (C - k) % 26

    public String toCipherText(File file, int key) {

        StringBuilder cipherCode = new StringBuilder();
        try {
            Scanner scanner = new Scanner(file);
            char[] characters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o',
                    'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

            while (scanner.hasNext()) {
                String str = scanner.nextLine();
                for (int i = 0; i < str.length(); i++) {
                    int newPosition = ((str.charAt(i) - 'a') + key) % 26;
                    cipherCode.append(characters[newPosition]);
                }
            }

        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        return String.valueOf(cipherCode);
    }


    public void writeToFile(String cipher) throws IOException {
        FileWriter fileWriter = new FileWriter("ciphertext.txt");
        fileWriter.write(cipher);
        fileWriter.close();

    }

}

