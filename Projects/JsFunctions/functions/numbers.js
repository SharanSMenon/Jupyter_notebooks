let isPrime = (x) => {
    for (let i = 2; i < x/2; i++) {
        if (x % i == 0) {
            return false;
        }        
    }
    return true;
}
let isEven = x => x % 2 === 0;
module.exports = {
    isPrime,
    isEven
}