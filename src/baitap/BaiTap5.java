package baitap;

import java.util.ArrayList;
import java.util.Stack;

public class BaiTap5 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(5);
        list.add(6);
        list.add(12);
        for (Integer integer : list) {
            if (stack.isEmpty() || integer >= stack.get(stack.size() - 1)) {
                System.out.println("List " + integer);
                stack.push(integer);
            }
        }
        System.out.println("LN: "+stack.get(stack.size() - 1));
    }
}
