package pertemuan3.Tugas.no1;

public class Rumah {
    private String idRumah;
    private String pemilikRumah;
    private int jumlahOrang;

    public Rumah(String idRumah, String pemilikRumah, int jumlahOrang) {
        this.idRumah = idRumah;
        this.pemilikRumah = pemilikRumah;
        this.jumlahOrang = jumlahOrang;
    }

    public String getIdRumah() {
        return idRumah;
    }

    public void setIdRumah(String idRumah) {
        this.idRumah = idRumah;
    }

    public String getPemilikRumah() {
        return pemilikRumah;
    }

    public void setPemilikRumah(String pemilikRumah) {
        this.pemilikRumah = pemilikRumah;
    }

    public int getJumlahOrang() {
        return jumlahOrang;
    }

    public void setJumlahOrang(int jumlahOrang) {
        this.jumlahOrang = jumlahOrang;
    }

}
