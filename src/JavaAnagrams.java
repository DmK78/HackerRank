import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {
        if (a.length()!=b.length()){
            return false;
        }
        int countSymbolsA = 0;
        int countSymbolsB = 0;
        a = a.toLowerCase();
        b = b.toLowerCase();
        char aSmb = ' ';
        for (int aPos = 0; aPos < a.length(); aPos++) {
            aSmb = a.charAt(aPos);
            for (int bPos = 0; bPos < b.length(); bPos++) {
                if (a.charAt(bPos) == aSmb) {
                    countSymbolsA++;
                }
                if (b.charAt(bPos) == aSmb) {
                    countSymbolsB++;
                }
            }
            if (countSymbolsA != countSymbolsB) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");

    }
}
