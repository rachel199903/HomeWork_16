//一：使用for迴圈 + while迴圈 建立九九乘法表
package hw2;

public class TestNineNine {

	public static void main(String[] args){
		for( int i =1; i <= 9; i++) {
			int j =1;
			while(j <= 9) {
				int v =i * j;
				System.out.print(i + "x" + j + "=" + v + "\t");
				j++;
			}
			System.out.println();
		}
	}
}

//二：使用for迴圈 + do while迴圈 建立九九乘法表
//package hw2;
//
//public class TestNineNine{
//	
//	public static void main(String[] args) {
//		for(int i = 1;i <= 9; i++) {
//			int j =1;
//			do {
//				int v = i * j;
//				System.out.print(i + "x" + j + "=" + v + "\t");
//				j++;
//			}while(j <= 9);
//			System.out.println();
//		}
//	}
//	
//}

//三：使用while迴圈 + do while迴圈 建立九九乘法表
//package hw2;
//
//public class TestNineNine {
//
//	public static void main(String[] args) {
//		int i = 1;
//		while (i <= 9) {
//			int j = 1;
//			do {
//				int v = i * j;
//				System.out.print(i + " x " + j + " = " + v + "\t");
//				j++;
//			} while (j <= 9);
//			System.out.println();
//			i++;
//		}
//	}
//}
