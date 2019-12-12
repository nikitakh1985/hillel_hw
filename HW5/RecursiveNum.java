public class test {
    public static void main(String[] args) {
        number(0);
    }

    private static void number(int n) {
        if (n == 5)
            return;
        System.out.println(n);
        number(n + 1);
    }
}