package com.aston.MyArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

/**
 * Класс для тестирования MyArrayList и всех его методов
 */

public class MainTest {
    public static void main(String[] args) {

        /**
         * Создаем MyArryList1 и добавляем в него 100000 элементов
         * затем удаляем второй элемент
         * выводим на экран
         * и проверяем пустой лист или нет (должно быть false)
         */
        MyArryList<String> myArryList1 = new MyArryList<>();

        for (int i = 0; i < 100000; i++) {
            myArryList1.add("mama" + i);
        }
        myArryList1.remove(1);
        myArryList1.print();
        System.out.println(myArryList1.isEmpty());

        /**
         * Создаем MyArryList2 и добавляем в него 5 int элементов
         * выводим на экран
         * производим сортировку
         * выводим на экран
         * очищаем всю коллекцию
         * выводим на экран
         * и проверяем пустой лист или нет (должно быть true)
         */

        MyArryList<Integer> myArryList2 = new MyArryList<>();
        myArryList2.add(5);
        myArryList2.add(2);
        myArryList2.add(9);
        myArryList2.add(8);
        myArryList2.add(2);
        myArryList2.add(5);
        myArryList2.print();
        MyCollections.sort(myArryList2, Comparator.naturalOrder());
        myArryList2.print();
        myArryList2.clear();
        myArryList2.print();
        System.out.println(myArryList2.isEmpty());

        /**
         * Создаем MyArryList3 и добавляем в него 4 String элемента
         * выводим на экран
         * производим сортировку
         * выводим на экран
         */


        MyArryList myArryList3 = new MyArryList<>();
        myArryList3.add("Привет! ");
        myArryList3.add("Меня ");
        myArryList3.add("зовут ");
        myArryList3.add("Костя!");
        myArryList3.print();
        MyCollections.sort(myArryList3, Comparator.comparing(Object::toString));
        myArryList3.print();

    }


}

