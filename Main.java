import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih bangun ruang yang ingin dihitung:");
        System.out.println("1. Balok");
        System.out.println("2. Kubus");
        System.out.println("3. Tabung");
        System.out.print("Masukkan pilihan (1/2/3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                Balok balok = new Balok();
                balok.inputData();
                balok.hitungLuasPermukaan();
                balok.hitungVolume();
                break;
            case 2:
                Kubus kubus = new Kubus();
                kubus.inputData();
                kubus.hitungLuasPermukaan();
                kubus.hitungVolume();
                break;
            case 3:
                Tabung tabung = new Tabung();
                tabung.inputData();
                tabung.hitungLuasPermukaan();
                tabung.hitungVolume();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
