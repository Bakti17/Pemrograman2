import java.util.Scanner;
public class Balok{
    Scanner input = new Scanner (System.in);
     private float p, l, t;

    public Balok(){
        System.out.print("Panjang = ") ;
        float p = input.nextFloat();
        input.nextLine();

        System.out.print("Lebar = ");
        float l = input.nextFloat();
        input.nextLine();

        System.out.print("Tinggi = ");
        float t = input.nextFloat();
        input.nextLine();

    }
         private float kel()
        {
            return  4*(p+l+t);
        }

         private float luas ()
        {
        return (2*p*l) + (2*p*t) + (2*l*t);
        }

        private float vol ()
        {
        return  p*l*t;
        }

    public static void main(String[] args)
    {
        System.out.println("##### Program OOP - Balok #####");
        System.out.println("\n1. Form Input Balok Kecil ");
        Balok BalokKecil = new Balok();
        System.out.println("\n2. Form Input Balok Sedang ");
        Balok BalokSedang = new Balok();
        System.out.println("\n3. Form Input Balok Besar ");
        Balok BalokBesar = new Balok();
        System.out.println("=========================");
        System.out.println("====Hasil Perhitungan====");
        System.out.println("\t1. Balok kecil");
        System.out.println("\tKeliling " + BalokKecil.kel());
        System.out.println("\tLuas " + BalokKecil.luas());
        System.out.println("\tVolumee " + BalokKecil.vol());

        System.out.println("\t1. Balok sedang");
        System.out.println("\tKeliling " + BalokSedang.kel());
        System.out.println("\tLuas " + BalokSedang.luas());
        System.out.println("\tVolumee " + BalokKecil.vol());

        System.out.println("\t1. Balok kecil");
        System.out.println("\tKeliling " + BalokBesar.kel());
        System.out.println("\tLuas " + BalokBesar.luas());
        System.out.println("\tVolumee " + BalokBesar.vol());
    }
}