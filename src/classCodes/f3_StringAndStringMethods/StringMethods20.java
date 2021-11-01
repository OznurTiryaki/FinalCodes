package classCodes.f3_StringAndStringMethods;

public class StringMethods20 {
    public static void main(String[] args) {

        //String Review

        String str = "Java String is Awesome";
        int count = str.length();
        int lastIndex = count - 1;
        System.out.println("how many character: " + count);
        System.out.println("Last Char index: " + lastIndex);

//getting the index of word String

        int indexOfWordString = str.indexOf("String");  //you will put character all whole word
        System.out.println(indexOfWordString); // it show us where start that words


        int part = str.indexOf("is");
        System.out.println(part);

        System.out.println(str.substring(part, part + 2));  //to find is

        int indexOfA = str.indexOf('a');
        System.out.println(indexOfA); //it  give us position of A  always give first occurance

        //indexOf (string, beginningIndex)  //"a" what do you looking for
        //indexOfA+1 where do you looking for

        int indexOfSecondA = str.indexOf('a', indexOfA + 1);
        System.out.println(indexOfSecondA); // ilk a dans sonraki a nin yerini verdiaq

        System.out.println("-------------------------------------------");

        String song = "Ba Ba Black Sheep Ba";

        int ba= song.indexOf("Ba");  //ilk Ba 'yi verir
        System.out.println(ba);
        int secondBa= song.indexOf("Ba", ba+2);
        System.out.println(secondBa);
        int thirdBa = song.indexOf("Ba", secondBa+2);	//we add two because Ba two word
        System.out.println(thirdBa);

    }
}
