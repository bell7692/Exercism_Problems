class Pangram {
    message: any;
    constructor( str: any ) {
        // Your code here
      this.message = str;
    }

    isPangram() {
        // Your code here
      var stringArr=  this.message .split("");
      var reversedArr = stringArr.reverse();
      var reversedStr = reversedArr.join("");

      if(this.message  === reversedStr){
          return true;
      }
      else{
          return false;
      }
    }
}

export default Pangram
