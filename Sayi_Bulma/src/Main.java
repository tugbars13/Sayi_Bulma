import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir değer giriniz !");
        int aranacak = input.nextInt();

        boolean bulundu = false;

        for (int i = 0; i < sayilar.length; i++) {
            if (aranacak == sayilar[i]) {
                bulundu = true;
                break;

            }
        }
        if (bulundu) {
            System.out.println("Sayınız dizinin içinde");
        } else {
            System.out.println("Sayınız dizinin içinde değil");
        }


    }
}