package jschulz;

/**
 * Testet alle Klassen der Verschlüsselung
 * @author Johannes Schulz
 * @version 28-11-2021
 */
public class TestMac {
    public static void main(String[] args) {
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
