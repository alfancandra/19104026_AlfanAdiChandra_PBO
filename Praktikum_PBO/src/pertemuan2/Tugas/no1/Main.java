package pertemuan2.Tugas.no1;

public class Main {
    public static void main(String[] args) {
        Club club0 = new Club();
        Club club1 = new Club("Arsenal");
        Club club2 = new Club("Arsenal", "Club Sepak Bola Inggris");
        Club club3 = new Club("Arsenal", 1886, "Stadion Emirates");
        Club club5 = new Club("Arsenal", 1886, "Stadion Emirates", 2, "Club Sepak Bola Inggris");

        // Cetak Semua data menggunakan Method getTeam()
        club0.getTeam();
        System.out.println();
        club1.getTeam();
        System.out.println();
        club2.getTeam();
        System.out.println();
        club3.getTeam();
        System.out.println();
        club5.getTeam();
    }
}
