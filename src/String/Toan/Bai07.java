package String.Toan;
import java.util.Scanner;
public class Bai07 {
    public static void main(String[] args) {
        nhapchuoi("Nhap xau ki tu: ");
    }

    static void nhapchuoi(String message) {
        System.out.print(message);
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        System.out.print("Xau ban dau: " + str + " \n");
        tachTu(str);
        System.out.println("");
    }

    static void tachTu(String s) {
        String[] str;
        str = s.split(" ");
        System.out.print("Xau sau khi dao vi tri: " + str[str.length - 1] + " ");
        for (int i = 1; i < str.length - 1; i++) {
            System.out.print(str[0]+" ");
            System.out.print(str[i]);
        }
    }
}