import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        int i = 1;
        int total = 0;
        System.out.print("Enter a number: ");
        number = input.nextInt();

       for (i = 1; i < number; i++){
           if (number % i == 0){
               total = total + i;
           }
       }
       if (total == number){
           System.out.print("This is a perfect number.");
       }
       else System.out.print("This is not a perfect number.");

        }


        }


