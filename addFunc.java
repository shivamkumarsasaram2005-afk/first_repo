import java.util.Scanner;

public class addFunc {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter second Number : ");
        int b = sc.nextInt();

        int result = add(a, b);

        System.out.print("Additon of " + a +  " and " + b +  " = " + result);
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
