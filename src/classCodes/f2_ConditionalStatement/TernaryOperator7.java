package classCodes.f2_ConditionalStatement;

public class TernaryOperator7 {

    public static void main(String[] args) {

        // Ternary and increment decrement together

        int x = 97 ;
        String result = "Unknown" ;

//		    if(x>70){
//		      result = "pass" ;
//		    }else{
//		      result = "fail" ;
//		    }
//		    result = "fail" ;

        result = (x>70) ? "pass" : "fail" ;

        //System.out.println("fail");
        //System.out.println(  result );
        System.out.println(   "my result is : " + ( (x>70) ? "pass" : "fail")   ); // we will put inside print

    }

}

