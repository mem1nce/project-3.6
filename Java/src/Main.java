import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = scanner.nextInt();

        int sum = 0;
        int tempNumber = number;

        // Sayının basamaklarını toplamak için while döngüsü
        while (tempNumber != 0) {
            sum += tempNumber % 10;  // Son basamağı alıp topluyoruz
            tempNumber /= 10;        // Sayıyı 10'a bölüp bir sonraki basamağa geçiyoruz
        }

        System.out.println(number + " sayısının basamakları toplamı: " + sum);
    }
}
