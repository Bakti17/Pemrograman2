import java.sql.SQLOutput;
import java.util.Scanner;
public class GanjilGenap
{
    static String apakahgGanjil(int Bil)
    {  String hasil;
        if (Bil%2==0)
        {
            hasil="Genap";
        }
        else
        {
            hasil="Ganjil";
        }
     return hasil;
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Masukkan angka yang inginkan = ");
        int Bil= scanner.nextInt();
        System.out.println("Angka yang anda masukkan adalah "+ apakahgGanjil(Bil));

    }
}