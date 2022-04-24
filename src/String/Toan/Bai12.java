package String.Toan;
import java.util.Scanner;
public class Bai12 {

    public static void main(String[] args) {
        String str = nhapChuoi();
        String[] words = tachTu(str);
        inMang(words);
        System.out.println("Email thu duoc la: " +email(words));
    }
    static String email(String[] words){
        String email = words[words.length-1];
        for (int i = 0; i < words.length-1; i++) {
            email += words[i].charAt(0);
        }
        return email + "@company.vn";
    }

    static String nhapChuoi() {
        System.out.print("Nhập vào một chuỗi: ");
        return new Scanner(System.in).nextLine();
    }

    static String[] tachTu(String str) {
        String[] tempArr = new String[100];
        str = str.trim().toLowerCase();
        String temp = String.valueOf(str.charAt(0));
        int k = 0;
        for (int i = 1; i < str.length(); i++) {
            if ((str.charAt(i) == ' ' && str.charAt(i - 1) != ' ') || i == str.length() - 1) {
                if (i == str.length() - 1) {
                    temp += str.charAt(str.length() - 1);
                }
                tempArr[k] = temp;
                temp = "";
                k++;
            }
            if (str.charAt(i) != ' ') {
                temp += str.charAt(i);
            }
        }
        String[] result = new String[k];
        int index = 0;
        for (int i = 0; i < tempArr.length; i++) {
            if (tempArr[i] == null){
                continue;
            }
            result[index] = tempArr[i];
            index++;
        }
        return result;
    }

    static void inMang(String[] strs) {
        System.out.print("[ ");
        for (int i = 0; i < strs.length; i++) {
            if (strs[i] != null) {
                System.out.print(strs[i] + " ");
            }
        }
        System.out.println(" ]");
    }

}
