function pets(
    nama,
    jenis,
    umur,
    makanan,
    riwayat_penyakit) 
{
    this.nama = nama
    this.jenis = jenis
    this.umur = umur
    this.makanan = makanan
    this.riwayat_penyakit = riwayat_penyakit

    this.tampil = () => {
        console.log("Nama : " + this.nama);
        console.log("Jenis : " + this.jenis);
        console.log("Makanan : " + this.makanan);
        console.log("Riwayat Penyakit : " + this.riwayat_penyakit);
    }
}

module.exports = pets