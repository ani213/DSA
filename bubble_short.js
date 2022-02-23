/*    
Bubble sort (A,N) A is array of values and N is the number of elements.

1. Repeat for loop round =1,2,3,4,......N-1
2. Repeat for loop i=0,1,2,3,4 .....N-1-round
3. if A[i]>A[i+1] then swap A[i] and A[i+1]
4. Return

*/

const sort = (A) => {
    for (let round = 1; round <= A.length - 1; round++) {
        for (let i = 0; i <= A.length - 1 - round; i++) {
            if (A[i] > A[i + 1]) {
                let temp = A[i];
                A[i] = A[i + 1];
                A[i + 1] = temp;
            }
        }
    }
    return A;
}
let sortedArr = sort([7, 3, 2, 9, 15, 34, 1, 40, 6, 5, 2])
console.log(sortedArr);