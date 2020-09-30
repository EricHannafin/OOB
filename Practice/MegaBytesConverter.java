public class MegaBytesConverter {


    public static void main(String[] args) {

        printMegaBytesandKiloBytes(5000);


    }

    public static void printMegaBytesandKiloBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid input");
        } else {
            double megaBytes = kiloBytes / 1024;
            double megaRemain = kiloBytes % 1024;
            System.out.println(kiloBytes + "MB = " + megaBytes + "MB and " + megaRemain + "KB");

        }
    }
}
