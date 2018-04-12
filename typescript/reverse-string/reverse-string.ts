class ReverseString {
    static reverse(str: any ) {
        // Your code here
        var splitString = str.split("");
        var reversedArr =  splitString.reverse();
        var joinedArr =  reversedArr.join("");
        return joinedArr;
    }
}

export default ReverseString
