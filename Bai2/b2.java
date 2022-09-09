package Bai2;
import java.util.Scanner;
public class b2 {
	public static void main(String[] args)
	{
		try (Scanner nhap = new Scanner(System.in)) {
			// lấy giá trị nhập dữ liệu
			System.out.print("What Your Name?: ");
			String name = nhap.nextLine();
			System.out.print("How old are you?: ");
			int age = nhap.nextInt();
			System.out.println("Hello " + name + ", New Year, you'll be " + (age + 1));
		}
	}
}
