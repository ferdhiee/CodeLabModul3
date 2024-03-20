import java.util.Scanner;

public class Kubus extends RuangBangun {
    double sisi;

    void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang sisi kubus: ");
        sisi = input.nextDouble();
    }

    void hitungLuasPermukaan() {
        double luas = 6 * sisi * sisi;
        System.out.println("Luas permukaan kubus adalah: " + luas);
    }

    void hitungVolume() {
        double volume = sisi * sisi * sisi;
        System.out.println("Volume kubus adalah: " + volume);
    }
}
