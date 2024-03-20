public class App {
    public static void main(String[] args) {
        Balok balok = new Balok();
        Kubus kubus = new Kubus();
        Tabung tabung = new Tabung();

        balok.inputData();
        balok.hitungLuasPermukaan();
        balok.hitungVolume();

        kubus.inputData();
        kubus.hitungLuasPermukaan();
        kubus.hitungVolume();

        tabung.inputData();
        tabung.hitungLuasPermukaan();
        tabung.hitungVolume();
    }
}
