package jschulz;

public class TestMac {
    public static void main(String[] args) {
        //MonoAlphabeticCipher
        System.out.println("MonoAlphabeticCipher");
        MonoAlphabeticCipher mac = new MonoAlphabeticCipher();        
        System.out.println(mac.encrypt("hallo123!"));
        System.out.println(mac.decrypt("hallo123!"));

        //ShiftCipher
        System.out.println("\nShiftCipher");
        ShiftCipher sc = new ShiftCipher(5);
        System.out.println(sc.encrypt("hallo123!"));
        System.out.println(sc.decrypt("cvggj123!"));
        sc.setShiftValue(-5);
        System.out.println(sc.encrypt("hallo123!"));
        System.out.println(sc.decrypt("mfqqt123!"));
        
        //SubstitutionCipher
        System.out.println("\nSubstitutionCipher");
        SubstitutionCipher subc = new SubstitutionCipher("qwertzuiopasdfghjklyxcvbnm");
        System.out.println(subc.encrypt("hallo123!"));
        System.out.println(subc.decrypt("pkssi123!"));
        subc.setSecretAlphabet("qjklyxcvbnmwertzuiopasdfgh");
        System.out.println(subc.encrypt("hallo123!"));
        System.out.println(subc.decrypt("zudds123!"));
        System.out.println("l");
    }
}
