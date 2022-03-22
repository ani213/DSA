
/* Prototypes are the mechanism by which JavaScript objects inherit features from one another. */

let object1={
    name:"Aniket",
    city:"Ballia",
    getDetail(){
        return `${this.name} ${this.city}`
    }
}

let object2={
    name:"Chandan",
}

object2.__proto__=object1;

console.log(object2.getDetail());