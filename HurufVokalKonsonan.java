import java.util.Scanner;

public class HurufVokalKonsonan{

  static String hapusHurufVokal(String paramTeks)
  {
   String konsonan="";
    for (char karakter : paramTeks.toCharArray()){
      if(karakter != 'a' && karakter != 'i' && karakter != 'u' && karakter != 'e' && karakter != 'o' ){
       konsonan += karakter;

      }
    }
    return konsonan;
  }

  public static void main(String args[])
  {
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan teks = ");
    String text = scan.nextLine();
    text = text.toLowerCase().trim();
    System.out.println(hapusHurufVokal(text));
  }

}