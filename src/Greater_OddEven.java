public class Greater_OddEven {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;

        System.out.println("Even Numbers:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                x = i+x;
                System.out.println(i);
            }else {
                y = i+y;
            }
        }
        System.out.println("Odd numbers:");
        for (int i = 1; i < 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println("Sum of even number:" +x);
        System.out.println("Sum of even number:" +y);
    }
}