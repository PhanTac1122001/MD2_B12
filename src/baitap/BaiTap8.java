package baitap;

import java.util.Scanner;
import java.util.Stack;

public class BaiTap8 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string to check is Number or not");
        String str = sc.nextLine();
        String input1 = "adadasda";
        String input2 = "1231254123";
        String input3 = "s54212";

        for (char ch : str.toCharArray()) {
            if (Character.isDigit(ch)) {
                stack.push(Character.getNumericValue(ch));
            }
        }


        if(stack.isEmpty()){
            System.out.println("Stack is empty");
        }else {
            boolean allNumIsPrime = true;
            while (!stack.isEmpty()) {
                int num = stack.pop();

                if (!isPrime(num)) {
                    allNumIsPrime = false;
                    break;
                }
            }

            if (allNumIsPrime) {
                System.out.println("Stack has all number are Prime");
            }else {
                System.out.println("Stack has all number are not Prime");
            }
        }
    }

    public static boolean isPrime(int num) {
        if (num < 1) {

            return false;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
