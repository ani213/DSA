/*The JavaScript Function call() method is used to
 call a function contains this value and an argument provided individually. */


let obj={
    name:"ani",
    last:"Verma",
}
// console.log(this);
let full=function(dist,state){
    console.log(this.name," ",this.last," ",dist," ",state);
}
full.call(obj,"Ballia","UP");
full.apply(obj,["Ballia","UP"]);
full.bind(obj,"Ballia","UP")();

const person = {
    firstName  : "John",
    lastName   : "Doe",
    id         : 5566,
    myFunction : function() {
      return this;
    }
  };
  console.log(person.id);