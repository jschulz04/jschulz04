package jschulz;

public class TestMac {
    public static void main(String[] args) {
        MonoAlphabeticCipher mac = new MonoAlphabeticCipher();
        
        System.out.println(mac.encrypt("hallo123!"));
        System.out.println(mac.decrypt("niggrs123!"));
    }
}
