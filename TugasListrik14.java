import java.util.Scanner;

public class TugasListrik14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double tarifPerKwh = 1500;
        System.out.print("Masukkan jumlah penggunaan listrik (kWh): ");
        double penggunaan = input.nextDouble();

        double totalTagihan = penggunaan * tarifPerKwh;
        boolean melebihiBatas = penggunaan >= 500;

        System.out.println("Total tagihan listrik: Rp " + totalTagihan);
        System.out.println("Apakah penggunaan melebihi 500 kWh? " + melebihiBatas);

    }
}