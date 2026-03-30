class OopsBannerApp {
    // print oops banner
    public static void main(String[] args) 
{
        // Array to store 7 lines of banner
        String[] lines = new String[7];

        lines[0] = " ***     ***     *****    ***** ";
        lines[1] = "*   *   *   *    *   *    *     ";
        lines[2] = "*   *   *   *    *   *    *     ";
        lines[3] = "*   *   *   *    *****    ***** ";
        lines[4] = "*   *   *   *    *        *     ";
        lines[5] = "*   *   *   *    *        *     ";
        lines[6] = " ***     ***     *        ***** ";

        // Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }

