import java.util.Scanner;

public class Cau5 {
    boolean kiemtranguyento(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        System.out.println("Kiem tra so nguyen to \n");
        System.out.println("Nhap vao so nguyen duong \n");
        int n = s.nextInt();
        Cau5 snt = new Cau5();
        if (snt.kiemtranguyento(n)) {
            System.out.println("So : " + n + " la so nguyen to");
        } else {
            System.out.println("So : " + n + " khong phai la so nguyen to");
        }
    }
}

