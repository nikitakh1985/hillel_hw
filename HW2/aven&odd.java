public class Aven&odd {
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 9, 33, 66, 97, 27, 10};
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("even=" + a[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.println("odd=" + a[i] + " ");
            }
        }
    }
}