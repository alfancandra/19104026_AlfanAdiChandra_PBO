var person = (function(){
    var age = 25

    function setAge(newAge){
        age = newAge
    }

    function getAge(){
        return age
    }

    function growOlder(){
        age++
    }

    return {
        name : 'Paimon',
        setAge : setAge,
        getAge : getAge,
        growOlder : growOlder
    }

}())

console.log('Nama Person\t: '+person.name)
console.log('Umur Person\t: '+person.getAge())

person.age = 100
console.log('Umur person yang diganti\t: '+person.getAge())

person.growOlder()
console.log('Umur person yang ditambah\t: '+person.getAge())