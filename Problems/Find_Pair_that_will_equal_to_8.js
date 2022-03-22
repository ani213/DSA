let ar=[1,2,3,4,5,6,7,8,9,5,4,9,10];

const getResult=(arr,n)=>{
    let result=[];
    for(let i=0;i<arr.length;i++){
        if(arr.slice(i+1).indexOf(n-arr[i])!==-1){
            result.push([arr[i],n-arr[i]])
        }

    }
return result
}

console.log(getResult(ar,8))
