const prompt = require('prompt-sync')();

 // deklarasi prodi
 const prodi = ['S1 SE', 'S1 IF', 'S1 SI'];

 let array = [];

 function Mahasiswa(name, nim, birth, prodi, grade = null) {
     this.name = name;
     this.nim = nim;
     this.birth = birth;
     this.prodi = prodi;
     this.grade = grade;
     this.age = () => {
        let year = this.birth.slice(this.birth.length - 4);
        let nowYear = new Date().getFullYear();
        return nowYear - year;
     }
 }

function cekGrade(nilai) {
   if (nilai >= 80 && nilai <= 100) {
       return 'A'
   } else if (nilai >= 60 && nilai < 80) {
       return 'B'
   } else if (nilai >= 40 && nilai < 60) {
       return 'C';
   } else if (nilai < 40) {
       return 'D';
   }
}


function printMenu() {
  console.log("\n===== Menu Penilaian =====");
  console.log("1. Tambah Mahasiswa");
  console.log("2. Penilaian");
  console.log("3. Lihat seluruh mahasiswa");
  console.log("4. Keluar\n");
}

var loop = true;

while (loop) {

  printMenu();
  let pilihan = prompt("Masukan menu : ")

  switch (pilihan) {
      case '1':
          var total = prompt("Jumlah mahasiswa : ");
          for (let i = 0; i < total; i++) {
             console.log("\n@ Mahasiswa " + (i + 1));
             let nama = prompt("Masukan nama mahasiswa : ")
             let nim = prompt("Masukan nim mahasiswa : ")
             let tglLahir = prompt("Masukan tanggal lahir : ")

             console.log("\nProdi");
             for (let j = 0; j < prodi.length; j++) {
                 console.log(j + ". " + prodi[j]);
             }

             let idprodi = prompt("Masukan id prodi : ")

             array.push(
                 new Mahasiswa(nama, nim, tglLahir, idprodi)
             )
          }
          break;
      case '2':
         console.log("Penilaian Mahasiswa\n");
         var inputNIM  = prompt("Masukan Nim :");
         var inputNilai  = prompt("Masukan Nilai :");

         for (let n = 0; n < array.length; n++) {
             if(array[n].nim == inputNIM) {
                array[n].grade = cekGrade(inputNilai)
             }
         }
          
         break;
      case '3':
          console.log("\nData Mahasiswa : ");

          for (let m = 0; m < array.length; m++) {
              console.log("Mahasiswa " + m);
              console.log("Nama : " + array[m].name);
              console.log("NIM : " + array[m].nim);
              console.log("Prodi : " + prodi[array[m].prodi]);
              console.log("Birth : " + array[m].birth);
              console.log("Umur : " + array[m].age());
              console.log("Grade : " + array[m].grade);
              console.log("\n");
          }
         break;
      case '4':
         console.log('Bye..');
         loop = false;
         break;
      default:
          printMenu();
          break;
  }
}