var nilai = {
    minMax: function() {
    
      var nilai = arguments
    
      console.log("Nilai tertinggi : " + Math.max.apply(Math, nilai));
      console.log("Nilai terendah : " + Math.min.apply(Math, nilai));
    }
}


var hasil = nilai.minMax.apply(nilai, [5, 6, 2, 3, 7])