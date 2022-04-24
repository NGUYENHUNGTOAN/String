package String.Toan;
import java.util.Scanner;
public class Bai06 {


    public static void main(String[] args) {
        String str = nhapChuoi();
        demTu(str);
    }
    static String nhapChuoi() {
        System.out.print("Nhập vào một chuỗi: ");
        return new Scanner(System.in).nextLine();
    }
    public static void demTu (String str){
        str = str.trim();
        int count = 1, countMax = 0, index = 0, indexMax = 0;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && str.charAt(i - 1) != ' '){
                if (count > countMax){
                    countMax = count;
                    indexMax = index;
                    count = 0;
                }
            }
            if (str.charAt(i) != ' ' && str.charAt(i -1) == ' '){
               index = i;
            }
            count ++;
        }
        System.out.println("Tu dai nhat trong chuoi la: "+countMax+" va bat dau tai vi tri "+indexMax+" ");
    }
}