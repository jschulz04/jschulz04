package jschulz;

public class MonoAlphabeticCipher implements Cipher{
    private String secretAlphabet = "";
    private String standardAlphabet = "abcdefghijklmnopqrstuvwxyz";

    MonoAlphabeticCipher() {
        secretAlphabet = "abcdefghijklmnopqrstuvwxyz";
    }

    public String getSecretAlphabet() {
        return secretAlphabet;
    }

    protected void setSecretAlphabet(String secretAlphabet) {
        this.secretAlphabet = secretAlphabet;
    }

    @Override
    public String encrypt(String input) {
        String output ="";
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            int pos = secretAlphabet.indexOf(c);
            if (pos != -1) {
                output+=standardAlphabet.charAt(pos);
            } else {
                output+=c;
            }
        }
        return output;
    }

    @Override 
    public String decrypt(String text){
        String output ="";
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int pos = standardAlphabet.indexOf(c);
            if (pos != -1) {
                output+=secretAlphabet.charAt(pos);
            } else {
                output+=c;
            }
        }
        return output;
    }
    
}