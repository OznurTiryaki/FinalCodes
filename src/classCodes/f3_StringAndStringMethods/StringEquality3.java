package classCodes.f3_StringAndStringMethods;

public class StringEquality3 {

    public static void main(String[] args) {

        String s1 = "abc"; //using string literal

        String s2 = new String("abc"); //using new keyword //like creating two different object

        System.out.println(  s1 == s2  );  //false cunku memory de iki ayri obje olarak goruluyor new keyword kullandigimiz icin

        String s3 = s1 ;

        System.out.println(  s1 == s3  );   //true
    }
}
