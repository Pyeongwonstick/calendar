package pyeongwon_calendar;
import java.util.Scanner;
public class Calendar2{
	public static void main(String[] args) {
		//특정달의 최대일수 출력하기.
		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		int [] MAX_DAYS= {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		System.out.printf("%d월의 최대일수는 %d일입니다.", month, MAX_DAYS[month - 1]);
		scanner.close();
	}
}

