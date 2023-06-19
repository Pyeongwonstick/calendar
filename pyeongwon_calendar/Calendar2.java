package pyeongwon_calendar;

import java.util.Scanner;

public class Calendar2 {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void PrintCalendar() {

		System.out.println("");
		System.out.println(" 일 월  화  수  목 금  토 ");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

	}

	public static void main(String[] args) {
		// 숫자를 입력받아 입력받은 횟수만큼 최대일수 달을 출력.
		String PROMPT = "cal> ";
		Scanner scanner = new Scanner(System.in);
		Calendar2 cal = new Calendar2();
	
		int month = 1;
		
		while (true) {
			System.out.println("달을 입력하세요.");
			System.out.print(PROMPT);
			month = scanner.nextInt();
			if (month == -1) {
				break;
			}
			
			else if (month > 12) {
				continue;
			}
			
			System.out.printf("%d달의 최대일수는 %d입니다.\n", month, cal.getMaxDaysOfMonth(month));
		}
		System.out.println("THE END");
		scanner.close();
	}
}