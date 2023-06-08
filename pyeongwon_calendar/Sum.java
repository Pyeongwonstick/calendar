package pyeongwon_calendar;
import java.util.Scanner;
public class Sum{	
	public static void main(String[] args)
	{
		System.out.println("두 수를 입력하세요!");
		System.out.println(System.in);
		Scanner scanner = new Scanner(System.in);
		String Inputvalue = scanner.nextLine();
		String[] splitedvalue = Inputvalue.split(",");
		int first = Integer.parseInt(splitedvalue[0]);
		int second = Integer.parseInt(splitedvalue[1]);
		//System.out.println("두 수의 합:" + (first + second));
		System.out.printf("%d와 %d의 합은 %d입니다." , first, second, first + second);
		scanner.close();
		}
	
}