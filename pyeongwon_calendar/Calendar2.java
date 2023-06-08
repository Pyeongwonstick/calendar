package pyeongwon_calendar;
import java.util.Scanner;
public class Calendar2{
	
	private static final int[] MAX_DAYS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; 
	// 깔금한 코드를 위해 메소드를 만들어준다. 1. 배열
	
	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS [month - 1]; 
	}

	public static void printCalendar() {
		System.out.println(" 일 월  화  수  목 금  토 ");
		System.out.println("---------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");
	}
	public static void main(String[] args) {
	
	System.out.println("달을 입력하세요!");
	System.out.println();
	Scanner scanner = new Scanner(System.in);
	Calendar2 cal = new Calendar2();
	int month = scanner.nextInt();

	System.out.printf("%d달의 최대일수는 %d이다.\n", month, cal.getMaxDaysOfMonth(month));
	cal.printCalendar();
	scanner.close();

	}
}	

