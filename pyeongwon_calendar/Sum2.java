package pyeongwon_calendar;
import java.util.Scanner;
public class Sum2 {

	public static void main(String[] args) {
	System.out.println("두 수를 입력하세요.");
	int a,b;
	System.out.println(System.in);
	Scanner scanner = new Scanner(System.in);
	String  s1 , s2; 
	// int a,b;
	s1 = scanner.next();// nextLine -> next
	s2 = scanner.next();// nextLine -> next
	a = Integer.parseInt(s1);  
	b = Integer.parseInt(s2);
	//System.out.println("두 수의 합은 " + (a+b));
	System.out.printf("%d 와 %d의 합은 %d 입니다.", a, b, a+b);
	scanner.close(); 
	}

}
 