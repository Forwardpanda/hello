package com.book;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestBook {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> clazz = Class.forName("com.book.Book");
//      调用缺省无参的构造方法
        Object  book = clazz.newInstance();
        System.out.println(book);
//      调用指定的构造方法
        Constructor<?> constructor= clazz.getDeclaredConstructor(int.class,String.class,double.class,String.class);

        Object book1 = constructor.newInstance(2099,"天龙八部",2018.66,"查良镛");
        System.out.println(book1);

        //2-2属性的读写
        //2-2.1获取指定的属性
            Field idField = clazz.getDeclaredField("id");

            idField.setAccessible(true);

            idField.set(book,20190411);

            Object bookid=idField.get(book);
            System.out.println(bookid);


            //2-3方法的调用
          Method setNameMethod = clazz.getMethod("setName", String.class);

          Method getNameLengthMethod = clazz.getDeclaredMethod("getNameLength");

          setNameMethod.invoke(book,"笑傲江湖");


          getNameLengthMethod.setAccessible(true);

          Object  namelength =getNameLengthMethod.invoke(book);
          System.out.println(namelength);

          System.out.println(book);


    }
}

