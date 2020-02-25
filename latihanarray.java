import java.util.*;
public class latihanarray
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan batas array 1 anda = ");
        int batas1=scan.nextInt();
        float[] nilai1 = new float[batas1];
        for(int i=1;i<=batas1;i++)
        {
            System.out.println("Masukkan nilai array pertama anda = ");
            nilai1[i-1] =scan.nextFloat();
        }
        System.out.println("===================================================");
        System.out.println("Masukkan batas array nilai2 anda = ");
        int batas2=scan.nextInt();
        float[] nilai2 = new float[batas2];
        for(int i=1;i<=batas2;i++)
        {
            System.out.println("Masukkan nilai array kedua anda anda = ");
            nilai2[i-1] =scan.nextFloat();
        }

        for(int i=1;i<=batas1;i++)
        {
            System.out.println("Nilai array nilai 1 ke "+ i + " adalah " +nilai1[i-1]);
        }
        for(int i=1;i<=batas2;i++)
        {
            System.out.println("Nilai array nilai 2 ke "+ i + " adalah " +nilai2[i-1]);
        }

    }
}