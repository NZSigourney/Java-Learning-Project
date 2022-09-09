package Bai2;
import java.util.Scanner;
public class b3 {
	public static void main(String[] args) {
		try(Scanner in = new Scanner(System.in)){
			System.out.print("Nhap Ho Ten sinh Vien:\t");
			String hoten = in.nextLine();
			
			System.out.println("Nhap diem toan:\t");
			float toan = in.nextFloat();
			System.out.println("Nhap diem ly:\t");
			float ly = in.nextFloat();
			System.out.println("Nhap diem hoa:\t");
			float hoa = in.nextFloat();
			float diemTB = (toan + ly + hoa)/3;
			System.out.print("Diem Trung binh cua sinh vien " + hoten + " la:\r");
			System.out.println(diemTB);
		}
	}
}