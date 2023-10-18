package hw1;

public class hw6 {
	public static void main(String[] args) {
		int num=5;
	    char num1='5';
	    String num2="5";
	   
		System.out.println(num+num); //整數5加上整數5得到的值
		System.out.println(num+num1);//單引號Char裡輸入的數值 會定義為unicode字元
		System.out.println(num+num2);//雙引號代表String值，會得字串相加
	}

}
//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因