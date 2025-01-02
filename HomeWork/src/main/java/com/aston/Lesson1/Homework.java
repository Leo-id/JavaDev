package com.aston.Lesson1;

public class Homework {

    public static void turnString(String string) {  // Перевернуть строку и вывести на консоль
        StringBuilder result= new StringBuilder();
        for (int i = string.length(); i >0 ; i--) {
            result.append(string.charAt(i - 1));
        }
        System.out.println(result);
    }



    public static void getDistinctNumbers(int[] ints) {  // Удалить дубликаты из массива и вывести в консоль

    }



    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static Integer findSecondMaxElement(int[] arr) {
        return null;
    }

    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static Integer lengthOfLastWord(String string) {
        return null;
    }

    // Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public static boolean isPalindrome(String string) {
        return false;
    }

    public static void main(String[] args) {
        turnString("I love Java");

        int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
        getDistinctNumbers(ints);
    }
}