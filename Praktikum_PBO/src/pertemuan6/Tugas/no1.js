var s = ""
for(var i=1;i<=50;i += 1){
    var bil=0
    for(var j=1;j<=i;j++){
        if(i%j==0){
            bil=bil+1
        }
    }
    if(bil==2){
        s += i + ", "
    }
}
console.log('Bilangan Prima\t= '+s)