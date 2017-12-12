class ReverseString {
  
    String reverse(String stringToReverse) {
        //cos why not?
        StringBuilder builder = new StringBuilder();
        builder.append(stringToReverse);
        return builder.reverse().toString();

//        String temp = "";
//        for(int i=stringToReverse.length()-1; i >=0; i--) {
//            temp +=stringToReverse.charAt(i);
//        }
//        return temp;
    }
  
}