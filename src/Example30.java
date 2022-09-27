import java.util.Scanner;
public class Example30 {
    public static void main(String[] argv) {

        Scanner inputValue;
        inputValue = new Scanner(System.in);

        int n;

        System.out.println("Enter a number");
        n = inputValue.nextInt();

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
