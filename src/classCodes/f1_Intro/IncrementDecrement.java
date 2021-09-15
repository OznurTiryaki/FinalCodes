package classCodes.f1_Intro;

public class IncrementDecrement {

	public static void main(String[] args) {

		//INCREMENT AND DECREMENT

    int i = 10;

    //i = i + 1; Sysout--11
    //i += 1;   Sysout--11
    //i++;       Sysout--11
    //i++; ++i;

		System.out.println(i); //i degeri 10

//		System.out.println(i++); /*i degeri 1 artti fakat artilar sonra olunca sonuc bir sonraki isleme kaydi
//		                           bu yuzden i hala 10  */
//		System.out.println(i); //i degeri bir onceki islemden dolayi bir artti 11
//
//		System.out.println(++i); //artilar basta oldugu icin i degeri hemen artti 12 oldu
//
//        System.out.println(i); //i degeri 12
//
//		System.out.println(i--); /*i degeri 1 azaldi fakat eksiler sonda olunca sonuc bir sonraki isleme kaydi
//		                           bu yuzden i hala 12  */
//		System.out.println(i); //i degeri bir onceki islemden dolayi bir azaldi 11
//
//		System.out.println(--i); //eksiler basta oldugu icin i degeri hemen azaldi 10 oldu
//
//		System.out.println("------------------------------------------------------");
//
//		// INCREMENT AND DECREMENT-Example 2
//
//		int apples = 0;
//
//		System.out.println(apples); //0
//
//		System.out.println(++apples);	//1
//
//		System.out.println(apples);	//1
//
//		System.out.println(apples++);	//1
//
//		System.out.println(apples); //2
//
//		System.out.println(--apples); //1 eksi onde oldugu icin hemen azaldi
//
//		System.out.println(apples); //1- yukardaki asamada eksi hemen degeri azatti
//
//		System.out.println(apples--); //1 hala 1 cunku eksi sonda ve azaltma bir sonraki isleme kaldi
//
//		System.out.println(apples); //0 ustteki islemden dolayi degeri bir azaldi
//
//		System.out.println("------------------------------------------------------");
//
//
//       // INCREMENT AND DECREMENT- Example 3
//
//		int pears = 3;
//
//
//		             //  4   * 5  /   4      +    2
//		int basket = ++pears * 5 / pears-- + --pears;
//
//		/*ilk kisimda arti onde oldugu icin hemen deger yukselti ve 4 oldu
//		 * ikinci kisimda eksi sonda oldugu icin hala 4 kaldi
//		 * ucuncu kisimda bir onceki islemde bir azaldi 3 oldu
//		 * ve eksi onde oldugu icin bir daha azaldi 2 oldu
//
//		 */
//
//		System.out.println(basket);
//
//		System.out.println(pears); // 2 olarak kaldi value en son


	}
}
