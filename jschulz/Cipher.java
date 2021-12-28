package jschulz;

/**
 * Cipher interface
 * @author Johannes Schulz
 * @version 28-11-2021
 */
public interface Cipher {
    public String encrypt(String input);
    public String decrypt(String input);
}
