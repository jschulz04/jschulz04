package jschulz;

public class SubstitutionCipher extends MonoAlphabeticCipher{
    SubstitutionCipher(String secretAlphabet) {
        super();
        setSecretAlphabet(secretAlphabet);
    }
    public void setSecretAlphabet(String secretAlphabet) {
        super.setSecretAlphabet(secretAlphabet);
    }
}
