package hw1;

public class hw3 {
	public static void main(String[] args){
		int sec1=256559 , day=24 , hour=60 , min=60;
		System.out.println(sec1/hour);
		System.out.println(sec1/day/hour/min);
		System.out.println(sec1/hour/min);
		System.out.println((sec1/hour)-(hour*71));
		System.out.println(sec1-(hour*min*71+min*15));
	}

}
//請由程式算出256559秒為多少天、多少小時、多少分與多少秒