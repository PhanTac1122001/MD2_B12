package baitap;

import java.util.ArrayList;
import java.util.Stack;

public class BaiTap6 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(3);
        list.add(3);
        list.add(7);
        list.add(12);
        list.add(41);
        list.add(7);
        list.add(22);
        for (Integer integer : list) {
            if (stack.isEmpty() || integer <= stack.get(stack.size() - 1)) {
                System.out.println("List " + integer);
                stack.push(integer);
            }
        }
        System.out.println("BN: "+stack.get(stack.size() - 1));
    }
}
