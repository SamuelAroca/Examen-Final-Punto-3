import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe el número: ");
        int number = scanner.nextInt();

        String stringNumber = String.valueOf(number);
        int[] array = new int[stringNumber.length()];

        for (int i = 0; i < stringNumber.length(); i++) {
            array[i] = Character.getNumericValue(stringNumber.charAt(i));
        }
        List<String> numbers = new ArrayList<>();
        for (Integer arrayNumber : array) {
            if (arrayNumber < 0 || arrayNumber > 7) {
                System.out.println("El numero solo puede contener numeros entre 0 y 7: " + arrayNumber);
                return;
            }
            if (arrayNumber == 0) {
                String num = "000";
                numbers.add(num);
            } else if (arrayNumber == 1) {
                String num = "001";
                numbers.add(num);
            } else if (arrayNumber == 2) {
                String num = "010";
                numbers.add(num);
            } else if (arrayNumber == 3) {
                String num = "011";
                numbers.add(num);
            } else if (arrayNumber == 4) {
                String num = "100";
                numbers.add(num);
            } else if (arrayNumber == 5) {
                String num = "101";
                numbers.add(num);
            } else if (arrayNumber == 6) {
                String num = "110";
                numbers.add(num);
            } else {
                String num = "111";
                numbers.add(num);
            }
        }
        for (String finalNumber : numbers) {
            System.out.print(finalNumber);
        }
    }
}
