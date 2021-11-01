package classCodes.f5_Loops;

public class ForLoop6 {

    public static void main(String[] args) {

        // interview questions

        String str = "AAccBBBdEEEf";
        String newStr="";

        // get unique character out of above String
        // store first char into newStr
        // store the next char into newStr if it's not already there

        for (int i = 0; i < str.length(); i++) {
            String eachChar = str.charAt(i)+"" ;
            if( newStr.contains( eachChar  )) {
                System.out.println(eachChar + " duplicate");
            }else {
                newStr = newStr + eachChar ;
            }
        }
        System.out.println(newStr);
    }
}