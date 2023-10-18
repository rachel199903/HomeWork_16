package hw2;

public class hw1 {

	public static void main(String[] args) {
		int sum = 0;
		for (int count = 2; count <= 1000; count+=2)
			sum += count;
		System.out.println(sum);
	}
}


//請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)