package Bai2;
import java.util.Scanner;
public class nguyenTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(Scanner nhap = new Scanner(System.in)){
			System.out.print("Nhap so nguyen to:\s");
			int number = nhap.nextInt();
			System.out.println(number);
		}
	}
}