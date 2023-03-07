import java.io.File;
import java.io.IOException;

public class Cryptology {
    public static void main(String[] args) throws IOException {
        Cryptography cryptography = new Cryptography();
        String cipherText = cryptography.toCipherText(new File("assets/plaintext.txt"), 3);
        System.out.println(cipherText);
        cryptography.writeToFile(cipherText);

    }
}