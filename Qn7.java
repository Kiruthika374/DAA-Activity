import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int t = scanner.nextInt();
        
       
        for (int i = 0; i < t; i++) {
            String input = scanner.next();
            try {
                long number = Long.parseLong(input); 
                System.out.printf("%s can be fitted in:%n", number);
                
                if (number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            } catch (NumberFormatException e) {
                System.out.printf("%s can't be fitted anywhere.%n", input);
            }
        }
        
        scanner.close();
    }
}

