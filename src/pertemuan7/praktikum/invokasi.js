  
// contoh 1
function myFunction(a, b, c) {
    console.log("Hello my name is " + a);
    console.log("I'm " + b + " years old");
    console.log("I like " + c);
}

console.log("\nOutput contoh 1");
myFunction("Alfan Chandra", 19, 'Game')

// contoh 2
function myFunction2(arg1, arg2) {
    this.firstName = arg1
    this.lastName = arg2
}


var x = new myFunction2("Alfan", "Chandra")

console.log("\nOutput contoh 2");
console.log(x.firstName)