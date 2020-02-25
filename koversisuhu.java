import java.util.Scanner;
public class konversisuhu{
    static double fk(double suhu){
      return (suhu-32)*5/9+273.15;
    }
    static double fc(double suhu){
     return (suhu-32)*5/9;
    }
    static double ck(double suhu){
        return suhu+273.15;
    }
    static double cf(double suhu){
        return suhu*9/5+32;
    }
    static double kc(double suhu){
        return suhu-273.15;
    }
    static double kf(double suhu){
        return (suhu-273.15)*9/5+32;
    }
    public static void main(String[] args) {
        Scanner pil = new Scanner (System.in);
        double suhu;
        int pilsuhu ;
        String loop;
        boolean x,y;
        x=false;
        y=true;
        do{
        System.out.println("Berikut daftar satuan suhu = \n1. Celcius \n2. Fahrenheit \n3. Kelvin ");
        System.out.print("Masukkan pilihan satuan suhu yang akan anda masukan = ");
        pilsuhu = pil.nextInt();
        if (pilsuhu>0&& pilsuhu <4) {
            if (pilsuhu == 1) {
                System.out.print("Masukkan suhu yang akan anda konversi (Celcius) = ");
                suhu = pil.nextDouble();
                System.out.println("Hasil koversi suhu anda adalah " + ck(suhu) + " Kelvin");
                System.out.println("Hasil koversi suhu anda adalah " + cf(suhu) + " Fahrenheit");
            } else if (pilsuhu == 2) {
                System.out.print("Masukkan suhu yang akan anda konversi (Fahrenheit) = ");
                suhu = pil.nextDouble();
                System.out.println("Hasil koversi suhu anda adalah " + fk(suhu) + " Kelvin");
                System.out.println("Hasil koversi suhu anda adalah " + fc(suhu) + " Celcius");
            } else if (pilsuhu == 3) {
                System.out.print("Masukkan suhu yang akan anda konversi (Kelvin) = ");
                suhu = pil.nextDouble();
                System.out.println("Hasil koversi suhu anda adalah " + kf(suhu) + " Fahrenheit");
                System.out.println("Hasil koversi suhu anda adalah " + kc(suhu) + " Celcius");
            }
            System.out.println("Apakah anda ingin mengetahui yang lainnya?(y/n)");
            loop = pil.next();
            if (loop.equals("y") || loop.equals("Y")) {
                y = true;
            }
            else if (loop.equals("n") || loop.equals("N")) {
                y = false;
            }
        }
        else {
            System.out.println("Tolong masukkan data yang benar");
        }
        } while (x=y);
    }

}
