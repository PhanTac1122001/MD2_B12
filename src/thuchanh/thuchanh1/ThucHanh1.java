package thuchanh.thuchanh1;

public class ThucHanh1 {
    private static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Kích thước của ngăn xếp sau thao tác đẩy: " + stack.size());
        System.out.println("1.2. Phần tử bật lên từ ngăn xếp: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3. Kích thước của ngăn xếp sau các thao tác pop : " + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1. Kích thước của ngăn xếp sau thao tác đẩy: " + stack.size());
        System.out.println("2.2. Phần tử bật lên từ ngăn xếp: ");
        while (!stack.isEmpty()) {
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Kích thước của ngăn xếp sau các thao tác pop : " + stack.size());
    }


    public static void main(String[] args) {
        System.out.println("1. Chồng số nguyên");
        stackOfIntegers();
        System.out.println("\n2. Stack of Strings");
        stackOfIStrings();
    }
}
