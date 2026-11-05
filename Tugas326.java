import java.util.Scanner;

public class Tugas326 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahToko;
        do {
            System.out.print("Masukkan jumlah toko: ");
            jumlahToko = sc.nextInt();
            if (jumlahToko < 1) {
                System.out.println("Jumlah toko minimal 1");
            }
        } while (jumlahToko < 1);

        int totalSemua = 0;
        int barangTerbanyak = -1;
        int tokoTerbanyak = 0;
        String rekap = "";

        for (int toko = 1; toko <= jumlahToko; toko++) {
            int jumlahPelanggan;
            do {
                System.out.print("Toko " + toko + " - jumlah pelanggan: ");
                jumlahPelanggan = sc.nextInt();
                if (jumlahPelanggan < 0) {
                    System.out.println("Tidak boleh negatif.");
                }
            } while (jumlahPelanggan < 0);

            int totalBarang = 0;
            for (int p = 1; p <= jumlahPelanggan; p++) {
                int barang;
                do {
                    System.out.print("  Pelanggan " + p + " - jumlah barang: ");
                    barang = sc.nextInt();
                    if (barang < 0) {
                        System.out.println("  Tidak boleh negatif.");
                    }
                } while (barang < 0);
                totalBarang += barang;
            }

            rekap += "Toko " + toko + " - pelanggan: " + jumlahPelanggan + ", total barang: " + totalBarang + "\n";
            totalSemua += totalBarang;

            if (totalBarang > barangTerbanyak) {
                barangTerbanyak = totalBarang;
                tokoTerbanyak = toko;
            }
        }

        System.out.println();
        System.out.print(rekap);
        System.out.println("Total barang seluruh toko: " + totalSemua);
        System.out.println("Toko dengan barang terbanyak: " + tokoTerbanyak);
        sc.close();
    }
}
    
