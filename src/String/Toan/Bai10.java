package String.Toan;
import java.util.Scanner;
public class Bai10 {

    public static void main(String[] args) {
        String s = nhapChuoi("Nhap vao chuoi S: ");
        String s1 = nhapChuoi("Nhap vao chuoi S1: ");
        String s2 = nhapChuoi("Nhap vao chuoi S2: ");
        String result = s.replace(s1, s2);
        System.out.println(result);
    }

    static String nhapChuoi(String message) {
        System.out.print(message);
        return new Scanner(System.in).nextLine();
    }
}