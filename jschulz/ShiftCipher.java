package jschulz;

public class ShiftCipher extends MonoAlphabeticCipher{
    ShiftCipher(int value) {
        super();
        setShiftValue(value);
    }
    public void setShiftValue(int value) {
        String standardAlphabet = getSecretAlphabet();
        String secretAlphabet ="";
        value=value%standardAlphabet.length();
        if(value<0) {
            value=standardAlphabet.length()+value;
        }
        secretAlphabet+=standardAlphabet.substring(value, standardAlphabet.length());
        secretAlphabet+=standardAlphabet.substring(0,value);
        setSecretAlphabet(secretAlphabet);
    }
}