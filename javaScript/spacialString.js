function spacial(A){
    if(A.indexOf('a')===-1||A.indexOf('b')===-1){
        return 'No';
    }
    let apart=A.substr(0,A.indexOf('b'));
    let bpart=A.substr(A.indexOf('b'));
    console.log(apart,"   ",bpart);
    for(let i=0;i<apart.length;i++){
        console.log(apart.charAt());
         if(apart.charAt(0)!=='a'){
            return "No"; 
         }
    } 
    for(let i=0;i<bpart.length;i++){
         if(bpart.charAt(0)!=='b'){
            return "No"; 
         }
    } 
     
    return "Yes";
}

console.log(spacial('abcde'));