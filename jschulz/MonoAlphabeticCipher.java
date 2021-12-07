package jschulz;

public class MonoAlphabeticCipher implements Cipher{
    private String secretAlphabet = "";
    private String standardAlphabet = "abcdefghijklmnopqrstuvwxyz";

    MonoAlphabeticCipher() {
        secretAlphabet = standardAlphabet;
    }

    public String getSecretAlphabet() {
        return secretAlphabet;
    }

    protected void setSecretAlphabet(String secretAlphabet) {
        if(secretAlphabet.length() == standardAlphabet.length()) {
            for(int i=0;i<secretAlphabet.length();i++){
                for(int x=i+1;x<secretAlphabet.length();x++){
                    if(secretAlphabet.charAt(i)==secretAlphabet.charAt(x)){
                        break;
                    }
                }
            }
            this.secretAlphabet= secretAlphabet.toLowerCase();
        }
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