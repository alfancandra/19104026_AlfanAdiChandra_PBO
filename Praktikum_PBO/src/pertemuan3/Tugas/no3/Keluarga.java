package pertemuan3.Tugas.no3;

import java.util.ArrayList;

public class Keluarga {
    private ArrayList<Anak> anakList = new ArrayList<Anak>();
    private String namaKeluarga;
    private String kotaAsal;
    private Ayah ayah;
    private Ibu ibu;

    public Keluarga(String namaKeluarga, String kotaAsal) {
        this.namaKeluarga = namaKeluarga;
        this.kotaAsal = kotaAsal;
    }

    public void addAnggotaKeluarga(Ayah ayah, Ibu ibu, ArrayList<Anak> child){
        this.ayah = ayah;
        this.ibu = ibu;
        this.anakList = child;
    }

    public String getNamaKeluarga() {
        return namaKeluarga;
    }

    public String getKotaAsal() {
        return kotaAsal;
    }

    public Ayah getAyah() {
        return ayah;
    }

    public Ibu getIbu() {
        return ibu;
    }

    public ArrayList<Anak> getAnakList() {
        return anakList;
    }

    public void getDataKeluarga(){
        System.out.println("Nama Keluarga\t: " + getNamaKeluarga());
        System.out.println("Kota Asal\t: " + getKotaAsal());
        System.out.println("Nama Ayah\t: " + getAyah().getNamaAyah());
        System.out.println("Nama Ibu\t: " + getIbu().getNamaIbu());
        System.out.println("Data Anak\t: ");
        for(Anak bayi : getAnakList()){
            System.out.println( "\t =============================");
            System.out.println("\t Nama : " + bayi.getNamaAnak());
            System.out.println("\t Umur\t : " + bayi.getUmurAnak());
            System.out.println("\t Status : " + bayi.getStatusAnak());
        }
        System.out.println( "\t =============================" );
    }
}
