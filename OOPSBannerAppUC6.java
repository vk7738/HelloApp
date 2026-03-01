public class OOPSBannerAppUC6 {

    // Method for letter O
    static String O(int row) {
        String[] O = {
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
        };
        return O[row];
    }

    // Method for letter P
    static String P(int row) {
        String[] P = {
                "***** ",
                "** ** ",
                "** ** ",
                "***** ",
                "**    ",
                "**    ",
                "**    "
        };
        return P[row];
    }

    // Method for letter S
    static String S(int row) {
        String[] S = {
                " *****",
                "**    ",
                "**    ",
                " **** ",
                "    **",
                "    **",
                "***** "
        };
        return S[row];
    }

    public static void main(String[] args) {

        // Build banner using methods
        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join("   ",
                    O(i),   // First O
                    O(i),   // Second O
                    P(i),   // P
                    S(i));  // S
        }

        // Print banner using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}