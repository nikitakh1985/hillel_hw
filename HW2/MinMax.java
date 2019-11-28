public class MinMax {   
   public static void main(String[] args) {

            double[] myArray = {11, 11, 11.7, 10, 13.2, 3, 2, 8, 9, 14};

        double max = myArray[0];
        double min = myArray[0];


        for (int i = 1; i < myArray.length; i++) {
            if (myArray[i] < max) {
                max = myArray[i];
            } else  if (myArray[i] > max) {
                min = myArray[i];
            }
        }
        System.out.println("Максимальное значение в массиве myArray: " + max);
        System.out.println("");
        System.out.println("Минимальное значение в массиве myArray: " + min);
    }

}