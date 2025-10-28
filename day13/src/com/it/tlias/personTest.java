package com.it.tlias;

public class personTest {
    public static void main(String[] args) {
        person p = new person("张三", 18);
        p.watch();
        student s = new student("李四", 19, "1班");
        s.fillForm();
        Teacher t = new Teacher("王五", 20, "教学部");
        t.publish();
    }
}
