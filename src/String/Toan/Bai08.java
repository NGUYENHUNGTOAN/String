package String.Toan;
import java.util.Scanner;

public class Bai08 {

    public static void main(String[] args) {
        nhapchuoi("Nhap xau ki tu: ");
    }
    static void nhapchuoi(String message) {
        System.out.print(message);
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        System.out.print("Xau ban dau: " + s + " \n");
        tachTu(s);
        System.out.println("");
    }

    static void tachTu(String s) {
        String[] ss;
        ss = s.split(" ");
        System.out.print("Xau sau khi dao vi tri: " + ss[ss.length - 1] + " ");
        for (int i = 1; i < ss.length - 1; i++) {
            System.out.print(ss[i] + " ");
            System.out.print(ss[0]);
        }
    }
}