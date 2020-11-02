package pertemuan3.Tugas.no3;

public class Anak {
    private int idAnak;
    private String namaAnak;
    private int umurAnak;
    private String statusAnak;


    public Anak(int idAndak, String namaAnak, int umurAnak, String statusAnak) {
        this.idAnak = idAndak;
        this.namaAnak = namaAnak;
        this.umurAnak = umurAnak;
        this.statusAnak = statusAnak;
    }

    public int getIdAnak() {
        return idAnak;
    }

    public String getNamaAnak() {
        return namaAnak;
    }

    public int getUmurAnak() {
        return umurAnak;
    }

    public String getStatusAnak() {
        return statusAnak;
    }
}
