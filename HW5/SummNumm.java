public class test {
    static int summNumm(int n) {
        if (n < 10)
            return n;
        else
            return n % 10 + summNumm(n / 10);

    }

    public static void main(String[] args) {
        System.out.println(summNumm(215));
    }
}