import java.util.Scanner;

public class BasamakSayilarinToplami {
    public static void main(String[] args) {
        int number, a = 0, basamak;
        Scanner data = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        number = data.nextInt();

        System.out.print(number);

        while (number != 0) {
            basamak = number % 10;
            number /= 10;
            a += basamak;
        }
        System.out.print(" Sayısının basamak sayıları toplamı =" + a);
    }
}
