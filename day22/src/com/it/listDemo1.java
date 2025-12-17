package com.it;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class listDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");


        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        for (String s : list) {
            System.out.println(s);
        }

        /*list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });*/
        list.forEach(s->System.out.println(s));

        for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
        }

        ListIterator<String> ltit = list.listIterator();
        while (ltit.hasNext()) {
            String s = ltit.next();
            if ("李四".equals(s)) {
                ltit.add("赵六");
            }
            System.out.println(s);
        }
        System.out.println(list);
    }
}
