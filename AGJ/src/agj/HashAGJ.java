package agj;

import java.security.DigestException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;

/**
 *
 * @author leandroc0rreia
 */
public class HashAGJ {

    private String nums;

    private byte[] salt;
    private Random r;
    private String meuSal;

    private MessageDigest md;
    private byte[] numHashed;
    private byte[] numHashedByte;

    /**
     * Construtor da classe HashAGJ
     */
    public HashAGJ() {
        r = new Random();
        this.meuSal = "";
        salt = new byte[16];

    }

    /**
     * Cria a hash
     *
     * @param numsCart
     * @return
     */
    public String criarHash(String numsCart) {

        r.nextBytes(salt);

        for (int i = 0; i < salt.length; i++) {
            meuSal = meuSal + Byte.toString(salt[i]);
        }

        String soma = meuSal + numsCart;

        numHashed = soma.getBytes();
        numHashedByte = md.digest(numHashed);

        nums = Base64.getEncoder().encodeToString(numHashedByte);

        return nums;
    }

    /**
     * Retorna o número encriptado
     *
     * @return nums
     */
    public String getNums() {
        return nums;
    }

    /**
     * Retorna o salt
     *
     * @return salt
     */
    public byte[] getSalt() {
        return salt;
    }
}
