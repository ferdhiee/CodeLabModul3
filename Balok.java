import java.util.Scanner;

public class Balok extends RuangBangun {
    double panjang, lebar, tinggi;

    void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang balok: ");
        panjang = input.nextDouble();
        System.out.print("Masukkan lebar balok: ");
        lebar = input.nextDouble();
        System.out.print("Masukkan tinggi balok: ");
        tinggi = input.nextDouble();
    }

    void hitungLuasPermukaan() {
        double luas = 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
        System.out.println("Luas permukaan balok adalah: " + luas);
    }

    void hitungVolume() {
        double volume = panjang * lebar * tinggi;
        System.out.println("Volume balok adalah: " + volume);
    }
}
