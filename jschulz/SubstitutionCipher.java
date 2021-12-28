package jschulz;

/**
 * Verschlüsselt den Text mithilfe eines neuen Alphabets
 * @author Johannes Schulz
 * @version 28-11-2021
 */
public class SubstitutionCipher extends MonoAlphabeticCipher{
    SubstitutionCipher(String secretAlphabet) {
        super();
        setSecretAlphabet(secretAlphabet);
    }

    public void setSecretAlphabet(String secretAlphabet) {
        super.setSecretAlphabet(secretAlphabet);
    }
}
