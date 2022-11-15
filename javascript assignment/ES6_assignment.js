/*Refactor the following function into a one-liner:
const printName = (name) => {
                     return “Hi” + name;
           }*/
const printName = (name)=>{ return ("Hi " + name);}
console.log(printName("saicaharn"));



/*Rewrite the following code using template literals
const printBill = (name, bill) => {
                     return “Hi “ + name + “, please pay: “ + bill;
           }*/
const printBill = (name, bill) => {
    return `Hi ${name}, please pay:${bill}`
}
console.log(printBill("saicaharn",200));


/*Modify the following code such that the object properties are destructured and logged.
const person = {
                      name: “Noam Chomsky”,
                      age: 92
            }
           
           let name = person.name;
           let age = person.age;
           console.log(name);
           console.log(age);*/
let person={
    name:"Noam Chomsky",
    age:92
}
let {name:pname,age:page}=person
console.log("after destructuring the object person name is "+pname+" age is "+page)
