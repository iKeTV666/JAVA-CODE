package com.it;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class iteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("aaa");
        coll.add("bbb");
        coll.add("ccc");
        coll.add("ddd");
        Iterator<String> it = coll.iterator();
        while (it.hasNext()){
            String str = it.next();
            if ("ddd".equals(str)){
                it.remove();
            }

        }
        System.out.println(coll);
    }
}
