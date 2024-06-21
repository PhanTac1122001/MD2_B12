package baitap;

import java.util.Scanner;
import java.util.Stack;

public class BaiTap1 {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập số lượng từ cần nhập: ");
        int number= Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < number; i++) {
            System.out.println("Nhập từ thứ "+(i+1)+":");
            String words=scanner.nextLine();
            stack.push(words);
        }
        System.out.println("Các từ theo thứ tự đảo ngược là:");
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}
