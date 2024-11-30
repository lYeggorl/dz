package org.example;

public class Main {
    public static void main(String[] args) {
        printTreeWords();
        checkSumSign(10, 4);
        printColor(0);
        compareNumbers(1,1);
        trueOrFalse(10, 15);
        NegativePositiveNumber(-10);
        blalsa(0);
        cycle("String", 6);
        year(2024);
        list();
        listDo100();
        mult();
        doubleArr(5);
        generator(5,7);
    }

    public static void printTreeWords() {
        System.out.println("Orange \nBanana \nApple");
    }

    public static void checkSumSign(int a, int b) {
        if ((a + b) > 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void trueOrFalse(int a, int b) {
        int c = a + b;
        boolean result;
        if (c > 10 && c <= 20) {
            result = true;
        } else {
            result = false;
        }
        System.out.println(result);
    }

    public static void NegativePositiveNumber(int num) {
        if (num >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }

    public static void blalsa(int a) {
        boolean result;
        if (a >= 0) {
            result = false;
        } else {
            result = true;
        }
        System.out.println(result);
    }

    public static void cycle(String string, int len) {
        for (int a = 0; a < len; a++) {
            System.out.println(string);
        }
    }

    public static void year(int year) {
        boolean isYearLeap;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            isYearLeap = true;
        } else {
            isYearLeap = false;
        }
        System.out.println(isYearLeap);
    }

    public static void list() {
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void listDo100() {
        int[] arr = new int[101];
        for (int i = 0; i < 101; i++) {
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mult() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int length = arr.length;
        for (int i = 0; i < length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void doubleArr(int len) {
        int[][] arr = new int[len][len];
        int last = len - 1;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j || i == last - j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void generator(int len, int initialValue) {
        int [] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
}
