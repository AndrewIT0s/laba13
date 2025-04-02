import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер задания: ");
        int p = scanner.nextInt();
        switch (p) {
            case 1: {
                double a = 4.0 / 2.0 + Math.pow(3, 2);
                System.out.println("Ответ первого задания: " + a);
                break;
            }
            case 2: {
                int length = 10;
                int[] nums = new int[length];

                Random random = new Random();

                for (int i = 0; i < length; i++) {
                    nums[i] = random.nextInt(100);
                }
                for (int i = 0; i < nums.length; i++) {
                    System.out.print(nums[i] + " ");
                }
                for (int i = 0; i < nums.length; i+=2){
                    if (i%2==0){
                        System.out.println(nums[i] + " ");
                    }
                }
            }
        }
    }
}