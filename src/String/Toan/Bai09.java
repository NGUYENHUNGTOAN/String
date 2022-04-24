package String.Toan;
import java.util.Scanner;
public class Bai09 {

    public static void main(String[] args) {
        String str = nhapChuoi();
        String[] words = tachTu(str);
        inMang(words);
       inMang(sapXep(words));
    }

    static String nhapChuoi() {
        System.out.print("Nhập vào một chuỗi: ");
        return new Scanner(System.in).nextLine();
    }

    static String[] tachTu(String str) {
        String[] tempArr = new String[100];
        str = str.trim();
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

    static String[] sapXep(String[] strs) {
        for (int i = 0; i < strs.length - 1; i++) {
            for (int j = i + 1; j < strs.length; j++) {
                if (strs[i].compareTo(strs[j]) > 0) {
                    String temp = strs[i];
                    strs[i] = strs[j];
                    strs[j] = temp;
                }
            }
        }
        return strs;
    }
}
