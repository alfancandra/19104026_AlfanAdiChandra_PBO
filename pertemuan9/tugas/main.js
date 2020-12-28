const prompt = require('prompt-sync')();
var arrayPetShop = []

const pet = require('./pets');

var loop = 1
while (loop >= 1) {
    
    console.log("\n== Silahkan pilih menu ==");
    console.log("1. Tambah hewan ");
    console.log("2. Edit hewan");
    console.log("3. Tampil hewan");
    console.log("4. Exit");

    var pilihMenu = prompt("Masukan nomor menu : ")

    switch (pilihMenu) {
        case '1':
            tambahHewan();
            break;

        case '2':
            editHewan();
            break;

        case '3':
            tampilkanHewan();
            break;

        case '4':
            console.log("Bye..");
            loop = 0;
            break;

        default:
            console.log("\nError : Menu " + pilihMenu + " tidak ditemukan ");
    }
}

function tambahHewan() {
 var jmlHewan = prompt("Jumlah hewan yang ingin ditambah :")

 console.log("\n== Menambah data binatang ==");
 for (let i = 0; i < jmlHewan; i++) {
     var hewan = new pet(
         prompt("Nama hewan : "),
         prompt("Jenis hewan : "),
         prompt("Usia hewan : "),
         prompt("Makanan hewan : "),
         prompt("Riwayat penyakit hewan : ")
     )

    arrayPetShop.push(hewan)
 }
}

function tampilkanHewan() {    
    console.log("\n== Menampilkan data binatang ==");
    for (let h = 0; h < arrayPetShop.length; h++) {
        console.log("\nNomor urut hewan : " + (h + 1));
        console.log("Nama hewan : " + arrayPetShop[h].nama);
        console.log("Jenis hewan : " + arrayPetShop[h].jenis);
        console.log("Umur hewan : " + arrayPetShop[h].umur);
        console.log("Makanan hewan : " + arrayPetShop[h].makanan);
        console.log("Riwayat penyakit hewan : " + arrayPetShop[h].riwayat_penyakit);
    }
}

function tampilkanHewanEdit(index) {
    console.log("\n== Menampilkan data binatang setelah diedit ==");
    console.log("Nama hewan : " + arrayPetShop[index].nama);
    console.log("Jenis hewan : " + arrayPetShop[index].jenis);
    console.log("Umur hewan : " + arrayPetShop[index].umur);
    console.log("Makanan hewan : " + arrayPetShop[index].makanan);
    console.log("Riwayat penyakit hewan : " + arrayPetShop[index].riwayat_penyakit);
}

function editHewan() {

    var noUrut = prompt("Masukan no urut hewan : ");

    pet.prototype.edit = () => {
        nama = prompt("Nama hewan : "),
        jenis = prompt("Jenis hewan : "),
        umur = prompt("Usia hewan : "),
        makanan = prompt("Makanan hewan : "),
        riwayat_penyakit = prompt("Riwayat penyakit hewan : ")

        return {nama, jenis, umur, makanan, riwayat_penyakit}
    }

    var index = noUrut - 1
    arrayPetShop[index] = arrayPetShop[index].edit();

    tampilkanHewanEdit(index)
}