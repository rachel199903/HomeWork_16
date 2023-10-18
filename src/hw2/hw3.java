package hw2;

public class hw3 {

	public static void main(String[] args) {
		int i = 1;
		int count = 1;
		while (count <= 10) {
			i *= count;
			count++;
		}
		System.out.println(i);
	}
}
//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) 
//(用while迴圈)