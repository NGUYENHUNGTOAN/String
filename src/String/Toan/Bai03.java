package String.Toan;

import java.util.Scanner;

public class
Bai03 {
    public static void main(String[] args) {
        String str = nhapChuoi();
        String keQua = loaiBoDauCach(str);
        System.out.println("Chuoi da loai bo dau cach: " + keQua);
        String st = xenKeHoaThuong(str);
        System.out.println(" Chuyen ki tu xen ke: " +st);
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
                if (i != 0 && str.charAt(i) != ' ') {
                    ketQua += c;
                } else {
                }
            }
        }
        return ketQua;
    }
    public static String xenKeHoaThuong(String str){
        String temp1 = "";
        String temp2 = loaiBoDauCach(str).toLowerCase();
        for (int i = 0; i < temp2.length(); i++) {
            char cTemp = temp2.charAt(i);
            if (i % 2 == 0){
                char c = temp2.charAt(i);
                int temp = (int) c - 32;
                cTemp = (char)temp;
            }
            temp1 += cTemp;
        }
        return temp1;
    }
}