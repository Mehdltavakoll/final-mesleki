import java.util.Scanner;
import java.util.Random;

public class TahminOyunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int n = random.nextInt(20) + 1; // 1 ile 20 arasında rastgele sayı
        int hak = 5;

        System.out.println("1 ile 20 arasında bir sayı tahmin edin. Toplam 5 hakkınız var.");

        while (hak > 0) {
            System.out.print("Tahmininiz: ");
            int sayi = scanner.nextInt();

            if (sayi < n) {
                System.out.println("Sayiyi Yükselt");
                hak--;
            } else if (sayi > n) {
                System.out.println("Sayiyi Küçült");
                hak--;
            } else {
                System.out.println("Tebrikler! Doğru tahmin ettiniz.");
                break;
            }

            if (hak == 0) {
                System.out.println("Tahmin hakkınız bitti. Doğru sayı: " + n);
            } else {
                System.out.println("Kalan hak: " + hak);
            }
        }

        scanner.close();
    }
}
