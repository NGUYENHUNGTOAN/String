package String.Toan;
import java.util.Scanner;
public class Bai04 {

    public static void main(String[] args) {
        String str = nhapChuoi();
        System.out.println("Phan biet hoa thuong: So ki tu 'A' la: " +countWords(str, 'A', true ));
        System.out.println("Khong phan biet hoa thuong: So ki tu 'A' la: " +countWords(str, 'A', false ));
    }

    static String nhapChuoi() {
        System.out.print("Nhập vào một chuỗi: ");
        return new Scanner(System.in).nextLine();
    }

    public static int countWords(String str, char c, boolean index) {
        int count = 0;
        if (!index) {
            str = str.toLowerCase();
            int charInt = (int) c;
            if (charInt >= 65 && charInt <= 90) {
                c = (char) (charInt + 32);
            }
        }
        str = str.trim();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}