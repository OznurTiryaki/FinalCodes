package classCodes.f2_ConditionalStatement;

public class TernaryOperator1 {

    public static void main(String[] args) {

        // used for conditionally assigning a value

        int score = 98 ;

        String abc = "";

        if (score >75)
            abc = "pass";
        else
            abc = "fail";
                            //true    //false  first part refer to true second part refer to false
        abc = (score >75) ? "pass" : "fail";   //with that we dont need to write like up,
        //it make code really short

        System.out.println(abc);
    }

}