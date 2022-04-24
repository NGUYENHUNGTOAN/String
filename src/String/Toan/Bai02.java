package String.Toan;

public class Bai02 {

    public static void main(String[] args) {
        System.out.println("Cac so thuan nghich can tim la: ");
        for (int i = 100000; i <= 999999; i++) {
            if (thuanNghich(i)) System.out.println(i + " ");
        }
        for (int i = 100000; i <= 999999; i++) {
            if (checkThuanNghich(i)) ;
            System.out.println(i + " ");
        }
    }

    public static boolean thuanNghich(int n) {
        int temp = 0;
        int tn = n;
        while (n > 0) {
            temp = temp * 10 + n % 10;
            n /= 10;
        }
        if (temp == tn) return true;
        return false;
    }

    public static boolean checkThuanNghich(int n) {
        String str = "";
        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i)) {
                return false;
            }
        }
        return true;
    }
}
