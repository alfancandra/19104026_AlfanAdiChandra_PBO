var person = {
    fullName: function(birth, city) {
        return this.firstName + " " + this.lastName + "," + birth + "," + city
    }
}

var person1 = {
    firstName: "Alfan",
    lastName: "Chandra"
}

var result = person.fullName.apply(person1, ["Brebes", "Juni"])
console.log(result);