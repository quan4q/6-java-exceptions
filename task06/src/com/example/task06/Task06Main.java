package com.example.task06;

import jdk.jfr.StackTrace;

public class Task06Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        new Task06Main().printMethodName();
         */
    }
    //Тесты проходят только, если добавить в самом тесте к \n еще и \r, возможно из за того то я на винде
    void printMethodName() {
        Exception ex = new Exception("Message");
        StackTraceElement[] elements = ex.getStackTrace();

        System.out.println(elements[1].getMethodName());
    }

}