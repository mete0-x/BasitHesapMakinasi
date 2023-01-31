
import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        
      //Switch Case Kullanarak 4 işlem yapan hesap makinesi tasarlama.
       
       Scanner scanner = new Scanner(System.in);
        System.out.println("****************************************************");
        String islemler = "1. Toplama işlemi\n"
                      +"2. Çıkarma işlemi\n"
                      +"3. Çarpma işlemi\n"
                      +"4. Bölme işlemi";
         
         System.out.println(islemler);
        System.out.println("****************************************************");

        System.out.println("İşlem seçiniz :");
        String islem = scanner.nextLine();
       
        int a;
        int b;

        switch (islem) {
            case "1":
                System.out.println("Birinci Sayi Giriniz :");
                 a = scanner.nextInt();
                System.out.println("İkinci Sayi Giriniz :");
                 b= scanner.nextInt();
                System.out.println("Sayıların Toplamı :"+(a+b));
                break;
             case "2":
                System.out.println("Birinci Sayi Giriniz :");
                 a = scanner.nextInt();
                System.out.println("İkinci Sayi Giriniz :");
                 b= scanner.nextInt();
                System.out.println("Sayıların Çıkarımı :"+(a-b));
                break;
             case "3":
                System.out.println("Birinci Sayi Giriniz :");
                 a = scanner.nextInt();
                System.out.println("İkinci Sayi Giriniz :");
                 b= scanner.nextInt();
                System.out.println("Sayıların Çarpımı :"+(a*b));
                break;
             case "4":
                System.out.println("Birinci Sayi Giriniz :");
                 a = scanner.nextInt();
                System.out.println("İkinci Sayi Giriniz :");
                 b= scanner.nextInt();
                System.out.println("Sayıların Bölümü :"+(a/b));
                break;
            default:
                 System.out.println("Yanlış işlem tuşladınız...");

        }





    }
}
