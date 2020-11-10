var msg="0,1"; 
function fibo(a,b) 
{ 
 if(b<100){ 
  a=(a+b); 
  msg+=", "+a; 
  fibo(b,a); 
 } 
} 
fibo(0,1); 
console.log("Fibonacci\t= "+msg)