package pyeongwon_calendar;
import java.util.Scanner;
public class Calendar2{
	private static final int[] MAX_DAYS ={31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int getMaxDaysofMonth(int month) {
		return MAX_DAYS[month -1];
	}
	public static void printCalendar() {
		
		System.out.println(" ");
		System.out.println(" 일 월  화  수  목 금  토 ");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
		
	}
		public static void main(String[] args) {
		//특정달의 최대일수 출력하기.
		System.out.println("달을 입력하세요.");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		Calendar2 cal = new Calendar2();
		
		System.out.printf("%d월의 최대일수는 %d일입니다.\n", month, cal.getMaxDaysofMonth(month));
		scanner.close();
		cal.printCalendar();
	
	}
}