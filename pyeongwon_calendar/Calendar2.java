package pyeongwon_calendar;
import java.util.Scanner;
public class Calendar2 {

	public static void main(String[] args) {
		// ** 숫자를 입력 받아 해당하는 달력의 최대 일수를 출력하는 프로그램 만들기. **// 
		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int[] max_Days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
		
		System.out.printf("%d월은 %d까지 있습니다.", month, max_Days[month-1]);
		scanner.close();
	}

}
