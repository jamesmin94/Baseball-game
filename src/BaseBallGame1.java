import java.util.Arrays;
import java.util.Scanner;

public class BaseBallGame1 {

	public static void main(String[] args) {

		int[] number = new int[3];
		Scanner scanner = new Scanner(System.in);
		int[] answer = new int[3];
		int strike = 0;
		int ball = 0;
		System.out.print("�Է����ּ��� "); 
		
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

			//// ��Ʈ����ũ (������ ��ġ�� ���� ������ ����)
			for (int i = 0; i < answer.length; i++) {
				for (int j = 0; j < number.length; j++) {

				}
				if (number[i] == answer[i]) {
//					System.out.print("��Ʈ����ũ");
					strike++;

				}

				else if (strike == 3) { 
				 
					System.exit(0);
				}

			}

			// �� --- ���ڸ� ������
			for (int i = 0; i < answer.length; i++) {
				int b = answer[i];

				for (int i1 = 0; i1 < number.length; i1++) {
					int c = number[i1];
					if (c == b) {
//						System.out.print("��");
						ball++;
					}

				}

			}

			if (ball >= 1) {
				System.out.println("���� " + ball + " �� �Դϴ�.");
			}
			if (strike >= 1) {
				System.out.println("���� " + strike + "��Ʈ����ũ �Դϴ�");
			}

		}

	}
}
