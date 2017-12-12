class ReverseString {
  
    String reverse(String stringToReverse) {
        //cos why not?
        return new StringBuilder().append(stringToReverse).reverse().toString();
    }
  
}