import java.util.Arrays;
import java.util.Scanner;

public class BaseBallGame1 {

	public static void main(String[] args) {

		int[] number = new int[3];
		Scanner scanner = new Scanner(System.in);
		int[] answer = new int[3];
		int strike = 0;
		int ball = 0;
		System.out.print("입력해주세요 "); 
		
		for (;;) {
			
			
			for (int i = 0; i < answer.length; i++) {
				answer[i] = scanner.nextInt();

			}

			for (int i = 0; i < number.length; i++) {
				number[i] = ((int) (Math.random() * 9));
				for (int j = 0; j < i; j++) {
					if (number[i] == number[j]) {
						i--;
						break;
					}

				}

			}
			for (int i = 0; i < number.length; i++) {
				System.out.print(number[i] + " ");

			}
			System.out.println();

			//// 스트라이크 (숫자의 위치와 값이 같을떄 조건)
			for (int i = 0; i < answer.length; i++) {
				for (int j = 0; j < number.length; j++) {

				}
				if (number[i] == answer[i]) {
//					System.out.print("스트라이크");
					strike++;

				}

				else if (strike == 3) { 
				 
					System.exit(0);
				}

			}

			// 볼 --- 숫자만 같을떄
			for (int i = 0; i < answer.length; i++) {
				int b = answer[i];

				for (int i1 = 0; i1 < number.length; i1++) {
					int c = number[i1];
					if (c == b) {
//						System.out.print("볼");
						ball++;
					}

				}

			}

			if (ball >= 1) {
				System.out.println("현재 " + ball + " 볼 입니다.");
			}
			if (strike >= 1) {
				System.out.println("현재 " + strike + "스트라이크 입니다");
			}

		}

	}
}
