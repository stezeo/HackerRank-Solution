import java.util.Scanner;


/*
For the Purpose of Tutorial
 */
public class StoreNumbersInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int [] numberArray = new int [n];

        for (int i = 0; i < n; i++) {
            numberArray [i] = scanner.nextInt();
        }

        for (int i = 0; i < numberArray.length; i++) {
            System.out.println(numberArray[i]);
        }

    }
}
