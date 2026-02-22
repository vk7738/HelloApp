public class OOPSBannerAppUC4 {

    public static void main(String[] args) {

        // Store entire banner in a String array
        String[] banner = {

            " ***     ***    ******    ***** ",
            "*   *   *   *   *   *     *     ",
            "*   *   *   *   ******    ****  ",
            "*   *   *   *   *             * ",
            " ***     ***    *         ***** "
        };

        // Print using loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}