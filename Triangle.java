import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Elmasın yüksekliğini girin: ");
        int yukseklik = scanner.nextInt();

        if (yukseklik % 2 == 0) {
            yukseklik++; 
        }

        int yarimYukseklik = yukseklik / 2;

        for (int i = 0; i < yarimYukseklik; i++) {
            for (int j = yarimYukseklik; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = yarimYukseklik; i >= 0; i--) {
            for (int j = i; j < yarimYukseklik; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}