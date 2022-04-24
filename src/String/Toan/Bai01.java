package String.Toan;
import java.util.Scanner;
public class Bai01 {

    public static void main(String[] args) {
        String str = nhapChuoi();
        String keQua = loaiBoDauCach(str);
        System.out.println("Chuoi da loai bo dau cach: " + keQua);
        int demtu = demTu(keQua);
        System.out.println("So tu trong xau ki tu la: " + demtu);
    }

    static String nhapChuoi() {
        System.out.print("Nhập vào một chuỗi: ");
        return new Scanner(System.in).nextLine();
    }

    public static String loaiBoDauCach(String str) {
        String strAfterTrim = str.trim();
        System.out.println("\"" + strAfterTrim + "\"");
        String ketQua = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                ketQua += c;
            } else {
                if (i != 0 && str.charAt(i - 1) != ' ') {
                    ketQua += c;
                } else {
                }
            }
        }
        return ketQua;
    }
   public static int demTu (String str) {
       int dem = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                dem++;
            }
        }
        return dem + 1;
    }
}