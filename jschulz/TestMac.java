package jschulz;

public class TestMac {
    public static void main(String[] args) {
        MonoAlphabeticCipher mac = new MonoAlphabeticCipher();        
        System.out.println(mac.encrypt("hallo123!"));
        System.out.println(mac.decrypt("hallo123!"));

        ShiftCipher sc = new ShiftCipher(5);
        System.out.println(sc.encrypt("hallo123!"));
        System.out.println(sc.decrypt("cvggj123!"));

        sc.setShiftValue(-5);
        System.out.println(sc.encrypt("hallo123!"));
        System.out.println(sc.decrypt("mfqqt123!"));
    }
}
