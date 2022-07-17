console.log(x);

var x=6;
y();
function y(){
    console.log("object");
}
function counter(){
    var count=0;
    ++count;
    return count;
}

// console.log(counter());
// console.log(counter());
// console.log(counter());

function abc(){
    var obj={a:"ani",b:"ver"};
    var b=obj;
    delete b.a;
    console.log(obj);
    console.log(b);
}
abc();


let arr=[1,2,3,4,5];

let getNewArr=(arr)=>{
    for(let i=0;i<arr.length;i++){
        arr[i]=arr[i]*2;
    }
    console.log(arr);
}
getNewArr(arr);
console.log(arr,"originaml");// here original array is changed;