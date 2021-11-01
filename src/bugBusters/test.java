package bugBusters;

import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class test {
    public static void main(String[] args) {

        System.out.println(primeNumbers(5));
        System.out.println(primeNumbers(3));
        System.out.println(primeNumbers(7));
        System.out.println(primeNumbers(10));

    }

    public static boolean primeNumbers( int num){
        boolean b;
        if( num!=0 &&num!=1 && num%num==0 ){
            b=true;
        }else{
            b=false;
        }
        return b;
    }

}
