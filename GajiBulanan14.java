import java.util.Scanner;

public class GajiBulanan14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah jam kerja: ");
        double jamKerja = sc.nextDouble();
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = sc.nextDouble();

        double gajiSebelumPajak = jamKerja * upahPerJam;
        double bonus = 0.10 * gajiSebelumPajak;
        double totalPajak = 0.05 * (gajiSebelumPajak + bonus);
        double gajiBersih = (gajiSebelumPajak + bonus) - totalPajak;

        System.out.println("Gaji bersih bulanan karyawan: Rp " + gajiBersih);
        

    }
}
