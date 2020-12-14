class mean {
    constructor(nilaiAsArray = []) {
        this.nilai = nilaiAsArray
    }

    getMean() {
        var tambahSemua = this.sum(this.nilai)

        var hasil = Number(tambahSemua / this.nilai.length)

        console.log("Rata - rata nilai kamu : " + hasil);
    }
    
    sum(input){
             
        if (toString.call(input) !== "[object Array]")
        return false;
      
        var total =  0;
        for(var i = 0; i < input.length; i++)
        {                  
            if(isNaN(input[i])){
            continue;
             }
              total += Number(input[i]);
        }
        return total;
    }
}

function askFor(name) {
    return prompt("Masukan " + name)
}

var tanyaJumlahNilai = askFor("Jumlah nilai");

var nilai = []
for (let i = 0; i < tanyaJumlahNilai; i++) {
    nilai[i] = askFor("Nilai ke-" + (i + 1) )
}

var app = new mean(nilai)

// cetak rata ratanya
app.getMean()