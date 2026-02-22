public class OOPSBannerAppUC3 {

    public static void main(String[] args) {

        String[] row1 = {
                " ***  ", " ***  ", "****** ", "***** "
        };

        String[] row2 = {
                "*   * ", "*   * ", "*   * ", "*    "
        };

        String[] row3 = {
                "*   * ", "*   * ", "****** ", "**** "
        };

        String[] row4 = {
                "*   * ", "*   * ", "*      ", "    *"
        };

        String[] row5 = {
                " ***  ", " ***  ", "*      ", "**** "
        };

        // Printing using String.join()
        System.out.println(String.join("  ", row1));
        System.out.println(String.join("  ", row2));
        System.out.println(String.join("  ", row3));
        System.out.println(String.join("  ", row4));
        System.out.println(String.join("  ", row5));
    }
}