package classCodes.f5_Loops;

public class ForLoop8 {

    public static void main(String[] args) {

        String str = "ABCAA" ;
        String newStr="";


        //TASK 1 :
        // loop through each character using subString
        // and print them out with - in between

        // OPTIONALLY : avoid the dash in last character

        // try line by line to start with if looping directly is challenging
        // once the sequential numbers show up it will be clear
//	    System.out.println(  str.substring(0,1)   );
//	    System.out.println(  str.substring(1,2)   );
//	    System.out.println(  str.substring(2,3)   );
//	    System.out.println(  str.substring(3,4)   );
//	    System.out.println(  str.substring(4,5)   );



//        for (int i = 0; i < str.length(); i++) {
//           if(i!=str.length()-1){
//               newStr+= str.charAt(i) + " - ";
//               //or we can do it with substring method
//               //String eachChar=str.substring(i,i+1);
//           }else{
//               newStr+=str.charAt(i);
//           }
////            System.out.print(str.charAt(i)+ ((i!=str.length()-1)?( " - " ) : ""));
//        }
//        System.out.println(newStr);


        for (int i = 0; i < str.length(); i++) {
            if(i!=str.length()-1){
                System.out.print(str.substring(i,i+1)+ "-");
            }else{
                System.out.print(str.substring(i,i+1));
            }
        }

    }

}