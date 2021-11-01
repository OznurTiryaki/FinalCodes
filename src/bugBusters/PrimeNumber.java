package bugBusters;

public class PrimeNumber {
    public static void main(String[] args) {

        System.out.println(isPrime(1));   //false
        System.out.println(isPrime(6));   //false
        System.out.println(isPrime(3));   //true
        System.out.println(isPrime(13));  //true
        System.out.println(isPrime(7));   //true
        System.out.println(isPrime(2));   //true
        System.out.println(isPrime(11));  //true
        System.out.println(isPrime(17));  //true
        System.out.println(isPrime(20));  //false
        System.out.println(isPrime(19));  //true
        System.out.println(isPrime(21));  //false

    }

    public static boolean isPrime(int num) {

        boolean b = false;

        if (num == 2) {
            b = true;
        }
       if (num>2  && num % 1 == 0 && num % 2 != 0) {
                b = true;
            }
        return b;
    }
}