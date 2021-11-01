package classCodes.f3_StringAndStringMethods;

public class StringEquality4 {

    public static void main(String[] args) {

        //Strings are immutable
        //so any modification on a String literal will not modify the current literal value
        //it will just create a new String literal

        String str1 = "Java rocks!";

        str1.toUpperCase();   //
        // here, we are not updating str1,
        //we are creating a new literal value, but we are not assigning a reference to it thats why it doesnt store changing

        System.out.println(str1);    // Java rocks!

        str1 = str1.toUpperCase();  //assigning a reference

        System.out.println(str1);   //JAVA ROCKS!

        //if there is already the same String literal in the String pool, a new one won't be created
        //but a new reference will also be pointed to the literal

        String str2 = "Java";

        String str3 = "Java";

        System.out.println(str2==str3); // true  because it point same reference

        str2 = str2.toLowerCase();

        System.out.println(str2==str3);  //false  //eger equalIgnoreCase ile yazsaydik true olurdu cunku sadece icerigine bakardi o zaman point noktasina degil text'e
        System.out.println(str2.equalsIgnoreCase(str2));  //true

        //literals;
        //1. created just by assignment ----- String Pool
        //2
        //== checks if the references are pointing to the same literal

        //objects;
        //1. if you are using the """new""" keyword, a new object is created
        //2. all objects go to heap
        //== checks if the references are pointing to the same heap object


        String str5 = "Coding is awesome!"; // goes to String pool
         //if we are using method it goes heap memory
        String str6 = str5.toUpperCase(); // is created in the Heap

        String str7 = "Coding"; // pool

        String str8 = str7 + " is awesome!"; // heap --> variable concat created in heap memory

        str7 = str7.concat(" is awesome!"); // new heap object is created here and str7 is assigned to it


        String s1 = "Good";  //pool

        String s2 = " Morning";  //pool


        String s3 = "Good Morning";  //pool

        String s4 = "Good" + " Morning"; //pool because concat 2 literals

        String s5 = s1 + s2; //variable concat, created in the heap

        String s6 = s1.concat(" Morning"); // created in the heap, since by using method, a new object is created by using "new" keyword

        String s7 = "Good".concat(" Morning"); // created in the heap, a new object is created by using "new" keyword


        System.out.println("****************************");

        System.out.println(s3==s4); //true

        System.out.println(s4==s5); //false it is false s4 pointing in pool , s5 pointing in heap

        System.out.println(s3==s5); //false   it is false s3 pointing in pool , s5 pointing in heap

        System.out.println(s3==s6); //false

        System.out.println(s3==s7); //false

        System.out.println(s6==s7); //false

        System.out.println("****************************");

        String ss1 = new String("abc");

        String ss2 = new String("abc");

        System.out.println(ss1==ss2);

        String ss3 = ss2;

        System.out.println(ss2==ss3);

        String ss4 = "abc";

        System.out.println(ss1==ss4);

    }

}

