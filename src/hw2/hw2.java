package hw2;

public class hw2 {

	public static void main(String[] args) {
		int sum = 1;
		for (int count = 1; count <= 10; count++)
			sum *= count;
		System.out.println(sum);
	}
}

//請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) 
//(用for迴圈)