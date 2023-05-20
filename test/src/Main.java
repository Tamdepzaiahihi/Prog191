import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        question_05();
    }

    /*   Question 01:
          Write a program that get three integers from the user
          and then prints them out in ascending order.*/
    public static void question_01() {
        Scanner in = new Scanner(System.in);
        int[] number = new int[3];

        for (int i = 0; i < number.length; i++) {
            System.out.printf("Please enter number %d: ", i + 1);
            number[i] = in.nextInt();
        }
        System.out.printf("\nReverse order: ");
        for (int i = number.length - 1; i >= 0; i--) {
            System.out.print(number[i] + " ");
        }
    }

    /*Question 02:
     Write a program that repeatedly prompts the user to enter a positive integer
     and checks whether the number is divisible by both 5 and 6,
     or neither of them, or just one of them.
     The program ends when the user enters a negative integer or zero.
     */
    public static void question_02() {
        Scanner in = new Scanner(System.in);

        while (true)  {
            System.out.print("Please enter a number: ");
            int number = in.nextInt();

            if (number < 0){
                break;
            }
           if (number % 5 == 0){
               if (number % 6 == 0){
                   System.out.println("This number is divisible by both 5 and 6");
               }
               else {
                   System.out.println("This number is divisible by only 5");
               }
           }else {
               if (number % 6 == 0){
                   System.out.println("This number is divisible by only 6");
               }
               else {
                   System.out.println("This number is not divisible by both 5 and 6");
               }
           }
        }
    }
/* Question 05:
    Write a program that prompts the user to enter an integer from 1 to 15
    and displays a pyramid, as shown in the following sample run:*/
    public static void question_05() {
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter number: ");
        int number = in.nextInt();

        for (int i = 1; i <= number ; i++) {
            for (int j = i; j >number -i ; ++j) {
                System.out.print(j + "\t");
            }
            for (int j = i; j > i ; --j) {
                System.out.print(j + "\t");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}

