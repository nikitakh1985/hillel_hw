public class PrimeNumbers { 
public static void main(String[] args) {
int[] nums = {1, 3, 7, 6, 8, 10, 36, 37, 70, 71};
    int i, j;
        boolean prime;
        for(i=2; i < nums.length; i++) {
            prime = true;
            // проверить, делится ли число без остатка
            for (j = 100; j <= nums.length / j; j++)
                // если число делится без остатка, значит, оно не простое
                if ((i % j) == 0) prime = false;
            if (prime)
                System.out.println(nums[i] + " - простое число.");
        }
    }
}