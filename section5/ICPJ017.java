import java.util.Scanner;
class ICPJ017 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		int[] height = new int[3];		//身長用の配列定義
		int[] weight = new int[3];		//体重用の配列定義
		int[] age    = new int[3];		//年齢用の配列定義

		for (int i = 0; i < 3; i++) {
			System.out.print("[" + (i + 1) + "] ");
			System.out.print("Please input his/her hight : ");	height[i] = stdIn.nextInt();
			System.out.print("Please input his/her weight: ");	weight[i] = stdIn.nextInt();
			System.out.print("Please input his/her age : ");	age[i]    = stdIn.nextInt();
		}
		// 身長の最大値を求める処理
		int maxHeight = height[0];
		if (height[1] > maxHeight) maxHeight = height[1];
		if (height[2] > maxHeight) maxHeight = height[2];
		// 体重の最大値を求める処理
		int maxWeight = weight[0];
		if (weight[1] > maxWeight) maxWeight = weight[1];
		if (weight[2] > maxWeight) maxWeight = weight[2];
		// 年齢の最大値を求める処理
		int maxAge = age[0];
		if (age[1] > maxAge) maxAge = age[1];
		if (age[2] > maxAge) maxAge = age[2];

		System.out.println("The maximum hight is " + maxHeight);
		System.out.println("The maximum weight is " + maxWeight);
		System.out.println("The maximum age is " + maxAge);
	}
}
