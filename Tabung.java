import java.util.Scanner;

public class Tabung extends RuangBangun {
    double jariJari, tinggi;

    void inputData() {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jari-jari tabung: ");
        jariJari = input.nextDouble();
        System.out.print("Masukkan tinggi tabung: ");
        tinggi = input.nextDouble();
    }

    void hitungLuasPermukaan() {
        double luas = 2 * Math.PI * jariJari * (jariJari + tinggi);
        System.out.println("Luas permukaan tabung adalah: " + luas);
    }

    void hitungVolume() {
        double volume = Math.PI * jariJari * jariJari * tinggi;
        System.out.println("Volume tabung adalah: " + volume);
    }
}
