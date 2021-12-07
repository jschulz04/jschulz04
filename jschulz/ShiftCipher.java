package jschulz;

public class ShiftCipher extends MonoAlphabeticCipher{
    ShiftCipher(int value) {
        super();
        setShiftValue(value);
    }
    public void setShiftValue(int value) {
        String standardAlphabet = "abcdefghijklmnopqrstuvwxyz";
        String secretAlphabet ="";
        value=value%26;
        if(value<0) {
            value=26+value;
        }
        secretAlphabet+=standardAlphabet.substring(value, 26);
        secretAlphabet+=standardAlphabet.substring(0,value);
        setSecretAlphabet(secretAlphabet);
    }
}