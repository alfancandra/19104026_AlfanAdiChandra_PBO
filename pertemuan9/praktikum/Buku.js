const prompt = require('prompt-sync')()
function Buku(judul, pengarang, penerbit, thTerbit){
    this.judul = judul
    this.pengarang = pengarang
    this.penerbit = penerbit
    this.thTerbit = thTerbit

    this.tampil = function(){
        console.log('Judul Buku\t\t: ' + this.judul)
        console.log('Nama Pengarang\t: ' + this.pengarang)
        console.log('Penerbit\t\t: ' + this.penerbit)
        console.log('Tahun Terbit\t: ' + this.thTerbit)
    }
}

let jmlBuku = prompt('Jumlah buku yang akan diinput : ')
var arrayBuku = []
var buku = {}

// perulangan untuk membuat objek
for (let i = 1; i <= jmlBuku; i++) {
    console.log('\n')

    // membuat objek dengan constructor
    buku = new Buku(
        prompt(`Masukkan judul buku ke-${i} : `),
        prompt(`Masukkan nama pengarang : `),
        prompt(`Masukkan nama penerbit : `),
        prompt(`Masukkan tahun terbit : `)
    )

    arrayBuku.push(buku)
}

console.log('\n')
var editData = prompt('Ingin mengubah data?[y/n] : ')

if (editData == 'y' || editData == 'Y') { 
    var noBuku = prompt('Masukkan urutan buku yang ingin dirubah : ')
    var namaData = prompt('Masukkan data yang ingin diubah [Judul/Pengarang/Penerbit/Tahun Terbit] : ')
    let index = noBuku-1

    // menyimpan semua perubahan yang dilakukan
    if (namaData == 'judul') {
        arrayBuku[index].judul = prompt('Masukkan judul buku baru : ')
    } else if(namaData == 'pengarang'){
        arrayBuku[index].pengarang = prompt('Masukkan nama pengarang baru : ')
    }else if(namaData == 'penerbit'){
        arrayBuku[index].penerbit = prompt('Masukkan nama penerbit baru : ')
    }else if(namaData == 'tahun terbit'){
        arrayBuku[index].thTerbit = prompt('Masukkan tahun terbit baru : ')
    }else{
        console.log('Pilihan tidak sesuai !')
    }

    console.log('\nData buku berhasil disimpan. . . . .')

    // menampilkan hasil
    index = 1

    for(let i in arrayBuku){
        console.log(`Buku ke-${index}`)
        index++
        arrayBuku[i].tampil()
    }
} else if(editData == 'n' || editData == 'N'){
    // menampilkan data
    console.log('\nData buku berhasil disimpan. . . . .')
    index = 1;

    for(let i in arrayBuku){
        console.log(`Buku ke-${index}`)
        index++
        arrayBuku[i].tampil()
    }
}else {
    console.log('Pilihan tidak sesuai !')
}