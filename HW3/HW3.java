	//1. Даны две последовательности целых чисел а1, а2, …, аn и c1, c2, …, ck, n ≥ k.
	//Выяснить, является ли вторая последовательность подпоследовательностью
	//первой. Например, последовательность 4, 6, 3 является подпоследовательностью последовательности 0, 2, 4, 6, 3, -1, 1.

    public static void main(String[] args) {
        int myArray1[] = {1, 4, 6, 7, 10, 11, 24, 6};
        int myArray2[] = {1, 4, 6, 7};
        int matches = 0;
        boolean PreviousMatch = false;
        for (int i = 0; i < myArray1.length; i++){
            if (matches == myArray2.length) {
                break;
            }
            if (!PreviousMatch) {
                matches = 0;
            }
         for (int j = 0; j <myArray2.length; j ++){
             if (myArray1[i] == myArray2[j]){
                 matches++;
                 PreviousMatch = true;
                 break;
             } else {
                 PreviousMatch = false;
             }
         }
        }
        if (matches == myArray2.length) {
            System.out.println("второй массив является последовательностью первого");
        } else {
            System.out.println("второй массив не является последовательностью первого");
        }
    }
	}


	//2. Задать массив с n чисел (используя инициализатор массива).
	// Найти самое короткое и самое длинное число. Вывести найденные числа и их длину

    public static void main(String[] args) {
        int myArray[] = {34, 56, 777, 45, 29, 56, 654, 76};
        int max = 0;
        int min = 0;
        int smallLength = 0;
        int bigLength =  2147483647;

        for (int value : myArray){
            int num = (int) Math.log10(value) + 1;

            if (num > smallLength) {
                max = value;
                smallLength = num;
            }
            if (num < bigLength) {
                min = value;
                bigLength = num;
            }
        }
        System.out.println("Первое самое длинное число: " + max + " " + "Его длинна" + smallLength);
        System.out.println("Первое самое короткое число: " + min + " " + "Его длинна" + bigLength);
    }
	}
	
	//3. Задать массив с n чисел (используя инициализатор массива). Найти числа, состоящее только из различных цифр.

            public static void main(String[] args) {
                int[] arr = {4, 5, 9, 33, 66, 97, 27, 10, 8777};
                for (int elem : arr) {
                    if (isDistinct(elem)) System.out.println(elem);
                }
            }
            private static boolean isDistinct(int x) {
                String s = String.valueOf(x);
                for (int i = 0; i < s.length() - 1; i++) {
                    for (int j = i + 1; j < s.length(); j++) {
                        if (s.charAt(i) == s.charAt(j)) return false;
                    }
                }
                return true;
            }
        }
		
	//4. Вывести числа от 1 до k в виде матрицы N x N слева направо и сверху вниз

    public static void main(String[] args) {
        int matrixSize = 17;
        double numberColuns = Math.sqrt(matrixSize);
        if (numberColuns % 1 != 0)
            numberColuns++;
        int matrixElement = 1;
            for (int i =0; i < (int) numberColuns; i++) {
            for (int j = 0; j < (int) numberColuns; j++){
                if ((matrixElement <= matrixSize) && matrixElement != 0) {
                    System.out.print(matrixElement + "\t");
                    matrixElement++;

                } else {
                    matrixElement = 0;
                    System.out.print(matrixElement + "\t");
                }
            }
            System.out.println();
        }

    }
}