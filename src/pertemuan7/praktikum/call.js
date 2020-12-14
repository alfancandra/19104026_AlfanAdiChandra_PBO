 var person = {
    fullname: function() {
        return this.firstName + " " + this.lastName
    }
}

var person1 = {
    firstName: "Alfan",
    lastName: "Chandra"
}

var person2 = {
    firstName: "Adi",
    lastName: "Alfan"
}

var result = person.fullname.call(person2)

console.log(result);