package jschulz;

/**
 * MonoAlphabeticCipher
 */
public class MonoAlphabeticCipher implements Cipher{
    private String secretAlphabet = "";

    MonoAlphabeticCipher() {
        secretAlphabet = "abcdefghijklmnopqrstuvwxyz";
    }

    public String getSecretAlphabet() {
        return secretAlphabet;
    }

    public void setSecretAlphabet(String secretAlphabet) {
        this.secretAlphabet = secretAlphabet;
    }

    @Override
    public String encrypt(String input) {
        int tempchar;
        String output ="";
        input = input.toLowerCase();
        for (int i = 0; i < input.length(); i++) {
            tempchar = input.charAt(i);
            if(tempchar >= 97 && tempchar <= 122 ) {
                tempchar -= 97;
                tempchar = secretAlphabet.charAt(tempchar);
                output += (char)tempchar+"";
            } else {
                output += (char)tempchar+"";
            }
        }
        return output;
    }

    @Override 
    public String decrypt(String text){
        String alphabet="abcdefghijklmnopqrstuvwxyz";
        String output="";
        text=text.toLowerCase();
        for(int i=0;i<text.length();i++){
            for(int x=0;x<this.secretAlphabet.length();x++){
                if(this.secretAlphabet.charAt(x) == (text.charAt(i))){
                    output=output+alphabet.charAt(x);
                }
            }
        }
        return output;
    }
    
}