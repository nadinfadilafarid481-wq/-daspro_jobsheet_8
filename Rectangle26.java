import java.util.Scanner;

public class Rectangle26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;

        System.out.println("masukkan jumlah baris: ");
        baris = sc.nextInt();
        System.out.println("masukkan jumlah kolom: ");
        kolom = sc.nextInt();

        for (int i = 1; i <= baris ; i++){
            for (int j = 1;j <= kolom; j++){
                System.out.print("*");
            }
            System.out.println( );
        }
        sc.close();   
    }
}