import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số 1 : ");
        int num1 = scanner.nextInt();
        System.out.println("nhập số 2 : ");
        int num2 = scanner.nextInt();
        if (num1 == num2) {
            System.out.println("ước chung lớn nhất của 2 số là : " + num1);
        } else {
            boolean check = true;
            int i;
            for (i = num2; i >= 1; i--) {
                if (num1 % i == 0 && num2 % i == 0) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("ước chung lớn nhất của 2 số là : " + i);
            }
        }
    }
}