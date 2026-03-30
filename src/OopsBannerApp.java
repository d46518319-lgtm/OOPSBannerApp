public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline initialization using String.join()
        String[] lines = {
            String.join("   ", " *** ", " *** ", " ***** ", " ***** "),
            String.join("   ", "*   *", "*   *", "*   * ", "*     "),
            String.join("   ", "*   *", "*   *", "*   * ", "*     "),
            String.join("   ", "*   *", "*   *", "***** ", "***** "),
            String.join("   ", "*   *", "*   *", "*     ", "*     "),
            String.join("   ", "*   *", "*   *", "*     ", "*     "),
            String.join("   ", " *** ", " *** ", "*     ", "***** ")
        };

        // For-each loop to print
        for (String line : lines) {
            System.out.println(line);
        }
    }
}

