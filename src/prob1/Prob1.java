package prob1;
import java.util.Scanner;


public class Prob1 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner( System.in );
		System.out.print( "문자열을 입력하세요:" );
		
		String s = scanner.nextLine();
        /*  구현합니다. */
        String output = s;
        for (int i = 0; i <= s.length(); i++ ) {
            s = s.toUpperCase();
            System.out.println(s.substring(0, i));
        }
	}

}
