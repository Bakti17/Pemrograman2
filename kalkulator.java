import java.util.*;
public class kalkulator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double nomer1, nomer2;
        int pilihan;
        System.out.println("1. Kali \n2. Tambah \n3. Kurang \n4. Bagi ");
        System.out.print("Masukkan operasi anda  = ");
        pilihan = read.nextInt();
        System.out.print("Masukkan angka anda = ");
        nomer1 = read.nextDouble();
        System.out.print("Masukkan angka kedua anda = ");
        nomer2 = read.nextDouble();

            if (pilihan == 1){
               System.out.println ("hasilnya " + kali (nomer1,nomer2));
            }
            else if (pilihan == 2){
                System.out.println("Hasilnya "+tambah (nomer1, nomer2));
            }
            else if (pilihan == 3){
                System.out.println("Hasilnya "+kurang(nomer1, nomer2));
            }
            else if (pilihan == 4){
                System.out.println("Hasilnya "+bagi(nomer1, nomer2));
            }
    }
        static  double kali(double nomer1, double nomer2){
        double hasil = nomer1 * nomer2;
        return hasil;
        }
        static double tambah(double nomer1, double nomer2){
        double hasil = nomer1+nomer2;
        return hasil;
        }
        static double kurang(double nomer1, double nomer2){
        double hasil =nomer1-nomer2;
        return hasil;
        }
        static double bagi(double nomer1, double nomer2){
        double hasil= nomer1/nomer2;
        return hasil;
        }


}