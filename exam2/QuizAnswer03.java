package exam;

import java.util.Arrays;
import java.util.Scanner;

public class QuizAnswer03 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 입력 받을 숫자의 개수 입력
        System.out.print("입력할 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];

        // 2. 숫자 입력받기
        System.out.println(count + "개의 숫자를 입력하세요:");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 3. 오름차순 정렬
        Arrays.sort(numbers);

        // 4. 정렬된 숫자 출력
        System.out.println("오름차순 정렬 결과:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
