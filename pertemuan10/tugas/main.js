const prompt = require('prompt-sync')();

class kendaraan {

    constructor() {
        this.noPlat = null, 
        this.merk = null, 
        this.pajakKendaraan = null
    }

    inputAtribut() {
        this.noPlat = prompt("Masukan Nomor Kendaraan : ")
        this.merk = prompt("Masukan Merk Kendaraan : ")
        this.pajakKendaraan = prompt("Masukan Pajak Kendaraan : ")
    }

    fasTambahan() {}
    printFasTambahan() {}
    hitungPajak() {}
    
    print() {
        console.log("--Info Kendaraan--");
        console.log("Nomor Kendaraan : " + this.noPlat);
        console.log("Merk : " + this.merk);
        this.printFasTambahan()
        console.log("Pajak Kendaraan : " + this.pajakKendaraan);
        console.log("Total Pembayaran Pajak : " + this.hitungPajak());
        console.log("\n");
    }
}

class Sedan extends kendaraan {

    fasTambahan() {
        this.fasKeamanan = prompt("Masukan Fasilitas Keamanan : ")
        this.kapasitasCC = prompt("Masukan Kapasitas (dalam CC) : ")
        this.fasKenyamanan = prompt("Masukan Fasilitas Kenyamanan : ")
    }

    printFasTambahan() {
        console.log("Fasilitas Keamanan " + this.fasKeamanan);
        console.log("Kapasitas (dalam CC) : " + this.kapasitasCC);
        console.log("Fasilitas Kenyamanan : " + this.fasKenyamanan);
    }

    hitungPajak() {
        return this.pajakKendaraan + (this.pajakKendaraan * this.kapasitasCC * 0.00005)
    }
}

class Bus extends kendaraan {

    fasTambahan() {
        this.kapPenumpang = prompt("Kapasitas penumpang : ")
        this.kapBagasi = prompt("Masukan kapasitas bagasi (kg) : ")
    }

    printFasTambahan() {
        console.log("Kapasitas penumpang : " + this.kapPenumpang);
        console.log("Kapasitas bagasi (kg) : " + this.kapBagasi);
    }

    hitungPajak() {
        return this.pajakKendaraan + (this.pajakKendaraan * this.kapPenumpang * this.kapBagasi * 0.00005);            
    }
}

var sedan = new Sedan

console.log("Input data sedan");

sedan.inputAtribut()
sedan.fasTambahan()

var bus = new Bus

console.log("\nInput data bus");

bus.inputAtribut();
bus.fasTambahan()
sedan.print()
bus.print()