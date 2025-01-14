package org.example;

public class Main {
    public static int CalculateSumOf2DArray(String [][] ar) throws MyArraySizeException, MyArrayDataException {
        if (ar.length != 4) {
            throw new MyArraySizeException("Неверный размер массива: должно быть 4 строки.");
        }

        int sum = 0;
        for (int i = 0; i < ar.length; ++i) {
            int rowSize = ar[i].length;
            if (rowSize != 4) {
                throw new MyArraySizeException("Неверный размер массива: должно быть 4 столбца.");
            }
            for (int j = 0; j < rowSize; ++j) {
                try {
                    sum += Integer.parseInt(ar[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(
                            String.format("Ошибка в данных массива на позиции %d %d: %s не является числом.", i, j, ar[i][j])
                    );
                }
            }
        }
        return sum;
    }

    public static void test1() {
        String [][] ar = {{"123"},{"1","2"},{"3","4"}};
        try {
            int sum = CalculateSumOf2DArray(ar);
            System.out.printf("Сумма равна: %d%n", sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void test2() {
        String [][] ar = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        try {
            int sum = CalculateSumOf2DArray(ar);
            System.out.printf("Сумма равна: %d%n", sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void test3() {
        String [][] ar = {
                {"1", "2", "3", "4"},
                {"1", "2", "@", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        try {
            int sum = CalculateSumOf2DArray(ar);
            System.out.printf("Сумма равна: %d%n", sum);
        } catch (MyArraySizeException | MyArrayDataException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void  main(String[] args) {
        test1();
        test2();
        test3();
    }
}