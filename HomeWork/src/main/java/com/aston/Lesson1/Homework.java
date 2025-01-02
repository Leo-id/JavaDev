package com.aston.Lesson1;

import java.util.Arrays;

public class Homework {

    public static void turnString(String string) {  // Перевернуть строку и вывести на консоль
        StringBuilder result = new StringBuilder();
        for (int i = string.length(); i > 0; i--) {
            result.append(string.charAt(i - 1));
        }
        System.out.println(result);
    }

    public static void getDistinctNumbers(int[] ints) {  // Удалить дубликаты из массива и вывести в консоль
        Arrays.stream(ints).distinct().forEach(System.out::print);
        System.out.println();
    }

    public static Integer findSecondMaxElement(int[] arr) {      // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
        int max = arr[0];
        int SecondMax = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 1; i < arr.length; i++) {
            if (SecondMax < arr[i] && SecondMax < max) {
                SecondMax = arr[i];
            }
        }
        return SecondMax;
    }

    public static Integer lengthOfLastWord(String string) {// Найти длину последнего слова в строке. В строке только буквы и пробелы.
        String[] strings = string.split(" ");
        int lenght = strings.length;
        return strings[lenght - 1].length();
    }

    public static boolean isPalindrome(String string) { // Определить, что строка является палиндромом. Сложность по памяти O(1)

        for (int i = 0; i < string.length() / 2; i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {

        String string = "I love Java";
        turnString(string);

        int[] ints = {1, 2, 3, 4, 4};
        getDistinctNumbers(ints);

        int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
        System.out.println(findSecondMaxElement(arr));

        String st1 = "Hello world";
        String st2 = "    fly me    to the moon    ";
        System.out.println("Длина последнего слова - " + lengthOfLastWord(st1));
        System.out.println("Длина последнего слова - " + lengthOfLastWord(st2));

        String s1 = "abc";
        String s2 = "112233";
        String s3 = "aba";
        String s4 = "112211";
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
        System.out.println(isPalindrome(s3));
        System.out.println(isPalindrome(s4));
    }
}